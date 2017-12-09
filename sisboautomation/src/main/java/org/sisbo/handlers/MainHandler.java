package org.sisbo.handlers;

import org.sisbo.components.login.LoginComponent;
import org.sisbo.components.login.LoginService;
import org.sisbo.utils.Constants;

/**
 * @author dfernandez
 * @date 12/8/2017.
 */
public class MainHandler {

    LoginService loginService;

    public MainHandler(){
        loginService = new LoginComponent();
    }

    public void executeAutomation(){
        run("login_screen");
        run("module_sales");
    }

    private void run(String command){
        if(command.equals(Constants.LOGIN_SCREEN)){
            loginService.executeLoginScreen();
        }
        if(command.equals(Constants.MODULE_SALES)){

        }
    }
}
