package com.whale.eos.basic.util.spring;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

/**
 * User: 李建东
 * Date: 2015-6-20
 * Time: 上午11:01
 */
public class PropertyUtil extends PropertyPlaceholderConfigurer implements Map<String, String> {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass().getName());
	private static Map<String, String> ctxPropertiesMap;

	protected void processProperties( ConfigurableListableBeanFactory beanFactoryToProcess,
			Properties props) throws BeansException {
		super.processProperties(beanFactoryToProcess, props);
		if (ctxPropertiesMap != null) {
			logger.warn("The property map will be override!");
		}
		ctxPropertiesMap = new HashMap<String, String>();
		for (Object key : props.keySet()) {
			String name = key.toString();
			String value = props.getProperty(name);
			ctxPropertiesMap.put(name, value);
		}
	}

	public static String getString(String name) {
		if (ctxPropertiesMap == null) {
			ctxPropertiesMap = new HashMap<String, String>();
		}
		return (String) ctxPropertiesMap.get(name);
	}

	public static boolean getBoolean(String name, boolean defaultValue) {
		String v = getString(name);
		if (v == null) {
			return defaultValue;
		}
		try {
			return Boolean.parseBoolean(v);
		} catch (Exception e) {
		}
		return defaultValue;
	}
	
	public static boolean getBoolean(String name) {
		return getBoolean(name, false);
	}
	

	public static int getIntValue(String name, int defaultValue) {
		String v = getString(name);
		if (v == null) {
			return defaultValue;
		}
		try {
			return Integer.parseInt(v);
		} catch (Exception e) {
		}
		return defaultValue;
	}

	public static int getIntValue(String name) {
		return getIntValue(name, 0);
	}
	
	public static long getLongValue(String name, long defaultValue) {
		String v = getString(name);
		if (v == null) {
			return defaultValue;
		}
		try {
			return Long.parseLong(v);
		} catch (Exception e) {
		}
		return defaultValue;
	}
	
	public static long getLongValue(String name) {
		return getLongValue(name, 0);
	}
	
	public static short getShortValue(String name, short defaultValue) {
		String v = getString(name);
		if (v == null) {
			return defaultValue;
		}
		try {
			return Short.parseShort(v);
		} catch (Exception e) {
		}
		return defaultValue;
	}
	
	public static short getShortValue(String name) {
		return getShortValue(name, (short) 0);
	}

	public static double getDoubleValue(String name, double defaultValue) {
		String v = getString(name);
		if (v == null) {
			return defaultValue;
		}
		try {
			return Double.parseDouble(v);
		} catch (Exception e) {
		}
		return defaultValue;
	}
	
	public static double getDoubleValue(String name) {
		return getDoubleValue(name, (double) 0);
	}
	
	public static float getFloatValue(String name, float defaultValue) {
		String v = getString(name);
		if (v == null) {
			return defaultValue;
		}
		try {
			return Float.parseFloat(v);
		} catch (Exception e) {
		}
		return defaultValue;
	}
	public static float getFloatValue(String name) {
		return getFloatValue(name, (float) 0);
	}

	public int size() {
		return ctxPropertiesMap.size();
	}

	public boolean isEmpty() {
		return ctxPropertiesMap.isEmpty();
	}

	public boolean containsKey(Object key) {
		return ctxPropertiesMap.containsKey(key);
	}

	public boolean containsValue(Object value) {
		throw new UnsupportedOperationException();
	}

	public String put(String key, String value) {
		throw new UnsupportedOperationException();
	}

	public String remove(Object key) {
		throw new UnsupportedOperationException();
	}

	public void putAll(Map<? extends String, ? extends String> m) {
		throw new UnsupportedOperationException();
	}

	public void clear() {
		throw new UnsupportedOperationException();
	}

	public Set<String> keySet() {
		throw new UnsupportedOperationException();
	}

	public Collection<String> values() {
		throw new UnsupportedOperationException();
	}

	public Set<Map.Entry<String, String>> entrySet() {
		throw new UnsupportedOperationException();
	}

	public String get(Object key) {
		return (String) ctxPropertiesMap.get(key);
	}
}
