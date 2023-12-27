package Tests;

import ObjectData.AlertObject;
import Pages.AlertFrameWindowPage;
import Pages.AlertPage;
import Pages.HomePage;
import SharedData.SharedData;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import SharedData.Hooks;
import java.time.Duration;

public class AlertTest extends Hooks {
    @Test
    public void test_method() {

        AlertObject alertObject = new AlertObject(testData);
        HomePage homePage = new HomePage(getDriver()); // ia driverul din clasa parinte, il vede in copil
        homePage.clickAlertFrameWindow();  //chemi obiectul tau si prin mostenire aduci restul

        AlertFrameWindowPage alertFrameWindowPage = new AlertFrameWindowPage(getDriver());
        alertFrameWindowPage.clickAlerts();

        AlertPage alertPage = new AlertPage(getDriver());
        alertPage.interractAlertOk();
        alertPage.interractAlertDelay();
        alertPage.interractAlertDismiss();
        alertPage.interractAlertValue(alertObject);

//        driver = new ChromeDriver();
//        driver.get("https://demoqa.com/");
//        driver.manage().window().maximize();
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,450)", "");
// SE pot sterge pentru ca extends ShareData de mai sus - va prelua proprietatile astea din clasa parinte
        //se va mosteni si partea de postconditii


//        WebElement alertsFrameWindow = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
//        alertsFrameWindow.click();

//        WebElement alerts = driver.findElement(By.xpath("//span[text()='Alerts']"));
//        alerts.click();

//        WebElement alertOkButton = driver.findElement(By.id("alertButton"));
//        alertOkButton.click();
//
//        Alert alertOk = driver.switchTo().alert();
//        alertOk.accept();


//        WebElement alertDelayButton = driver.findElement(By.id("timerAlertButton"));
//        alertDelayButton.click();
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.alertIsPresent());
//
//        Alert alertDelay = driver.switchTo().alert();
//        alertDelay.accept();

//
//        WebElement alertOkCancelButton = driver.findElement(By.id("confirmButton"));
//        alertOkCancelButton.click();
//
//        Alert alertOkCancel = driver.switchTo().alert();
//        alertOkCancel .dismiss();

//        WebElement alertValueButton = driver.findElement(By.id("promtButton"));
//        alertValueButton.click();
//
//        Alert alertValue = driver.switchTo().alert();
//        alertValue.sendKeys("Text");
//        alertValue .accept();


// la final browserul se va inchide pentru ca mosteneste din SharedData





    }
}