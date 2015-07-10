package com.whale.eos.basic.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.InputStreamRequestEntity;
import org.apache.commons.httpclient.methods.PostMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created with IntelliJ IDEA.
 * User: zhangcaineng
 * Date: 13-10-12
 * Time: 下午12:08
 * To change this template use File | Settings | File Templates.
 */
public class HttpUtil {

    private static Logger logger = LoggerFactory.getLogger(HttpUtil.class);

    public static String postSendData(String address, String req) {
        byte[] bgzip = null;
        try {
            bgzip = gzip(req.getBytes("gbk"));
        } catch (UnsupportedEncodingException e) {
            logger.error("gzip error:" + e);
        }

        if (null == bgzip || bgzip.length == 0) return "";

        HttpClient httpClient = new HttpClient();

        httpClient.getParams().setBooleanParameter("http.protocol.expect-continue", false);
        // 设置连接超时时间(单位毫秒)
        httpClient.getHttpConnectionManager().getParams().setConnectionTimeout(10000);
        // 设置读数据超时时间(单位毫秒)
        //int soTimeout = ResourceUtils.getInt("option.betcard.system.read.timeout",60000);
        //httpClient.getHttpConnectionManager().getParams().setSoTimeout(soTimeout);

        PostMethod method = new PostMethod(address);
        try {
        	//method.setRequestHeader("Content-Type", "application/x-gzip;charset=gbk");

            InputStreamRequestEntity httpentity = new InputStreamRequestEntity(new ByteArrayInputStream(bgzip), bgzip.length);
            method.setRequestEntity(httpentity);

            if (httpClient.executeMethod(method) == HttpStatus.SC_OK) {
                InputStream resStream = method.getResponseBodyAsStream();
                byte[] rspZipData = unGzip(resStream);
                String body = new String(rspZipData);
                logger.debug("receive post data = " + body);

                return body;
            } else {
                method.abort();//马上断开连接
                logger.debug("Http Comunication error ! code --> "
                        + method.getStatusCode());
            }
        } catch (IOException e) {
            logger.error("", e.getMessage());
        } finally {
            method.releaseConnection();
        }
        return "";
    }


    /**
     * 对参数进行gzip压缩操作, 返回字节数组
     * @param data 待压缩的字节数组
     * @return 压缩后的gzip字节数组
     * @throws IOException
     */
    public static byte[] gzip(byte[] data) {
        byte[] result = null;
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            GZIPOutputStream gos = new GZIPOutputStream(baos);

            gos.write(data);

            gos.finish();
            gos.flush();

            result = baos.toByteArray();

            baos.flush();


            gos.close();
        } catch (IOException e) {
            logger.warn("Close GZIPOutputStream fail:", e);
        }

        return result;
    }

    /**
     * 对参数进行gzip压缩操作, 结果输出到参数的输出流中
     * @param data 待压缩的字节数组
     * @param os   压缩后的输出流
     * @throws IOException
     */
    public static void gzip(byte[] data, OutputStream os) throws IOException {

        GZIPOutputStream gos = new GZIPOutputStream(os);

        gos.write(data);

        gos.finish();
        gos.flush();

        try {
            gos.close();
        } catch (IOException e) {
            logger.warn("Close GZIPOutputStream fail:", e);
        }

    }

    /**
     * 解压缩
     * @param ins 输入流
     * @return 解压完的数据字节数组
     * @throws IOException
     */
    public static byte[] unGzip(InputStream ins) throws IOException {

//        if (logger.isInfoEnabled()) {
//            logger.info("Start to ungzip parameters.....");
//        }

        GZIPInputStream gis = new GZIPInputStream(ins);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        int b;
        while ((b = gis.read()) != -1) {
            baos.write(b);
        }

        byte[] result = baos.toByteArray();

//        if (logger.isInfoEnabled()) {
//            logger.info("Ungzip parameters bytes OK, result bytes size is: " + result.length);
//        }

        try {
            gis.close();
        } catch (IOException e) {
            logger.warn("Close GZIPInputStream fail:", e);
        }

        return result;
    }
}
