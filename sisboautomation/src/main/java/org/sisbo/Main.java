package org.sisbo;

import org.sisbo.handlers.MainHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author dfernandez
 * @date 12/8/2017.
 */
@Configuration
@ComponentScan
public class Main {

    public static void main(String[] args){

        MainHandler mainHandler = new MainHandler();
        mainHandler.executeAutomation();
    }
}
