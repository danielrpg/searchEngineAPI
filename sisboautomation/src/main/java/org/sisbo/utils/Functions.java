package org.sisbo.utils;

/**
 * @author dfernandez
 * @date 12/8/2017.
 */
public class Functions {
    public static void sleepProcess(long sleepTime){
        try{
            Thread.sleep(sleepTime);
        }catch (InterruptedException ie){

        }
    }
}
