package com.whale.eos.basic.util.http;

import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.commons.httpclient.params.HttpConnectionManagerParams;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/**
 * Created with IntelliJ IDEA.
 * User: swen
 * Date: 13-10-26
 * Time: 下午3:16
 * To change this template use File | Settings | File Templates.
 */
public class HttpClientUtil {

    public final static int DEFAULT_CONN_TIMEOUT = 30000;
    public final static int DEFAULT_READ_TIMEOUT = 20000;
    /**
     * httpclient在处理请求连接方面使用了连接池，它内部实际上有两种连接池，一种是全局的ConnectionPool，
     * 一种是每主机（per-host）HostConnectionPool。参数maxHostConnections就HostConnectionPool中表示每主机可保持连接的连接数，
     * maxTotalConnections是ConnectionPool中可最多保持的连接数。每主机的配置类是HostConfiguration，
     * HttpClient有个int executeMethod(final HostConfiguration hostConfiguration, final HttpMethod method)方法可以指定使用哪个HostConfiguration，
     * 不过多数情况都是不显示指定HostConfiguration，这样httpclient就用了默认的HostConfiguration=null，
     * 也就是说所有的请求可以认为指自同一个主机。如果不设置这两个参数，httpclient自然会用默认的配置，
     * 也就是MultiThreadedHttpConnectionManager中的：默认的maxHostConnections大小只有2,也就是说，在我并发8个线程请求数据时，实际上会有6个线程处于等待被调度
     */
    public static final Integer MAX_HOST_CONN = 300;//
    public static final Integer MAX_CONN = 500;

    private static final Logger logger = LoggerFactory.getLogger(HttpClientUtil.class);

    private final static String DEFAULT_ENCODE = "UTF-8";

    public static HttpClient client = null;

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        try {
            final String address = "http://127.0.0.1:8081/ams/aa";

            final int count = 1000;
            final CountDownLatch doneSignal = new CountDownLatch(count);
            for (int i = 0; i < count; i++) {
                final int threadIndex = i;
                new Thread(new Runnable() {
                    public void run() {
                        try {
                            String result = HttpClientUtil.doPostWithThreadPool(address, "UTF-8", "test");
//                            String result = HttpClientUtil.doPost(address, "UTF-8", "test");

//
//                            StringBuilder httpResultBuilder = new StringBuilder();
//                            int timeOut = NumberUtil.toInt(ResourceUtil.getResourceString("option.ams.read.timeout"), 60) * 1000;
//                            HttpUtil.submitByHttpPostForAms("ams send, ", address, "test", httpResultBuilder, timeOut);
//                            String result = httpResultBuilder.toString();


                            System.out.println("result = " + result + " index = " + threadIndex);
                        } catch (Exception e) {
                            System.out.println(e);
                        } finally {
                            doneSignal.countDown();
                        }
                    }
                }).start();
            }
            doneSignal.await();
        } catch (Exception e) {
            System.out.println("e = " + e);
        }
        long endTime = System.currentTimeMillis();
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        int dd = 2;
//        ThreadUtil.waitForAwhile(1000L);
        dd = 2;
//        ThreadUtil.waitForAwhile(1000L);
        dd = 2;
//        ThreadUtil.waitForAwhile(1000L);
        dd = 2;
//        ThreadUtil.waitForAwhile(1000L);
        dd = 2;
//        ThreadUtil.waitForAwhile(1000L);
        dd = 2;
        System.out.println("endTime - startTime = " + (endTime - startTime));

    }

    static {
        HttpConnectionManager httpConnectionManager = new MultiThreadedHttpConnectionManager();
        HttpConnectionManagerParams params = httpConnectionManager.getParams();
        params.setConnectionTimeout(DEFAULT_CONN_TIMEOUT);
        params.setSoTimeout(DEFAULT_READ_TIMEOUT);
        params.setDefaultMaxConnectionsPerHost(MAX_HOST_CONN);//very important!!
        params.setMaxTotalConnections(MAX_CONN);//very important!!
        client = new HttpClient(httpConnectionManager);
    }

    public static String doPost(String url, String encode, String queryString) throws Exception {
        return doPost(url, encode, queryString, DEFAULT_CONN_TIMEOUT, DEFAULT_READ_TIMEOUT, new HttpClient(), true);
    }

    public static String doPostWithThreadPool(String url, String encode, String queryString) throws Exception {
        return doPost(url, encode, queryString, DEFAULT_CONN_TIMEOUT, DEFAULT_READ_TIMEOUT, client, false);
    }

    public static String doPost(String url, String encode, String[] queryArray) throws Exception {
        return doPost(url, encode, queryArray, DEFAULT_CONN_TIMEOUT, DEFAULT_READ_TIMEOUT);
    }

    public static String doPost(String url, String encode, Map<String, String> querymap) throws Exception {
        return doPost(url, encode, querymap, DEFAULT_CONN_TIMEOUT, DEFAULT_READ_TIMEOUT);
    }

    /**
     * 执行一个HTTP POST请求，返回请求响应的HTML
     *
     * @param httpClient
     * @param url         请求的URL地址
     * @param queryString 请求的查询参数
     * @return 返回请求响应的HTML
     */
    private static String doPost(String url, String encode, String queryString, int cTimeOut, int rTimeOut, HttpClient httpClient, boolean needClose) throws Exception {
        if (StringUtils.isBlank(url) || StringUtils.isBlank(queryString)) return "";

//        HttpClient client = new HttpClient();
        httpClient.getParams().setBooleanParameter("http.protocol.expect-continue", false);
        PostMethod method = new PostMethod(url);
        try {
            // 设置连接超时时间(单位毫秒)
            httpClient.getHttpConnectionManager().getParams().setConnectionTimeout(cTimeOut);
//            // 设置读数据超时时间(单位毫秒)
            httpClient.getHttpConnectionManager().getParams().setSoTimeout(rTimeOut);


            RequestEntity entity = new StringRequestEntity(queryString, "text/html", (StringUtils.isBlank(encode) ? DEFAULT_ENCODE : encode));
            method.setRequestEntity(entity);


//HTTP/1.1 defines the "close" connection option for the sender to signal that the connection will be closed after completion of the response.
//使用上面这些方法关闭链接是在我们的应用中明确知道不需要重用链接时可以主动关闭链接来释放资源。如果你的应用是需要重用链接的话就没必要这么做，使用原有的链接还可以提供性能。
            if (!needClose) {
                method.addRequestHeader("Connection", "close");
            }

            httpClient.executeMethod(method);

            if (method.getStatusCode() == HttpStatus.SC_OK) {
                InputStream resStream = method.getResponseBodyAsStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(resStream, (StringUtils.isBlank(encode) ? DEFAULT_ENCODE : encode)));
                StringBuilder resBuffer = new StringBuilder();
                String resTemp = "";
                while ((resTemp = br.readLine()) != null) {
                    resBuffer.append(resTemp);
                }
                return resBuffer.toString();
            } else {
                method.abort();//马上断开连接
                logger.error("Http Comunication error ! code --> "
                        + method.getStatusCode());
            }

        } catch (Exception e) {
            throw e;
        } finally {
            method.releaseConnection();
            if (needClose) {
                httpClient.getHttpConnectionManager().closeIdleConnections(0);
            }
        }
        return "";
    }

    public static String doPost(String url, String encode, String[] queryParam, int cTimeOut, int rTimeOut) throws Exception {
        Map<String, String> dataMap = new HashMap<String, String>();
        int length = queryParam.length;
        for (int i = 0; i < length; i = i + 2) {
            dataMap.put(queryParam[i], queryParam[i + 1]);
        }
        return doPost(url, encode, dataMap, cTimeOut, rTimeOut);
    }

    /**
     * 执行一个HTTP POST请求，返回请求响应的HTML
     *
     * @param url        请求的URL地址
     * @param queryParam 请求的参数,
     * @return 返回请求响应的HTML
     */
    public static String doPost(String url, String encode, Map<String, String> queryParam, int cTimeOut, int rTimeOut) throws Exception {
        if (StringUtils.isBlank(url) || queryParam == null || queryParam.size() == 0) return "";

//        HttpClient client = new HttpClient();
        client.getParams().setBooleanParameter("http.protocol.expect-continue", false);
        PostMethod method = new PostMethod(url);
        try {

            HttpConnectionManagerParams managerParams = client
                    .getHttpConnectionManager().getParams();
            // 设置连接超时时间(单位毫秒)
            managerParams.setConnectionTimeout(cTimeOut == 0 ? DEFAULT_CONN_TIMEOUT : cTimeOut);
            // 设置读数据超时时间(单位毫秒)
            managerParams.setSoTimeout(rTimeOut == 0 ? DEFAULT_READ_TIMEOUT : rTimeOut);

            method.setRequestHeader("Content-Type", "application/x-www-form-urlencoded;charset="
                    + (StringUtils.isBlank(encode) ? DEFAULT_ENCODE : encode));
            NameValuePair[] param = new NameValuePair[queryParam.size()];
            int i = 0;
            for (Map.Entry<String, String> entry : queryParam.entrySet()) {
                param[i] = new NameValuePair(entry.getKey(), entry.getValue());
                i++;
            }

            method.setRequestBody(param);

            method.addRequestHeader("Connection", "close");
//            method.getParams().setCookiePolicy(CookiePolicy.IGNORE_COOKIES);
//
//            method.setRequestHeader("Cookie", "special-cookie=value");
            client.executeMethod(method);

            if (method.getStatusCode() == HttpStatus.SC_OK) {
                InputStream resStream = method.getResponseBodyAsStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(resStream, (StringUtils.isBlank(encode) ? DEFAULT_ENCODE : encode)));
                StringBuilder resBuffer = new StringBuilder();
                String resTemp = "";
                while ((resTemp = br.readLine()) != null) {
                    resBuffer.append(resTemp);
                }
                return resBuffer.toString();
            } else {
                method.abort();//马上断开连接
                logger.error("Http Comunication error ! code --> "
                        + method.getStatusCode());
            }
        } catch (Exception e) {
            throw e;
        } finally {
            method.releaseConnection();
        }
        return "";
    }

    /**
     * 发送HTTP请求
     *
     * @param url
     * @param param
     * @return HTTP响应
     */
    public static String sendSimplePostRequest(String url,
                                               Map<String, Object> param) {
        // HTTP方法，还有get,head,put,delete,connect,options（询问可用的选项）
        PostMethod post = new PostMethod(url);
        post.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET,
                DEFAULT_ENCODE);
        if (param != null) {
            for (Map.Entry<String, Object> entry : param.entrySet()) {
                // 排除掉空值
                if (entry.getValue() != null) {
                    post.addParameter(entry.getKey(), entry.getValue()
                            .toString());
                }
            }
        }
        try {
            post.addRequestHeader(new Header("Connection", "close"));
            // post.addRequestHeader("Cookie", "ID=1"); //添加Cookie
            client.executeMethod(post);
            if (post.getStatusCode() == HttpStatus.SC_OK) {
                return post.getResponseBodyAsString();
            } else {
                post.abort();//马上断开连接
                logger.error("Http Comunication error ! code --> " + post.getStatusCode());
            }
        } catch (Exception e) {
            logger.error("Http post occur error!url=" + url + ",param=" + param, e);
        } finally {
            post.releaseConnection();
        }
        return null;
    }

    /**
     * 取得客户端真实ip
     *
     * @param request
     * @return 客户端真实ip
     */
    public static String getIpAddr(HttpServletRequest request) {
        String ip = request.getHeader("X-Forwarded-For");
//        logger.debug("1- X-Forwarded-For ip={}", ip);
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
//            logger.debug("2- Proxy-Client-IP ip={}", ip);
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
//            logger.debug("3- WL-Proxy-Client-IP ip={}", ip);
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_CLIENT_IP");
//            logger.debug("4- HTTP_CLIENT_IP ip={}", ip);
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
//            logger.debug("5- HTTP_X_FORWARDED_FOR ip={}", ip);
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
//            logger.debug("6- getRemoteAddr ip={}", ip);
        }
//        logger.info("finally ip={}", ip);
        return ip;
    }
}
