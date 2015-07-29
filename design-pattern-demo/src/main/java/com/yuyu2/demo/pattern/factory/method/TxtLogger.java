/**
 * Project Name:design-pattern-demo
 * File Name:TxtLogger.java
 * Package Name:com.yuyu2.demo.pattern.factory.method
 * Date:2015年7月29日下午11:29:41
 * Copyright (c) 2015, All Rights Reserved.
 *
*/

package com.yuyu2.demo.pattern.factory.method;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * ClassName:TxtLogger
 * Function: TODO ADD FUNCTION.
 * Reason:	 TODO ADD REASON.
 * Date:     2015年7月29日 下午11:29:41
 * @author   zhoudy
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class TxtLogger implements Logger{
    private String LOG_NAME = "test.log";
	
    public void writeLog(String info) {
		
		File file =new File(LOG_NAME);
		
		Writer writer = null;
		try {
			writer = new FileWriter(file);
			writer.write(info);
			writer.close();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		
	}

}

