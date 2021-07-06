package steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationSteps {

    @Step
    public static void fillTheFieldOnRegisterPage(SelenideElement element, String text) {
        element.sendKeys(text);
    }
    @Step
    public static void assertErrorMessage(SelenideElement element, String errorMessage) {
        Assert.assertEquals(errorMessage, element.getText());
    }
    @Step
    public static void assertLabelWithTextExists(String text){
        SelenideElement
                LABEL = $(By.xpath("//label[text()='"+text+"']"));
       Assert.assertTrue(LABEL.is(Condition.visible));
    }
}
