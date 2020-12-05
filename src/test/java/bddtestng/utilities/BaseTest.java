package bddtestng.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    private static WebDriver driver;

    private static WebDriver startDriver(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/Administrator/Downloads/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
    }

    public static WebDriver getDriver(){

        if(driver != null){
            return driver;
        }
        WebDriver driver = startDriver();
        return driver;

    }

    public static void closeDriver(){

    }
}
