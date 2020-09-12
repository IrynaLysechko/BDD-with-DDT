package com.epam.bo;

import com.epam.page.objects.GmailLoginPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoginBusinessObject {
    private static final Logger logger = LogManager.getLogger(LoginBusinessObject.class);
    private final GmailLoginPage gmailLoginPage = new GmailLoginPage();

    public void logIn(String email, String password) {
        logger.info("Set user email: " + email);
        gmailLoginPage.getEmailField().setTextAndSend(email);

        logger.info("Set user password: " + password);
        gmailLoginPage.getPasswordField().setTextAndSend(password);
    }
}
