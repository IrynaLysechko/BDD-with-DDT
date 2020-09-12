package com.epam.utils;

import com.epam.factory.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

    public static void waitForVisibility(WebElement element) {
        new WebDriverWait(DriverManager.getDriver(), 20)
                .until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitForClickable(WebElement element) {
        new WebDriverWait(DriverManager.getDriver(), 20)
                .until(ExpectedConditions.elementToBeClickable(element));
    }
}
