package com.epam.factory;

import com.epam.utils.PropertyFile;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static com.epam.utils.Constants.*;

public class DriverFactory {
    private static final Logger logger = LogManager.getLogger(DriverFactory.class);
    private static final int implicitly_wait = 20;

    public static WebDriver createDriver(Browser browser) {
        WebDriver driver = null;
        logger.info("Start creating a driver " + browser);

        switch (browser) {
            case CHROME:
                System.setProperty(PropertyFile.getProperty(CHROME_DRIVER), PropertyFile.getProperty(CHROME_DRIVER_PATH));
                driver = new ChromeDriver();
                break;
            case FIREFOX:
                System.setProperty(PropertyFile.getProperty(FIREFOX_DRIVER), PropertyFile.getProperty(FIREFOX_DRIVER_PATH));
                driver = new FirefoxDriver();
                break;
        }

        driver.manage().timeouts().implicitlyWait(implicitly_wait,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        logger.info("Driver " + browser + " was successfully created");

        return driver;
    }
}
