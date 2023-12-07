package Tests;

import ObjectData.FormTableObject;
import Pages.FormsPage;
import Pages.HomePage;
import Pages.PracticeFormsPage;
import SharedData.SharedData;
import org.testng.annotations.Test;
import SharedData.Hooks;
import java.util.List;
import java.util.Properties;

public class FormTableTest extends Hooks {


    @Test
    public void test_method() {

        FormTableObject formTableObject = new FormTableObject(testData);


        HomePage homePage = new HomePage(getDriver());
        homePage.clickForms();

        FormsPage formsPage = new FormsPage(getDriver());
        formsPage.clickPracticeForms();


        PracticeFormsPage practiceFormsPage = new PracticeFormsPage(getDriver());
        practiceFormsPage.fillPracticeForm(formTableObject);

        List<String> FormValues = practiceFormsPage.getValuesForm();
        practiceFormsPage.clickSubmit();// aduce valorile pe care le-am adus cu lista de elemente

//        practiceFormsPage.validatePractiveForm(expectedMessage, firstNameValue, lastNameValue, emailAddressValue,
//                FormValues.get(0), mobileValue, subjectsValue, FormValues.get(1), addressValue, stateValue, cityValue);

        practiceFormsPage.clickCose();
    }
}
