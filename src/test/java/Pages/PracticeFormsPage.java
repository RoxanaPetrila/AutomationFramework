package Pages;

import Logger.LoggerUtility;
import ObjectData.FormTableObject;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class PracticeFormsPage extends BasePage {

    public PracticeFormsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="firstName")
    private WebElement firstName;

    @FindBy (id="lastName")
    private WebElement lastName;

    @FindBy (id="userEmail")
    private WebElement emailAddress;

    @FindBy (xpath = "//label[@for='gender-radio-2']")
    private  WebElement gender;

    @FindBy (id="userNumber")
    private WebElement mobile;

    @FindBy(id="subjectsInput")
    private WebElement subjects;

    @FindBy(xpath ="//label[@for='hobbies-checkbox-2']")
    private  WebElement reading;

    @FindBy(id="uploadPicture")
    private WebElement uploadPicture;

    @FindBy(id="currentAddress")
    private WebElement address;

    @FindBy(id="state")
    private WebElement state;

    @FindBy(id="react-select-3-input")
    private WebElement selectState;

    @FindBy(id="city")
    private WebElement city;

    @FindBy(id="react-select-4-input")
    private WebElement selectCity;

    @FindBy(id="submit")
    private WebElement submitButton;

    @FindBy(id="example-modal-sizes-title-lg")
    private WebElement thanksMessage;

    @FindBy(css=".table-dark>tbody>tr")
    private List<WebElement> validationTable;

    @FindBy(id="closeLargeModal")
    private WebElement closeButton;

    public void fillPracticeForm(FormTableObject formTableObject){
        fillFirstName(formTableObject.getFirstNameValue());
        fillLastName(formTableObject.getLastNameValue());
        fillUserEmail(formTableObject.getEmailAddressValue());
        fillGender();
        fillMobile(formTableObject.getMobileValue());
        fillSubjects(formTableObject.getSubjectsValue());
        elementMethods.scrollByPixels(0,400);
        fillReading();
        fillAddress(formTableObject.getAddressValue());
        fillState(formTableObject.getStateValue());
        fillCity(formTableObject.getCityValue());

    }
    //facem o metoda cu return care sa fie o multime ce preia valorile de pe cele 2
    public List<String> getValuesForm(){
        List<String> formValues = new ArrayList<>();
        formValues.add(gender.getText());
        formValues.add(reading.getText());
        return formValues;
    }

    public void fillFirstName(String firstNameValue){
        elementMethods.fillElement(firstName, firstNameValue);
//        firstName.sendKeys(firstNameValue);
        LoggerUtility.info("The user fills first name" + firstNameValue);
    }

    public void fillLastName(String lastNAmeValue){
        lastName.sendKeys(lastNAmeValue);
        LoggerUtility.info("The user fills last name: " + lastNAmeValue);
    }

    public void fillUserEmail(String emailAddressValue){
        emailAddress.sendKeys(emailAddressValue);
        LoggerUtility.info("The user fills email address: " + emailAddressValue);
    }

    public void fillGender(){
        elementMethods.clickElement(gender);
        LoggerUtility.info("The user clicks on gender " + gender);
//        gender.click();


    }

    public void fillMobile(String mobileValue){
        mobile.sendKeys(mobileValue);
        LoggerUtility.info("The user fills mobile value: " +  mobileValue);
    }

    public void fillSubjects(String subjectsValue){
        elementMethods.fillElement(subjects, subjectsValue, Keys.ENTER);
        LoggerUtility.info("The user fills subject value: " + subjectsValue);
//        subjects.sendKeys(subjectsValue);
//        subjects.sendKeys(Keys.ENTER);
    }

    public void fillReading(){
        reading.click();
        LoggerUtility.info("The user clicks reading");

    }
//    public void fillUploadPicture(){
//        File file = new File("src/test/resources/New Rich Text Document.rtf");
//        uploadPicture.sendKeys(file.getAbsolutePath());
//    }

    public void fillAddress(String addressValue){
       address.sendKeys(addressValue);
        LoggerUtility.info("The user fills address value " + addressValue);
    }

    public void fillState(String stateValue) {
        elementMethods.scrollByPixels(0,450);
        LoggerUtility.info("The user scrolls down the page");
        elementMethods.clickJSElement(state);
        LoggerUtility.info("The user clicks on state");
        elementMethods.fillElement(selectState, stateValue, Keys.ENTER);
        LoggerUtility.info("The user state value " + stateValue);

//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,450)", "");
//        state.click();
//        selectState.sendKeys(stateValue);
//        selectState.sendKeys(Keys.ENTER);
    }

    public void fillCity(String cityValue){
        elementMethods.clickJSElement(city);
        LoggerUtility.info("The user clicks on city");
        elementMethods.fillElement(selectCity, cityValue, Keys.ENTER);
        LoggerUtility.info("The user fills city value " + cityValue);

//       city.click();
//       selectCity.sendKeys(cityValue);
//        selectCity.sendKeys(Keys.ENTER);
    }

    public void clickSubmit(){
        elementMethods.clickJSElement(submitButton);
        LoggerUtility.info("The user clicks submit button");
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//       js.executeScript("arguments[0].click();", submitButton);

    }

    public void clickCose(){
        closeButton.sendKeys(Keys.ENTER);
        LoggerUtility.info("The user clicks close.");
    }

    public void validatePractiveForm(String expectedMessage, String firstNameValue, String lastNameValue, String emailAddressValue,
                                     String genderValue, String mobileValue, String subjectsValue, String readingValue,
                                     String addressValue, String stateValue, String cityValue){

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM,yyyy");
        LocalDateTime now = LocalDateTime.now();
        String dateOfBirthValue = dtf.format(now);

        elementMethods.validateElementMessage(thanksMessage, expectedMessage);


//        String actualMessage = thanksMessage.getText();
//        Assert.assertEquals(actualMessage, expectedMessage);


        Assert.assertTrue(validationTable.get(0).getText().contains("Student Name"));
        Assert.assertTrue(validationTable.get(0).getText().contains(firstNameValue + " " + lastNameValue));

        Assert.assertTrue(validationTable.get(1).getText().contains("Student Email"));
        Assert.assertTrue(validationTable.get(1).getText().contains(emailAddressValue));

        Assert.assertTrue(validationTable.get(2).getText().contains("Gender"));
        Assert.assertTrue(validationTable.get(2).getText().contains(genderValue));

        Assert.assertTrue(validationTable.get(3).getText().contains("Mobile"));
        Assert.assertTrue(validationTable.get(3).getText().contains(mobileValue));

        Assert.assertTrue(validationTable.get(4).getText().contains("Date of Birth"));
        Assert.assertTrue(validationTable.get(4).getText().contains(dateOfBirthValue));

        Assert.assertTrue(validationTable.get(5).getText().contains("Subjects"));
        Assert.assertTrue(validationTable.get(5).getText().contains(subjectsValue));

        Assert.assertTrue(validationTable.get(6).getText().contains("Hobbies"));
        Assert.assertTrue(validationTable.get(6).getText().contains(readingValue));

//        Assert.assertTrue(validationTable.get(7).getText().contains("Picture"));
//        Assert.assertTrue(validationTable.get(7).getText().contains(file.getName()));

        Assert.assertTrue(validationTable.get(8).getText().contains("Address"));
        Assert.assertTrue(validationTable.get(8).getText().contains(addressValue));

        Assert.assertTrue(validationTable.get(9).getText().contains("State and City"));
        Assert.assertTrue(validationTable.get(9).getText().contains(stateValue + " " + cityValue));
    }


}
