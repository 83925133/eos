package com.whale.eos.basic.util;

import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.poi.ss.formula.functions.T;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.whale.eos.exception.SystemException;


/**
 * @author plh
 */
public class WebUtils {
	
    private static final Logger logger = LoggerFactory.getLogger(WebUtils.class);
    
    public static String getParamAndAtribute(HttpServletRequest request,
            String name) {
        String temp = getParameter(request, name);
        if (temp == null || temp.equals("null") || temp.equals("")) {
            temp = getAtribute(request, name);
        }
        return temp;
    }

    public static String getAtributeAndParam(HttpServletRequest request,
            String name) {
        String temp = getAtribute(request, name);
        if (temp == null || temp.equals("null") || temp.equals("")) {
        	temp = getParameter(request, name);
        }
        return temp;
    }
    
    /**
     * Gets a parameter as a string.
     * 
     * @param request
     *            The HttpServletRequest object, known as "request" in a JSP
     *            page.
     * @param name
     *            The name of the parameter you want to get
     * @return The value of the parameter or a zero-length string if the
     *         parameter was not found or if the parameter is a zero-length
     *         string.
     */
    public static String getAtribute(HttpServletRequest request, String name) {
        String temp = (String) request.getAttribute(name);
        return temp != null ? temp.trim() : "";
    }

    /**
     * 
     * 获得指定的参数，如果没有获得则返回默认值。
     * 
     * @author yaoq
     */
    public static Vector<String> getParameters(HttpServletRequest request, String name) {
        Vector<String> temp = new Vector<String>();
        String[] tempArray = request.getParameterValues(name);
        if (tempArray != null && tempArray.length > 0) {
            temp = new Vector<String>(Arrays.asList(tempArray));
        }
        return temp;
    }

    /**
     * Gets a parameter as a string.
     * 
     * @param request
     *            The HttpServletRequest object, known as "request" in a JSP
     *            page.
     * @param name
     *            The name of the parameter you want to get
     * @return The value of the parameter or a zero-length string if the
     *         parameter was not found or if the parameter is a zero-length
     *         string.
     */
    public static String getParameter(HttpServletRequest request, String name) {
        String temp = request.getParameter(name);
        return temp != null ? temp.trim() : "";
    }

    public static String getParameter(HttpServletRequest request, String name,
            boolean setAttr) {
        String temp = request.getParameter(name);
        if (setAttr)
            request.setAttribute(name, temp);
        return temp != null ? temp.trim() : "";
    }
    
    @SuppressWarnings("unchecked")
    public static Map<String, String[]> getParameterMap(HttpServletRequest request, boolean setAttr){
    	Map<String, String[]> map = new HashMap<String, String[]>(request.getParameterMap());
    	//分页偏移参数‘pager.offset’不处理。
    	if (setAttr){
			Iterator<Map.Entry<String, String[]>> it = map.entrySet().iterator();  
	        while(it.hasNext()){  
	            Map.Entry<String, String[]> entry=it.next();  
	            String key = entry.getKey();
	            String[] value=(String[])entry.getValue();
	            if(StringUtil.isBlank(value[0]) || "pager.offset".equals(key)){  
	            	it.remove();
	            	if (logger.isDebugEnabled()) {
						logger.debug("remove Blank Parameter [name:"+key+", "+"value:"+value[0]+"]");
					}
	            } else {
	            	if (logger.isDebugEnabled()) {
						logger.debug("set Parameter to Attribute [name:"+key+", "+"value:"+value[0]+"]");
					}
	            	request.setAttribute(key, value[0]); 
				} 
	        } 
		}
		return map;
    }

    /**
     * @deprecated
     * @deprecated 建议使用getParameter(request, name, true)
     */
    public static String getParameter2(HttpServletRequest request, String name) {
        return getParameter(request, name, true);
    }

    /**
     * Gets a parameter as a boolean.
     * 
     * @param request
     *            The HttpServletRequest object, known as "request" in a JSP
     *            page.
     * @param name
     *            The name of the parameter you want to get
     * @return True if the value of the parameter was "true", false otherwise.
     */
    public static boolean getBooleanParameter(HttpServletRequest request,
            String name, boolean dflt) {
        return getBooleanParameter(request, name, dflt, false);
    }

    public static boolean getBooleanParameter(HttpServletRequest request,
            String name, boolean dflt, boolean setAttr) {
        String temp = request.getParameter(name);
        if (setAttr)
            request.setAttribute(name, temp);
        if ("true".equals(temp) || "on".equals(temp)) {
            return true;
        } else if ("false".equals(temp) || "off".equals(temp)) {
            return false;
        } else {
            return dflt;
        }
    }

    /**
     * @deprecated
     * @deprecated 建议使用getBooleanParameter(request, name, dflt, true)
     */
    public static boolean getBooleanParameter2(HttpServletRequest request,
            String name, boolean dflt) {
        return getBooleanParameter(request, name, dflt, true);
    }

    /**
     * Gets a parameter as an int.
     * 
     * @param request
     *            The HttpServletRequest object, known as "request" in a JSP
     *            page.
     * @param name
     *            The name of the parameter you want to get
     * @return The int value of the parameter specified or the default value if
     *         the parameter is not found.
     */
    public static int getIntParameter(HttpServletRequest request, String name,
            int dflt) {
        return getIntParameter(request, name, dflt, false);
    }

    public static Integer getIntegerParameter(HttpServletRequest request, String name) {
    	String result = WebUtils.getParameter(request, name, false);
    	if (result.equals("")){
    		return null;
    	}else{
    		return new Integer(result);
    	}
    }
    
    public static int getIntParameter(HttpServletRequest request, String name,
            int dflt, boolean setAttr) {
        String temp = request.getParameter(name);
        if (setAttr)
            request.setAttribute(name, temp);
        int num = dflt;
        try {
            num = Integer.parseInt(temp);
        } catch (Exception ignored) {
        }
        return num;
    }

    /**
     * @deprecated
     * @deprecated 建议使用getIntParameter(request, name, dflt, true)
     */
    public static int getIntParameter2(HttpServletRequest request, String name,
            int dflt) {
        return getIntParameter(request, name, dflt, true);
    }

    /**
     * Gets a list of int parameters.
     * 
     * @param request
     *            The HttpServletRequest object, known as "request" in a JSP
     *            page.
     * @param name
     *            The name of the parameter you want to get
     * @param defaultNum
     *            The default value of a parameter, if the parameter can't be
     *            converted into an int.
     */
    public static int[] getIntParameters(HttpServletRequest request,
            String name, int dflt) {
        return getIntParameters(request, name, dflt, false);
    }

    public static int[] getIntParameters(HttpServletRequest request,
            String name, int dflt, boolean setAttr) {
        String[] paramValues = request.getParameterValues(name);
        if (setAttr)
            request.setAttribute(name, paramValues);
        if (paramValues == null) {
            return null;
        }
        if (paramValues.length < 1) {
            return new int[0];
        }
        int[] values = new int[paramValues.length];
        for (int i = 0; i < paramValues.length; i++) {
            try {
                values[i] = Integer.parseInt(paramValues[i]);
            } catch (Exception e) {
                values[i] = dflt;
            }
        }
        return values;
    }

    /**
     * @deprecated
     * @deprecated 建议使用getIntParameters(request, name, dflt, true)
     */
    public static int[] getIntParameters2(HttpServletRequest request,
            String name, int dflt) {
        return getIntParameters(request, name, dflt, true);
    }

    /**
     * Gets a parameter as a long.
     * 
     * @param request
     *            The HttpServletRequest object, known as "request" in a JSP
     *            page.
     * @param name
     *            The name of the parameter you want to get
     * @return The long value of the parameter specified or the default value if
     *         the parameter is not found.
     */
    public static long getLongParameter(HttpServletRequest request,
            String name, long dflt) {
        return getLongParameter(request, name, dflt, false);
    }

    public static long getLongParameter(HttpServletRequest request,
            String name, long dflt, boolean setAttr) {
        String temp = request.getParameter(name);
        if (setAttr)
            request.setAttribute(name, temp);
        if (temp != null && !temp.equals("")) {
            long num = dflt;
            try {
                num = Long.parseLong(temp);
            } catch (Exception ignored) {
            }
            return num;
        } else {
            return dflt;
        }
    }

    /**
     * @deprecated
     * @deprecated 建议使用getLongParameter(request, name, dflt, true)
     */
    public static long getLongParameter2(HttpServletRequest request,
            String name, long dflt) {
        return getLongParameter(request, name, dflt, true);
    }

    public static long[] getLongParameters(HttpServletRequest request,
            String name, long dflt) {
    	return getLongParameters(request, name, dflt, false);
    }

    public static long[] getLongParameters(HttpServletRequest request,
            String name, long dflt, boolean setAttr) {
        String[] paramValues = request.getParameterValues(name);
        if (setAttr)
            request.setAttribute(name, paramValues);
        if (paramValues == null) {
            return null;
        }
        if (paramValues.length < 1) {
            return new long[0];
        }
        long[] values = new long[paramValues.length];
        for (int i = 0; i < paramValues.length; i++) {
            try {
                values[i] = Long.parseLong(paramValues[i]);
            } catch (Exception e) {
                values[i] = dflt;
            }
        }
        return values;
    }

    public static Date getDateParameter(HttpServletRequest request,
            String name, Date dflt) {
        return getDateParameter(request, name, dflt, false);
    }

    public static Date getDateParameter(HttpServletRequest request,
            String name, Date dflt, boolean setAttr) {
        String temp = request.getParameter(name);
        if (temp == null || "".equals(temp.trim())) {
            if (setAttr)
                request.setAttribute(name, dflt);
            return dflt;
        }

        try {
            Date dt = (Date.valueOf(temp));
            if (setAttr)
                request.setAttribute(name, dt);
            return dt;
        } catch (Exception e) {
            throw new SystemException("", "输入项非日期Date类型");
        }
    }
    
    public static Date getDateParameter(HttpServletRequest request,
            String name, Date dflt, Date defaultValue) {
        String temp = request.getParameter(name);
        if (temp == null || "".equals(temp.trim())) {
            return dflt;
        }

        try {
            Date dt = defaultValue;
            return dt;
        } catch (Exception e) {
            throw new SystemException("", "输入项非日期Date类型");
        }
    }
    

    /**
     * 按照指定的格式生成date，默认为当前日期<br>
     * yq added <br>
     * 建议大家都使用util.date,不要使用sql.date。<br>
     * 好处很多的<br>
     */
    public static java.util.Date getUtilDateParameter(
            HttpServletRequest request, String name, String dateFormat) {

        String temp = request.getParameter(name);
        if (temp == null || "".equals(temp.trim())) {
            return new java.util.Date();
        }

        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        try {
            return sdf.parse(temp);
        } catch (ParseException e) {
            throw new SystemException("", "输入项非日期Date类型");
        }

    }
    public static java.util.Date getUtilDateParameter(
            HttpServletRequest request, String name, String dateFormat,Date dflt) {

        String temp = request.getParameter(name);
        if (temp == null || "".equals(temp.trim())) {
            return dflt;
        }

        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        try {
            return sdf.parse(temp);
        } catch (ParseException e) {
            throw new SystemException("", "输入项非日期Date类型");
        }

    }

    public static Timestamp getTmstmpParameter(HttpServletRequest request,
            String name, Timestamp dflt) {
        return getTmstmpParameter(request, name, dflt, false);
    }

    public static Timestamp getTmstmpParameter(HttpServletRequest request,
            String name, Timestamp dflt, boolean setAttr) {
        String temp = request.getParameter(name);
        if (temp == null || "".equals(temp.trim())) {
            if (setAttr)
                request.setAttribute(name, dflt);
            return dflt;
        }

        Timestamp tmstmp;
        try {
            tmstmp = Timestamp.valueOf(temp);
        } catch (Exception e) {
            try {
                tmstmp = Timestamp.valueOf(temp + " 00:00:00");
            } catch (Exception se) {
                throw new SystemException("", "输入项非日期Timestamp类型");
            }
        }
        if (setAttr)
            request.setAttribute(name, tmstmp);
        return tmstmp;
    }

    /**
     * Gets a Object List
     * 
     * @param request
     * @param prefix
     * @param clazz
     * @return
     */
    public static List getBeanList(HttpServletRequest request, String prefix,
            Class clazz) {
        return getBeanList(request, prefix, clazz, false);
    }

    /**
     * @param setAttr
     *            true/false 是/否设置在request的attribute中
     * @return Gets a Object List
     */
    public static List getBeanList(HttpServletRequest request, String prefix,
            Class clazz, boolean setAttr) {
        HashMapList mapList = getMapList(request, prefix);

        List objs = new ArrayList(mapList.size());
        for (int i = 0; i < mapList.size(); i++) {
            try {
                Object obj = clazz.newInstance();
                Map hm = mapList.get(i);
                // modtp：王立峰专用 2006-10-19
                if (!"N".equals(hm.get("modtp"))) {
                    BeanUtils.populate(obj, hm);
                    objs.add(obj);
                }
            } catch (Exception e) {
                logger.error("系统异常", e);
            }
        }
        if (setAttr)
            request.setAttribute(prefix, objs);

        return objs;
    }

    /**
     * @deprecated 建议使用getBeanList(request, prefix, clazz, true)
     */
    public static List getBeanList2(HttpServletRequest request, String prefix,
            Class clazz) {
        return getBeanList(request, prefix, clazz, true);
    }

    /**
     * Gets a Object
     * 
     * @param request
     * @param prefix
     * @param clazz
     * @return
     */
    public static Object getBean(HttpServletRequest request, String prefix,
            Class clazz) {
        return getBean(request, prefix, clazz, false);
    }

    /**
     * @param setAttr
     *            true/false 是/否设置在request的attribute中
     * @return Gets a Object List
     */
    public static Object getBean(HttpServletRequest request, String prefix,
            Class<T> clazz, boolean setAttr) {
        HashMapList mapList = getMapList(request, prefix);

        Object obj = null;
        try {
            if (mapList.size() != 0) {
                obj = clazz.newInstance();
                BeanUtils.populate(obj, mapList.get(0));
            }
        } catch (Exception e) {
        	logger.error("系统异常", e);
        }

        if (setAttr)
            request.setAttribute(prefix, obj);
        return obj;
    }

    /**
     * @deprecated 建议使用getBean(request, prefix, clazz, true)
     */
    public static Object getBean2(HttpServletRequest request, String prefix,
            Class clazz) {
        return getBean(request, prefix, clazz, true);
    }

    /**
     * 获取下载输出流
     * 
     * @param response
     *            HttpServletResponse
     * @param fileName
     *            String
     * @throws SystemException
     * @return OutputStream
     */
    public static OutputStream getDownloadStream(HttpServletResponse response,
            String fileName) throws SystemException {
        OutputStream output = null;
        try {
            logger.debug("***********" + fileName);
            response.setContentType("application/x-msdownload");
            response.setContentType("Content-Transfer-Encoding: binary");
            response.setContentType("Content-Length:1024");
            // String url = URLEncoder.encode(fileName);
            String url = fileName;
            response.addHeader("Content-Disposition", "attachment; filename="
                    + url);

            output = response.getOutputStream();
        } catch (Exception ex) {
            logger.error("获取下载输出流失败: " + ex);
            throw new SystemException("", "", ex);
        }

        return output;
    }

    /**
     * 给vo list 填充属性值
     * 
     * @param beanList
     * @param name
     * @param value
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     */
    public static void fillBeanList(List beanList, String name, Object value)
            throws IllegalAccessException, InvocationTargetException {
        for (int i = 0; i < beanList.size(); i++) {
            Object bean = beanList.get(i);
            BeanUtils.setProperty(bean, name, value);
        }
    }

    public static HashMapList getMapList(HttpServletRequest request) {
        // Iterator of parameter names
        Enumeration names = request.getParameterNames();
        HashMapList mapList = new HashMapList();

        while (names.hasMoreElements()) {
            String name = (String) names.nextElement();
            String stripped = name;
            int index;
            if ((index = stripped.indexOf(".")) != -1) {
                stripped = stripped.substring(index + 1);
                mapList.put(stripped, request.getParameterValues(name));
            }
        }

        return mapList;
    }

    private static HashMapList getMapList(HttpServletRequest request,
            String prefix) {
        // Iterator of parameter names
        Enumeration names = request.getParameterNames();
        HashMapList mapList = new HashMapList();

        if (!prefix.endsWith(".")) {
            prefix = prefix + ".";
        }
        while (names.hasMoreElements()) {
            String name = (String) names.nextElement();
            String stripped = name;
            if (prefix != null && stripped.startsWith(prefix)) {
                stripped = stripped.substring(prefix.length());
                mapList.put(stripped, request.getParameterValues(name));
            }
        }

        return mapList;
    }

    public static String parseBafString(Object obj, String wrongstr) {
        String str = "";
        try {
            if (obj == null) {
                return "";
            } else {
                // if ( String.valueOf( obj.getClass() ).indexOf("Timestamp")>=0
                // ) {
                if (obj instanceof Timestamp) {
                    Timestamp ts = (Timestamp) obj;
                    java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat(
                            "yyyyMMddHHmmss");// HH:mm:ss
                    str = (String) formatter.format(ts);// new java.util.Date()
                    return str;
                }
            }

            str = String.valueOf(obj);
            if (wrongstr != null)
                if (str.equals(wrongstr))
                    str = "";
            return str;
        } catch (Exception e) {
            return "";
        }
    }

    public static String parseBafString(int i, String wrongstr) {
        try {
            String str = String.valueOf(i);
            if (wrongstr != null)
                if (str.equals(wrongstr))
                    str = "";
            return str;
        } catch (Exception e) {
            return "";
        }
    }

    public static String parseBafString(long i, String wrongstr) {
        try {
            String str = String.valueOf(i);
            if (wrongstr != null)
                if (str.equals(wrongstr))
                    str = "";
            return str;
        } catch (Exception e) {
            return "";
        }
    }

    public static String parseBafString(Object obj) {
        return parseBafString(obj, null);
    }

    public static String parseBafString(int i) {
        return parseBafString(i, null);
    }

    public static String parseBafString(long i) {
        return parseBafString(i, null);
    }

    public static long parseLong(String str) {
        try {
            return Long.parseLong(str);
        } catch (Exception e) {
            return 0;
        }
    }

    public static int parseInt(String str) {
        try {
            while ( str.length()>1 && str.substring(0,1).equals("0") ) {
                str = str.substring(1);
            } 
            
            return Integer.parseInt(str);
        } catch (Exception e) {
            return 0;
        }
    }
    
    public static double parseDouble(String str) {
        try {
            return  Double.parseDouble(str);
        } catch (Exception e) {
            return 0;
        }
    }

    public static String parseString(Object obj) {
        try {
            String str = String.valueOf(obj);
            if (str == null || str.equals("null")) {
                str = "";
            }
            return str;
        } catch (Exception e) {
            return "";
        }
    }
    
    /**
     *获取客户端IP地址( 多级反向代理[Squid]下获取客户端真实IP地址 )[http://www.blogjava.net/Alpha/archive/2006/07/12/57764.html]
     * @param request
     * @return
     */
    public static String getIpAddr(HttpServletRequest request) 
    {
    	       String ip = request.getHeader("x-forwarded-for");
    	       if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
               ip = request.getHeader("Proxy-Client-IP");
           }
           if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
               ip = request.getHeader("WL-Proxy-Client-IP");
           }
    	      if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
               ip = request.getRemoteAddr();
           }
          return ip;
    }
    
}
