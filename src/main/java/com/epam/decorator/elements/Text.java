package com.epam.decorator.elements;

import com.epam.decorator.AbstractElement;
import com.epam.utils.Wait;
import org.openqa.selenium.WebElement;

public class Text extends AbstractElement {

    public Text(WebElement webElement) {
        super(webElement);
    }

    public void click() {
        Wait.waitForClickable(webElement);
        webElement.click();
    }

    public String getAttribute(String attribute) {
        return webElement.getAttribute(attribute);
    }
}
