package com.whale.eos.basic.util.persistance;

import com.google.common.collect.Maps;
import org.apache.commons.lang3.StringUtils;

import java.util.Date;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: zhanghong
 * Date: 13-4-28
 * Time: 下午12:02
 */
public class SearchFilter {


    public enum OperatorEnum {
        EQ, LIKE, GT, LT, GTE, LTE/*,countDistinct,sum*/
    }

    public String fieldName;
    public Object value;
    public OperatorEnum operatorEnum;

    public SearchFilter(String fieldName, OperatorEnum operatorEnum, Object value) {
        this.fieldName = fieldName;
        this.value = value;
        this.operatorEnum = operatorEnum;
    }

    /**
     * searchParams中key的格式为OPERATOR_FIELDNAME
     */
    public static Map<String, SearchFilter> parse(Map<String, Object> searchParams) {
        Map<String, SearchFilter> filters = Maps.newHashMap();

        for (Map.Entry<String, Object> entry : searchParams.entrySet()) {
            // 过滤掉空值
            String key = entry.getKey();
            Object value = entry.getValue();
            if (null == value || StringUtils.isBlank(String.valueOf(value))) {
                continue;
            }

            // 拆分operator与filedAttribute
            String[] names = StringUtils.split(key, "_");
            if (names.length != 2) {
                throw new IllegalArgumentException(key + " is not a valid search filter name");
            }
            String filedName = names[1];
            OperatorEnum operator = OperatorEnum.valueOf(names[0]);

            // 创建searchFilter
            SearchFilter filter = new SearchFilter(filedName, operator, value);
            filters.put(key, filter);
        }

        return filters;
    }
}
