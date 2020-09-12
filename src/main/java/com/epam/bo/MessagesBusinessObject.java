package com.epam.bo;

import com.epam.page.objects.GmailHomePage;
import com.epam.page.objects.SentMessagesPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

public class MessagesBusinessObject {
    private static final Logger logger = LogManager.getLogger(MessagesBusinessObject.class);

    private final GmailHomePage gmailHomePage = new GmailHomePage();
    private final SentMessagesPage sentMessagesPage = new SentMessagesPage();

    public void sendMessage(String email, String subject, String messageText) {
        logger.info("Try to send message with incorrect recipient email: " + email);
        gmailHomePage.getComposeButton().getTextAndClick("Написати");
        gmailHomePage.getRecipientEmailField().setText(email);
        gmailHomePage.getMessageSubjectField().setText(subject);
        gmailHomePage.getMessageTextField().setText(messageText);
        gmailHomePage.getSendButton().click();
    }

    public boolean isAlertDisplayed() {
        logger.info("Get alert about incorrect recipient email");
        return gmailHomePage.getAlert().getAlertText().equals("Помилка");
    }

    public void setCorrectEmailAndSendMessage(String email) {
        gmailHomePage.getOkButton().click();
        logger.info("Try to set correct recipient email " + email);
        gmailHomePage.getIncorrectEmail().click();
        gmailHomePage.getRecipientEmailField().clearAndSetText(email);
        gmailHomePage.getSendButton().click();
        gmailHomePage.getNotification().waitForNotification();
        logger.info("Message was successfully sent");
    }

    public String getEmailOfLastMessage() {
        gmailHomePage.getLink().click();
        logger.info("Try to get email of last message from sent messages folder");

        String returnedEmail = sentMessagesPage.getEmailList()
                .stream()
                .limit(1)
                .map(text -> text.getAttribute("email"))
                .collect(Collectors.joining());
        logger.info("Email of last message in sent messages folder is " + returnedEmail);
        return returnedEmail;
    }
}
