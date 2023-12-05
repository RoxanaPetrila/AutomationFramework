package Tests;

import Pages.ElementsPage;
import Pages.HomePage;
import Pages.WebTablesPage;
import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.*;
import java.util.List;
import java.util.Properties;

public class WebTableTest extends SharedData {



    @Test

    public void test_method() throws IOException {

        //primul lucru - trebuie sa intrape  driver-ul web si sa viziteze un site

//        driver= new ChromeDriver();
//        driver.get("https://demoqa.com/");
//        driver.manage().window().maximize();

//        JavascriptExecutor js = (JavascriptExecutor) getDriver();
//        js.executeScript("window.scrollBy(0,450)", "");

        HomePage homePage = new HomePage(getDriver());
        homePage.clickElements();

        ElementsPage elementsPage = new ElementsPage(getDriver());
        elementsPage.clickWebTables();

        FileReader reader = new FileReader("src/test/resources/valuesDocument.properties.txt");

        Properties props=new Properties();
        props.load(reader);
        String firstNameValue= props.getProperty("firstName");
        String lastNameValue = props.getProperty("lastName");
        String emailAddressValue= props.getProperty("emailAddress");
        String ageValue= props.getProperty("age");
        String salaryValue= props.getProperty("salary");
        String departmentValue=props.getProperty("department");

        WebTablesPage webTablesPage = new WebTablesPage(getDriver());
        webTablesPage.addNewEntry(firstNameValue, lastNameValue, emailAddressValue, ageValue, salaryValue, departmentValue);


//        webTablesPage.addRecord();
//        webTablesPage.fillWebTable(firstNameValue, lastName, emailAddress, ageValue, salaryValue, departmentValue );
//        webTablesPage.submitButton();
//        webTablesPage.validateWebTable(firstNameValue, lastName, emailAddress, ageValue, salaryValue, departmentValue);
//        webTablesPage.validateTableSize();


//        WebElement elements = driver.findElement(By.xpath("//h5[text()='Elements']"));
////        Actions action= new Actions(driver);
////        action.moveToElement(elements).perform();
//        elements.click();

//        WebElement webTables = driver.findElement(By.xpath("//span[text()='Web Tables']"));
//        webTables.click();

        //faci o lista care sa gaseasca intreg tabelul si intrarile existente in el (randurile lui)

//        List<WebElement> actualEntries = driver.findElements(By.xpath("//div[@class='rt-tbody']/div/div[@class='rt-tr -odd' or @class='rt-tr -even']"));
//        Integer actualTableSize = actualEntries.size();

        //Incepi sa introduci elemente in tabel

//        WebElement addButton = driver.findElement(By.id("addNewRecordButton"));
//        addButton.click();
//
//        WebElement firstNameElement = driver.findElement(By.id("firstName"));
//        String firstNameValue = "Roxana";
//        firstNameElement.sendKeys(firstNameValue);
//
//        WebElement lastNameElement = driver.findElement(By.id("lastName"));
//        String lastNameValue = "Petrila";
//        lastNameElement.sendKeys(lastNameValue);
//
//        WebElement emailAddressElement = driver.findElement(By.id("userEmail"));
//        String emailAddressValue = "roxana.petrila@test.ro";
//        emailAddressElement.sendKeys(emailAddressValue);
//
//        WebElement ageElement = driver.findElement(By.id("age"));
//        String ageValue = "26";
//        ageElement.sendKeys(ageValue);
//
//        WebElement salaryElement = driver.findElement(By.id("salary"));
//        String salaryValue = "2000";
//        salaryElement.sendKeys(salaryValue);
//
//        WebElement departmentElement = driver.findElement(By.id("department"));
//        String departmentValue= "QA";
//        departmentElement.sendKeys(departmentValue);
//
//        WebElement submitButtonElement = driver.findElement(By.xpath("//button[text()='Submit']"));
//        submitButtonElement.click();

        //dupa introducere, faci o noua lista care verifica lista actuala cu lista expected
//
//        List<WebElement>  expectedEntries = driver.findElements(By.xpath("//div[@class='rt-tbody']/div/div[@class='rt-tr -odd' or @class='rt-tr -even' ]"));
//        Integer expectedTablesize=expectedEntries.size();
//
//        //validarea ca dimenziunea listei 1 + 1 elem adaugat = expected size - elementul s-a adaugat in lista
//
//        Assert.assertTrue(actualTableSize+1 == expectedTablesize);
//
//        //se ia textul intreg de pe ultima linie a listei expectate si se verifica daca elementele adaugate sunt corecte
//
//        String lastEntryTable = expectedEntries.get(actualTableSize).getText();
//
//        Assert.assertTrue(lastEntryTable.contains(firstNameValue));
//        Assert.assertTrue(lastEntryTable.contains(lastNameValue));
//        Assert.assertTrue(lastEntryTable.contains(ageValue));
//        Assert.assertTrue(lastEntryTable.contains(emailAddressValue));
//        Assert.assertTrue(lastEntryTable.contains(salaryValue));
//        Assert.assertTrue(lastEntryTable.contains(departmentValue));
//
//
//        //poti face un for care pentru fiecare linie adaugata in tabel sa verifice assertul ca liniile sunt adugate
//        //incluzi assert-ul intr-un for sau un while
















    }
}
