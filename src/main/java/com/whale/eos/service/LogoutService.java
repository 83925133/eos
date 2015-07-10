package com.whale.eos.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: swen
 * Date: 13-11-5
 * Time: 上午10:48
 * To change this template use File | Settings | File Templates.
 */
@Service
public class LogoutService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public String process(String terminalNo,String cardNo){
        logger.debug("LogoutService terminalNo = " + terminalNo + ",cardNo =" + cardNo);

        try {
        } catch (Exception e) {
            logger.error("LogoutService error:" + e);
        }
        return null;
    }
}
