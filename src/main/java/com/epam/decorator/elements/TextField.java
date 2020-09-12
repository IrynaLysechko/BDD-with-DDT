package com.epam.decorator.elements;

import com.epam.decorator.AbstractElement;
import com.epam.utils.Wait;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class TextField extends AbstractElement {

    public TextField(WebElement webElement) {
        super(webElement);
    }

    public void setTextAndSend(String text) {
        Wait.waitForVisibility(webElement);
        webElement.sendKeys(text);
        webElement.sendKeys(Keys.ENTER);
    }

    public void clearAndSetText(String text) {
        Wait.waitForVisibility(webElement);
        webElement.sendKeys(Keys.BACK_SPACE);
        webElement.sendKeys(text);
    }

    public void setText(String text) {
        Wait.waitForClickable(webElement);
        webElement.sendKeys(text);
    }
}

