package com.epam.page.objects;

import com.epam.decorator.elements.TextField;
import org.openqa.selenium.support.FindBy;

public class GmailLoginPage extends AbstractPage {
    @FindBy(id = "identifierId")
    private TextField emailField;

    @FindBy(xpath = "//div[@id='password']//input")
    private TextField passwordField;

    public TextField getEmailField() {
        return emailField;
    }

    public TextField getPasswordField() {
        return passwordField;
    }
}
