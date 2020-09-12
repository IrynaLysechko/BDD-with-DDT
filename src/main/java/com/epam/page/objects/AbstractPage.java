package com.epam.page.objects;

import com.epam.decorator.wrapperFactory.CustomFieldDecorator;
import com.epam.factory.DriverManager;
import org.openqa.selenium.support.PageFactory;

public class AbstractPage {

    public AbstractPage() {
        PageFactory.initElements(new CustomFieldDecorator(DriverManager.getDriver()), this);
    }
}
