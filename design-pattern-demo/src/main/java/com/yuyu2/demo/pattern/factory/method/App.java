package com.yuyu2.demo.pattern.factory.method;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Logger logger = LoggerFactory.getLogger("console");
        logger.writeLog("hello world!");
        
        logger = LoggerFactory.getLogger("txt");
        logger.writeLog("hello world!");
    }
}
