package com.whale.eos.service;

import com.whale.eos.basic.util.SqlUtil;

/**
 * Created with IntelliJ IDEA.
 * User: 
 * Date: 13-10-12
 * Time: 上午11:13
 * To change this template use File | Settings | File Templates.
 */
public class SequenceIdUtil {

    public static long getSeqNext(String sql) throws Exception{
        return SqlUtil.queryForLong(sql);
    }

    /**
     * 获取门店编号SEQ
     * @return
     * @throws Exception
     */
    public static long getAgentNoSequence()throws Exception{
        return getSeqNext("select nextval(\"agent_no_sequence\")");
    }

    /**
     * 获取账户管理系统请求SEQ
     * @return
     * @throws Exception
     */
    public static long getBetSystemReqSequence()throws Exception{
        return getSeqNext("select nextval(\"bet_system_req_sequence\")");
    }

}
