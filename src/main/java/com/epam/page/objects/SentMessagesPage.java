package com.epam.page.objects;

import com.epam.decorator.elements.Text;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SentMessagesPage extends AbstractPage {
    @FindBy(xpath = "//div[text()='Кому: ']/span")
    private List<Text> emailList;

    public List<Text> getEmailList() {
        return emailList;
    }
}
