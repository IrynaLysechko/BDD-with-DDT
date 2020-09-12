package com.epam.steps;

import com.epam.bo.LoginBusinessObject;
import com.epam.bo.MessagesBusinessObject;
import io.cucumber.java.en.*;

import static com.epam.asserter.MessageAsserter.*;
import static com.epam.utils.Constants.*;
import static com.epam.utils.PropertyFile.getProperty;

public class CucumberGmail {
    private final LoginBusinessObject loginBusinessObject = new LoginBusinessObject();
    private final MessagesBusinessObject messagesBusinessObject = new MessagesBusinessObject();

    @When("^user login using email as ([^\"]*) and password as ([^\"]*)$")
    public void logIn(String email, String password) {
        loginBusinessObject.logIn(email, password);
    }

    @Then("^try to send message using incorrect email as ([^\"]*), subject as ([^\"]*),  message text as ([^\"]*)$")
    public void sendMessageUsingIncorrectEmail(String incorrectEmail, String subject, String messageText) {
        messagesBusinessObject.sendMessage(incorrectEmail, subject, messageText);
    }

    @And("^waring message appears$")
    public void verifyWarningMessage() {
        assertThatAlertIsDisplayed(messagesBusinessObject.isAlertDisplayed());
    }

    @Then("^enter correct email as ([^\"]*) and send message$")
    public void enterCorrectEmailAndSendMessage(String correctEmail) {
        messagesBusinessObject.setCorrectEmailAndSendMessage(correctEmail);
    }

    @And("^verify that message with email as ([^\"]*) present in 'Sent messages' folder$")
    public void checkSentMessagesFolder(String correctEmail) {
        String returnedEmail = messagesBusinessObject.getEmailOfLastMessage();
        assertThatEmailsAreEquals(returnedEmail, correctEmail);
    }
}
