package steps;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.Assert;

public class RegistrationSteps {

    @Step
    public static void fillTheFieldOnRegisterPage(SelenideElement element, String text) {
        element.sendKeys(text);
    }
    @Step
    public static void assertErrorMessage(SelenideElement element, String errorMessage) {
        Assert.assertEquals(errorMessage, element.getText());
    }
}
