package org.sisbo.components.login;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.sisbo.utils.Functions;
import org.sisbo.utils.Properties;


/**
 * @author dfernandez
 * @date 12/8/2017.
 */
public class LoginComponent implements LoginService{


    public void executeLoginScreen() {
        //System.setProperty("webdriver.chrome.driver", "E:\\server\\webdrivers\\chromedriver.exe");
        System.setProperty(Properties.WEB_DRIVER_GECKO, Properties.PATH_WEB_DRIVER);
        DesiredCapabilities capabilities= DesiredCapabilities.firefox();
        capabilities.setCapability(Properties.DRIVER_CAPABILITI, Boolean.TRUE);
        WebDriver driver = new FirefoxDriver(capabilities);
        driver.get(Properties.PATH_PROJECT);
        driver.findElement(By.id("txt_login")).sendKeys("super");
        Functions.sleepProcess(500);
        driver.findElement(By.id("txt_password")).sendKeys("chichi");
        Functions.sleepProcess(500);
        driver.findElement(By.name("enviar")).click();
        Functions.sleepProcess(500);
    }
}
