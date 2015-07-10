package com.whale.eos.basic.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.whale.eos.exception.ModelException;

public final class ClassUtil
{
  protected static final Logger LOGGER = LoggerFactory.getLogger(ClassUtil.class);

  public static List<Field> getFieldByClass(Class<?> byClass)
  {
    return getFieldByClass(byClass, null);
  }

  public static List<Field> getFieldByClass(Class<?> byClass, ClassFieldFilter classFieldFilter)
  {
    List lstField = new ArrayList(10);
    if (byClass.getSuperclass() != Object.class) {
      lstField.addAll(getFieldByClass(byClass.getSuperclass()));
    }
    Field[] objFields = byClass.getDeclaredFields();
    for (Field objField : objFields) {
      if (classFieldFilter != null) {
        if (classFieldFilter.isFilter(byClass, objField))
          lstField.add(objField);
      }
      else {
        lstField.add(objField);
      }
    }
    return lstField;
  }

  public static Field getFieldByName(Class<?> byClass, String fieldName)
  {
    Field objResultField = null;
    try {
      objResultField = byClass.getDeclaredField(fieldName);
    } catch (NoSuchFieldException e) {
      LOGGER.debug(byClass + "类中找不到字段" + fieldName);
    }
    if ((objResultField == null) && 
      (byClass.getSuperclass() != Object.class)) {
      objResultField = getFieldByName(byClass.getSuperclass(), fieldName);
    }

    return objResultField;
  }

  public static <T > String getTableName(T t)
  {
    return getTableName(t.getClass());
  }

  public static <T > String getTableName(Class<T> clazz)
  {
    String objResult = null;
    if (clazz.isAnnotationPresent(Table.class)) {
      Table objTableAnnotation = (Table)clazz.getAnnotation(Table.class);
      objResult = objTableAnnotation.name();
      if (StringUtil.isEmpty(objResult)) {
        objResult = clazz.getSimpleName();
      }
    }
    return objResult;
  }

  public static <T > String getEntityName(T t)
  {
    return getEntityName(t.getClass());
  }

  public static <T > String getEntityName(Class<T> clazz)
  {
    String objResult = null;
    if (clazz.isAnnotationPresent(Entity.class)) {
      Entity objEntityAnnotation = (Entity)clazz.getAnnotation(Entity.class);
      objResult = objEntityAnnotation.name();
      if (StringUtil.isEmpty(objResult)) {
        objResult = clazz.getSimpleName();
      }
    }
    return objResult;
  }

  public static <T > String getPrimaryKeyName(T t)
  {
    return getPrimaryKeyName(t.getClass());
  }

  public static <T > String getPrimaryKeyName(Class<T> clazz)
  {
    Object objResult = null;
    Field[] objFields = clazz.getDeclaredFields();
    for (Field objField : objFields) {
      if (!objField.isAnnotationPresent(Id.class)) continue;
      try {
        objField.setAccessible(true);
        objResult = objField.getName();
      } catch (SecurityException e) {
        throw new ModelException("反射获取主键属性名称" + objField.getName() + "时出错", e);
      }
    }

    return objResult != null ? objResult.toString() : "";
  }

  public static <T > String getPrimaryKeyValue(T t)
  {
    Object objResult = null;
    Field[] objFields = t.getClass().getDeclaredFields();
    for (Field objField : objFields) {
      if (!objField.isAnnotationPresent(Id.class)) continue;
      try {
        objField.setAccessible(true);
        objResult = objField.get(t);
      } catch (IllegalAccessException e) {
        throw new ModelException("反射获取主键属性" + objField.getName() + "值时出错", e);
      }
    }

    return objResult != null ? objResult.toString() : "";
  }
}
