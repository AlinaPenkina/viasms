package steps;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.open;

public class BaseMethods {
    @Step
    public void openLoginPage(String URL) {
        Selenide.clearBrowserCookies();
        open(URL);
        Selenide.sleep(3000);
    }

    @Step
    public static void clickButton(SelenideElement element) {
        element.click();
    }
}
