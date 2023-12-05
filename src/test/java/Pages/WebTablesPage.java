package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class WebTablesPage extends BasePage{
    public WebTablesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="addNewRecordButton")
    private WebElement addButton;
    @FindBy(id="firstName")
    private WebElement firstName;
    @FindBy(id="lastName")
    private WebElement lastName;
    @FindBy(id="userEmail")
    private WebElement emailAddress;
    @FindBy(id="age")
    private WebElement ageElement;
    @FindBy(id="salary")
    private WebElement salaryElement;
    @FindBy(id="department")
    private WebElement departmentElement;
    @FindBy(xpath = "//button[text()='Submit']")
    private WebElement submitButton;
    @FindBy(xpath = "//div[@class='rt-tbody']/div/div[@class='rt-tr -odd' or @class='rt-tr -even']")
    private List<WebElement> actualEntries;



//    @FindBy(xpath= "//div[@class='rt-tbody']/div/div[@class='rt-tr -odd' or @class='rt-tr -even' ]")
//    private List<WebElement> expectedEntries;   nu se mai introduce pentru ca ai deja definit in actual entries, el il stie deja

    public void addNewEntry(String firstNameValue, String lastNameValue, String emailAddressValue, String ageValue,
                            String salaryValue, String departmentValue){
        Integer actualTableSize= actualEntries.size();
//        addButton.click();
        elementMethods.clickElement(addButton);
        firstName.sendKeys(firstNameValue);
        lastName.sendKeys(lastNameValue);
        emailAddress.sendKeys(emailAddressValue);
        ageElement.sendKeys(ageValue);
        salaryElement.sendKeys(salaryValue);
        departmentElement.sendKeys(departmentValue);
        submitButton.click();

        //metoda asta adauga entry-uri noi, apoi vine medota de mai jos care valideaza ca 3+1 = 4.

        validateNewEntry(actualTableSize, firstNameValue, lastNameValue, emailAddressValue, ageValue, salaryValue, departmentValue);
    }
    private void validateNewEntry(Integer actualTableSize, String firstNameValue, String lastNameValue, String emailAddressValue, String ageValue,
                                  String salaryValue, String departmentValue){
        Integer expectedTableSize = actualEntries.size();
        Assert.assertTrue(actualTableSize+1 == expectedTableSize);
        String lastEntryTable = actualEntries.get(actualTableSize).getText();

        Assert.assertTrue(lastEntryTable.contains(firstNameValue));
        Assert.assertTrue(lastEntryTable.contains(lastNameValue));
        Assert.assertTrue(lastEntryTable.contains(emailAddressValue));
        Assert.assertTrue(lastEntryTable.contains(ageValue));
        Assert.assertTrue(lastEntryTable.contains(ageValue));
        Assert.assertTrue(lastEntryTable.contains(salaryValue));
        Assert.assertTrue(lastEntryTable.contains(departmentValue));




    }


//    public void addRecord(){addButton.click();}
//
//
//
//    public void fillWebTable(String firstName, String lastName, String emailAddress, String ageValue,
//                             String salaryValue, String departmentValue ){
//        fillFirstName(firstName);
//        fillLastName(lastName);
//        fillEmail(emailAddress);
//        fillAge(ageValue);
//        fillSalary(salaryValue);
//        fillDepartment(departmentValue);
//    }
//
//    private void validateNewEntry(Integer actuaTableSize){
//        Integer expectedTableSize= actualEntries.size();
//
//    }
//
//    public void  fillFirstName(String firstNameValue){ firstName.sendKeys(firstNameValue);}
//    public void fillLastName(String lastNameValue){
//        lastName.sendKeys(lastNameValue);
//    }
//    public void fillEmail(String  emailAddressValue){
//        emailAddress.sendKeys(emailAddressValue);
//    }
//    public void fillAge(String ageValue){
//        ageElement.sendKeys(ageValue);
//    }
//    public void fillSalary(String salaryValue){
//        salaryElement.sendKeys(salaryValue);
//    }
//    public void fillDepartment(String departmentValue){
//        departmentElement.sendKeys(departmentValue);
//    }
//
//        public void submitButton(){submitButton.click();}
//
//    public void validateWebTable(String firstNameValue, String lastNameValue, String ageValue, String emailAddressValue,
//                                 String salaryValue, String departmentValue){
//
//        String lastEntryTable = expectedEntries.get(3).getText();
//
//        Assert.assertTrue(lastEntryTable.contains(firstNameValue));
//        Assert.assertTrue(lastEntryTable.contains(lastNameValue));
//        Assert.assertTrue(lastEntryTable.contains(ageValue));
//        Assert.assertTrue(lastEntryTable.contains(emailAddressValue));
//        Assert.assertTrue(lastEntryTable.contains(salaryValue));
//        Assert.assertTrue(lastEntryTable.contains(departmentValue));
//
//    }
//    public void validateTableSize(){
//        Integer actualTableSize = actualEntries.size();
//        Integer expectedTableSize = expectedEntries.size();
//        Assert.assertEquals(actualTableSize, expectedTableSize);
//        System.out.println(actualTableSize);
//        System.out.println(expectedTableSize);
//    }

//    public void readFile() throws IOException, InterruptedException{
//        FileReader reader = new FileReader("src/test/resources/valuesDocument.properties.txt");
//
//        Properties props=new Properties();
//
//        props.load(reader);
//
//        String firstNameValue= props.getProperty("firstName");
//        String lastName = props.getProperty("lastName");
//        String emailAddress= props.getProperty("emailAddress");
//        String ageValue= props.getProperty("age");
//        String salaryValue= props.getProperty("salary");
//        String departmentValue=props.getProperty("department");









    }

