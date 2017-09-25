package utils;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ChromeDriverSingleton {
    private static ChromeDriver driver = null;

    private ChromeDriverSingleton() {
    }

    public static ChromeDriver getDriver() {
        if (driver == null) {
//      System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            driver = new ChromeDriver(){
                {
                    manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                }
            };
        }
        return driver;
    }
}
