package com.epam.steps;

import com.epam.factory.DriverManager;
import com.epam.utils.PropertyFile;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import static com.epam.utils.Constants.URL;

public class Hooks {
    @Before
    public void setUp() {
        DriverManager.getDriver().get(PropertyFile.getProperty(URL));
    }

    @After
    public void turnDown() {
        DriverManager.quitDriver();
    }
}
