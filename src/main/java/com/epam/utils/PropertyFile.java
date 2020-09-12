package com.epam.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {
    private static final Logger logger = LogManager.getLogger(PropertyFile.class);

    private final static String CONFIG_PROPERTIES = "src\\main\\resources\\config.properties";
    private static final Properties properties = new Properties();

    private PropertyFile() {
    }

    private static void readProperties() {
        try (FileInputStream inputStream = new FileInputStream(CONFIG_PROPERTIES)) {
            properties.load(inputStream);
        } catch (IOException e) {
            logger.warn("Can't find file using this path");
        }
    }
    public static String getProperty(String name) {
        readProperties();
        return properties.getProperty(name);
    }
}