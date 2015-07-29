/**
 * Project Name:design-pattern-demo
 * File Name:LoggerFactory.java
 * Package Name:com.yuyu2.demo.pattern.factory.method
 * Date:2015年7月29日下午11:57:46
 * Copyright (c) 2015, All Rights Reserved.
 *
*/

package com.yuyu2.demo.pattern.factory.method;
/**
 * ClassName:LoggerFactory
 * Function: TODO ADD FUNCTION.
 * Reason:	 TODO ADD REASON.
 * Date:     2015年7月29日 下午11:57:46
 * @author   zhoudy
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class LoggerFactory {
	public static Logger getLogger(String loggerType)
	{
		if("console".equals(loggerType))
		{
			return new ConsoleLogger();
		}
		else if("txt".equals(loggerType))
		{
			return new TxtLogger();
		}
		else
		{
			throw new RuntimeException("不支持的日志类型");
		}
	}
}

