package tests;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Story;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import steps.BaseMethods;
import steps.RegistrationSteps;

import static fixtures.Variables.*;
import static pages.RegistrationPage.*;


public class RegistrationTest extends BaseMethods {
    RegistrationSteps registrationSteps = new RegistrationSteps();

    @Before
    public void before() {
        openLoginPage("https://vialet.pl/register");
        clickButton(BUTTON_CLOSE_POPUP);
    }

    @Story("Registration with correct registration data")
    @Test
    public void test01_registration_with_correct_registration_data() {
        registrationSteps.fillTheFieldOnRegisterPage(FIELD_NAME, NAME);
        registrationSteps.fillTheFieldOnRegisterPage(FIELD_SURNAME, SURNAME);
        registrationSteps.fillTheFieldOnRegisterPage(FIELD_PESEL, "70082742729");
        registrationSteps.fillTheFieldOnRegisterPage(FIELD_EMAIL, EMAIL);
        registrationSteps.fillTheFieldOnRegisterPage(FIELD_PHONE, "125898984");
        clickButton(BUTTON_SUBMIT);
        registrationSteps.assertLabelWithTextExists("Kod PIN *");
    }

    @Story("Registration with wrong pesel number")
    @Test
    public void test02_registration_with_wrong_pesel_number() {
        registrationSteps.fillTheFieldOnRegisterPage(FIELD_NAME, NAME);
        registrationSteps.fillTheFieldOnRegisterPage(FIELD_SURNAME, SURNAME);
        registrationSteps.fillTheFieldOnRegisterPage(FIELD_PESEL, "1234567890");
        registrationSteps.fillTheFieldOnRegisterPage(FIELD_EMAIL, EMAIL);
        registrationSteps.fillTheFieldOnRegisterPage(FIELD_PHONE, "125898984");
        clickButton(BUTTON_SUBMIT);
        registrationSteps.assertErrorMessage(LABEL_PESEL_ERROR_MESSAGE, "Podaj prawidłowy kod pesel");
    }

    @AfterClass
    public static void tearDown() {
        Selenide.clearBrowserCookies();
    }
}