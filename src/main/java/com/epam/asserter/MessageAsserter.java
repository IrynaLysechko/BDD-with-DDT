package com.epam.asserter;

import org.testng.Assert;

public class MessageAsserter {

    public static void assertThatAlertIsDisplayed(boolean isDisplayed) {
        Assert.assertTrue(isDisplayed, "Alert about error isn't displayed.");
    }

    public static void assertThatEmailsAreEquals(String actualSubject, String expectedSubject) {
        Assert.assertEquals(actualSubject, expectedSubject,
                "The email of last message in sent massages folder isn't equals to expected.");
    }
}
