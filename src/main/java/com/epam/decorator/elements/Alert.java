package com.epam.decorator.elements;

import com.epam.decorator.AbstractElement;
import com.epam.utils.Wait;
import org.openqa.selenium.WebElement;

public class Alert extends AbstractElement {

    public Alert(WebElement webElement) {
        super(webElement);
    }

    public String getAlertText() {
        Wait.waitForVisibility(webElement);
        return webElement.getText();
    }

    public void waitForNotification() {
        Wait.waitForVisibility(webElement);
    }
}
