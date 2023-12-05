package Tests;

import Pages.FormsPage;
import Pages.HomePage;
import Pages.PracticeFormsPage;
import SharedData.SharedData;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Properties;

public class FormTableTest extends SharedData {


    @Test
    public void test_method() {

        HomePage homePage = new HomePage(getDriver());
        homePage.clickForms();

        FormsPage formsPage = new FormsPage(getDriver());
        formsPage.clickPracticeForms();

        String firstNameValue = "Roxana";
        String lastNameValue = "Petrila";
        String emailAddressValue = "emailtest@test.ro";
        String mobileValue = "0712345678";
        String subjectsValue = "English";
        String addressValue = "Test, nr.test";
        String stateValue = "NCR";
        String cityValue = "Delhi";
        String expectedMessage = "Thanks for submitting the form";

        PracticeFormsPage practiceFormsPage = new PracticeFormsPage(getDriver());
        practiceFormsPage.fillPracticeForm(firstNameValue, lastNameValue, emailAddressValue, mobileValue, subjectsValue,
                addressValue, stateValue, cityValue);

        List<String> FormValues = practiceFormsPage.getValuesForm();
        practiceFormsPage.clickSubmit();// aduce valorile pe care le-am adus cu lista de elemente

        practiceFormsPage.validatePractiveForm(expectedMessage, firstNameValue, lastNameValue, emailAddressValue,
                FormValues.get(0), mobileValue, subjectsValue, FormValues.get(1), addressValue, stateValue, cityValue);

        practiceFormsPage.clickCose();
    }
}
