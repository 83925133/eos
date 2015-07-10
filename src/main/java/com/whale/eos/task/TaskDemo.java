package com.whale.eos.task;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class TaskDemo {
	private static final Log logger = LogFactory.getLog(TaskDemo.class);

	public void excuteTask1() {
		logger.info("定时任务1[每20秒]：【"+ new java.sql.Timestamp(System.currentTimeMillis()) + "】");
	}

	public void excuteTask2() {
		logger.info("定时任务2[每5秒]：【"+ new java.sql.Timestamp(System.currentTimeMillis()) + "】");
	}
}
