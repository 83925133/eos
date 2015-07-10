package com.whale.eos.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: swen
 * Date: 13-4-8
 * Time: 下午5:13
 * <p/>
 * 统一定义id的entity基类.
 * <p/>
 * 基类统一定义id的属性名称、数据类型、列名映射及生成策略.
 * Oracle需要每个Entity独立定义id的SEQUCENCE时，不继承于本类而改为实现一个Idable的接口。
 * :该类不用，改用IdWorker。
 */
//JPA 基类的标识
@MappedSuperclass
public abstract class IdEntity {

    protected String id;

    @Id
    @GenericGenerator(name = "idGenerator", strategy = "uuid") //这个是hibernate的注解
    @GeneratedValue(generator = "idGenerator") //使用uuid的生成策略
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}