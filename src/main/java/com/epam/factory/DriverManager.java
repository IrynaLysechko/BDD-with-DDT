package com.epam.factory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class DriverManager {
    private static final Logger logger = LogManager.getLogger(DriverManager.class);

    private static final ThreadLocal<WebDriver> WEBDRIVER_POOL = new ThreadLocal<>();

    private DriverManager() {
    }

    public static WebDriver getDriver() {
        if (WEBDRIVER_POOL.get() == null) {
            WEBDRIVER_POOL.set(DriverFactory.createDriver(Browser.CHROME));
        }
        return WEBDRIVER_POOL.get();
    }

    public static void quitDriver() {
        if (WEBDRIVER_POOL.get() != null) {
            logger.info("Remove driver from driver poll");
            WEBDRIVER_POOL.get().quit();
            WEBDRIVER_POOL.set(null);
        }
    }
}
