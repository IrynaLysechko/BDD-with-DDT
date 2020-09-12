package com.epam.page.objects;

import com.epam.decorator.elements.Alert;
import com.epam.decorator.elements.Button;
import com.epam.decorator.elements.Text;
import com.epam.decorator.elements.TextField;
import org.openqa.selenium.support.FindBy;

public class GmailHomePage extends AbstractPage {
    @FindBy(xpath = "//div[@class='z0']/*[@role='button']")
    private Button composeButton;

    @FindBy(xpath = "//textarea[@class='vO']")
    private TextField recipientField;

    @FindBy(name = "subjectbox")
    private TextField subjectField;

    @FindBy(xpath = "//div[@class='Am Al editable LW-avf tS-tW']")
    private TextField messageField;

    @FindBy(xpath = "//div[text()='Надіслати']")
    private Button sendButton;

    @FindBy(xpath = "//div[@class='Kj-JD-K7 Kj-JD-K7-bsT']/span[1]")
    private Alert alert;

    @FindBy(name = "ok")
    private Button acceptButton;

    @FindBy(css = "div.TK .aim:nth-child(4)")
    private Text sentMessagesLink;

    @FindBy(xpath = "//div[@class='oL aDm az9']")
    private Text incorrectEmail;

    @FindBy(xpath = "//span[text()='Лист надіслано.']")
    private Alert notification;

    public Button getComposeButton() {
        return composeButton;
    }

    public TextField getRecipientEmailField() {
        return recipientField;
    }

    public TextField getMessageSubjectField() {
        return subjectField;
    }

    public TextField getMessageTextField() {
        return messageField;
    }

    public Button getSendButton() {
        return sendButton;
    }

    public Text getIncorrectEmail() {
        return incorrectEmail;

    }

    public Alert getAlert() {
        return alert;
    }

    public Button getOkButton() {
        return acceptButton;
    }

    public Alert getNotification() {
        return notification;
    }

    public Text getLink() {
        return sentMessagesLink;
    }
}
