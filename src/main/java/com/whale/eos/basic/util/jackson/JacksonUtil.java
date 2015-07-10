package com.whale.eos.basic.util.jackson;


import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: swen
 * Date: 12-7-12
 * Time: 上午10:59
 * To change this template use File | Settings | File Templates.
 */
public class JacksonUtil {

    private final static Logger logger = LoggerFactory.getLogger(JacksonUtil.class);

    // ObjectMapper重用方式
    private static ObjectMapper mapper = new ObjectMapper();
    static {
        mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
    }

    public static String toJsonString(Map<String, Object> dataMap) {
        if (dataMap == null || dataMap.size() == 0) return null;
        StringWriter writer = new StringWriter();
        //        mapper.set
        try {
            mapper.writeValue(writer, dataMap);
        } catch (JsonGenerationException e) {
            logger.error(e.toString());
        } catch (JsonMappingException e) {
            logger.error(e.toString());
        } catch (IOException e) {
            logger.error(e.toString());
        }
        String rsp = writer.toString();
        if (rsp != null) {
            rsp = rsp.replaceAll(":null", ":\"\"");
            rsp = rsp.replaceAll("\"null\"", "\"\"");
        }
        return rsp;
    }

    public static Map toJsonDataMap(String str) {
        if (StringUtils.isBlank(str)) return new HashMap();
        Map<String, Object> dataMap = null;
        try {
            if (str.indexOf("{") < 0) {
                return new HashMap();
            }
            dataMap = mapper.readValue(str, Map.class);
        } catch (IOException e) {
            logger.error(e.toString());
        }
        return dataMap;
    }

    /**
     * json转换为java对象
     * <p/>
     * <pre>
     * return JackJson.fromJsonToObject(this.answersJson, JackJson.class);
     * </pre>
     *
     * @param <T>       要转换的对象
     * @param json      字符串
     * @param valueType 对象的class
     * @return 返回对象
     */
    public static <T> T fromJsonToObject(String json, Class<T> valueType) {
        if (StringUtils.isBlank(json)) return null;
        try {
            return mapper.readValue(json, valueType);
        } catch (JsonParseException e) {
            logger.error("JsonParseException: ", e);
        } catch (JsonMappingException e) {
            logger.error("JsonMappingException: ", e);
        } catch (IOException e) {
            logger.error("IOException: ", e);
        }
        return null;
    }

    /**
     * java对象转换为json字符串
     *
     * @param object Java对象
     * @return 返回字符串
     */
    public static String fromObjectToJson(Object object) {
        String rsp = null;
        try {
            rsp = mapper.writeValueAsString(object);
        } catch (JsonGenerationException e) {
            logger.error("JsonGenerationException: ", e);
        } catch (JsonMappingException e) {
            logger.error("JsonMappingException: ", e);
        } catch (IOException e) {
            logger.error("IOException: ", e);
        }
        if (rsp != null) {
            rsp = rsp.replaceAll(":null", ":\"\"");
            rsp = rsp.replaceAll("\"null\"", "\"\"");
        }
        return rsp;
    }

    public static void main(String[] args) {
        String rsp = "{\"bank_name\":null,\"idcard\":null,\"jsessionid\":\"C9D06CE0323FB7BA0AC35173D773743F\",\"code\":\"000\",\"account_name\":null,\"balance\":\"2\",\"bank_card\":null,\"email\":null,\"real_name\":null,\"bank_province\":\"0\",\"bank_address\":null,\"bank_province_name\":\"?..涔.,\"server_status\":\"1\",\"note\":\"\",\"qq\":\"null\"}";
        if (rsp != null) {
            rsp = rsp.replaceAll(":null", ":\"\"");
            rsp = rsp.replaceAll("\"null\"", "\"\"");
        }
        System.out.println("rsp = " + rsp);
    }
}
