package com.whale.eos.basic.util.ftp;


import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created with IntelliJ IDEA.
 * User: zhangcaineng
 * Date: 13-7-16
 * Time: 上午11:16
 * To change this template use File | Settings | File Templates.
 */
public class FtpUtil {

    private Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    private String hostIp;
    private int hostPort;
    private String user;
    private String password;
    private String hostFilePath;
    private String localFilePath;

    private int defaultFtpTransferType = FTPClient.BINARY_FILE_TYPE;
    private int defaultFtpConnectMode = FTPClient.STREAM_TRANSFER_MODE;

    private FTPClient ftpClient;

    public FtpUtil(String hostIp, int hostPort, String user, String password, String hostFilePath, String localFilePath) {
        this.hostIp = hostIp;
        this.hostPort = hostPort;
        this.user = user;
        this.password = password;
        this.hostFilePath = hostFilePath;
        this.localFilePath = localFilePath;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("FTPUtil");
        sb.append("{hostIp='").append(hostIp).append('\'');
        sb.append(", hostPort=").append(hostPort);
        sb.append(", user='").append(user).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", hostFilePath='").append(hostFilePath).append('\'');
        sb.append(", localFilePath='").append(localFilePath).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void ftpConnect() throws IOException {
        if (ftpClient != null)
            return;
        ftpClient = new FTPClient();
        ftpClient.connect(hostIp, hostPort);
        ftpClient.setSoTimeout(120 * 1000);
        ftpClient.setDataTimeout(120 * 1000);
        logger.debug("ftp connect success");
    }

    public boolean login() throws IOException {
        //如果采用默认端口，可以使用ftp.connect(url)的方式直接连接FTP服务器
        ftpClient.login(user, password);//登录
        int reply = ftpClient.getReplyCode();
        if (!FTPReply.isPositiveCompletion(reply)) {
            ftpClient.disconnect();
            logger.debug("ftp login fail");
            return false;
        }
        //登录后设置才有效
        ftpClient.setFileType(defaultFtpTransferType);
        ftpClient.enterLocalPassiveMode();
        logger.debug("ftp login success");
        return true;
    }

    public boolean downFile(String srcFileName, String destFileName) throws IOException {
        try {
            boolean isLogin = login();
            if (!isLogin) {
                ftpClient.logout();
                return false;
            }
            ftpClient.changeWorkingDirectory(hostFilePath);//转移到FTP服务器目录

            OutputStream is = null;
            try {
                String[] fileNames = ftpClient.listNames();
                for (String name : fileNames) {
                    if (srcFileName.equals(name)) {
                        //先要判断文件是否存在
                        File localFile = new File(localFilePath + destFileName);
                        is = new FileOutputStream(localFile);
                        boolean result = ftpClient.retrieveFile(hostFilePath + srcFileName, is);
                        if (!result) {
                            is.close();
                            localFile.delete();
                        }
                        break;
                    }
                }
            } finally {
                if (is != null) {
                    is.close();
                }
            }

            ftpClient.logout();
        } finally {
            try {
                ftpClient.disconnect();
                ftpClient = null;
            } catch (IOException ioe) {
                logger.error("disconnect error", ioe);
            }
        }
        return true;
    }


}
