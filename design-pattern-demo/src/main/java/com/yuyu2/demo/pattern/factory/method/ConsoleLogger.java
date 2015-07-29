/**
 * Project Name:design-pattern-demo
 * File Name:ConsoleLogger.java
 * Package Name:com.yuyu2.demo.pattern.factory.method
 * Date:2015年7月29日下午11:29:21
 * Copyright (c) 2015, All Rights Reserved.
 *
*/

package com.yuyu2.demo.pattern.factory.method;
/**
 * ClassName:ConsoleLogger
 * Function: TODO ADD FUNCTION.
 * Reason:	 TODO ADD REASON.
 * Date:     2015年7月29日 下午11:29:21
 * @author   zhoudy
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class ConsoleLogger implements Logger{

	public void writeLog(String info) {
		
		System.out.println(info);
		
	}

}

