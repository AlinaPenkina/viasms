package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {
    public static final SelenideElement
     BUTTON_CLOSE_POPUP = $(By.id("close-ready-popup")),
     FIELD_NAME = $(By.xpath("//input[@name='name']")),
     FIELD_SURNAME = $(By.xpath("//input[@name='surname']")),
     FIELD_PESEL = $(By.xpath("//input[@name='pesel']")),
     FIELD_EMAIL = $(By.xpath("//input[@name='email']")),
     FIELD_PLACE = $(By.xpath("//label[text()='Kraj zamieszkania']/following-sibling::input[@type='text']")),
     FIELD_PHONE_PREFIX = $(By.xpath("//input[@name='phone_prefix']")),
     FIELD_PHONE = $(By.xpath("//input[@name='phone']")),
     BUTTON_SUBMIT = $(By.id("submit-nr"));


    //ERROR MESSAGES
    public static final SelenideElement
    LABEL_PESEL_ERROR_MESSAGE = $(By.id("pesel-error"));
}
