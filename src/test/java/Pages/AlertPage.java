package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertPage extends BasePage{
    public AlertPage(WebDriver driver) {
        super(driver);
    }


//    public WebDriver driver;

//    public AlertPage(WebDriver driver){    //faci constructor si initializezi obiectele
//        this.driver =driver;
//        PageFactory.initElements(driver, this);   //driver spune care e instanta - this pointeaza catre toate lementele de pe aceasta pagina
//    }
//identificam elementele de pe pagina
    @FindBy(id="alertButton")
    private WebElement alertOkButton;

    @FindBy(id="timerAlertButton")
    private WebElement alertDelayButton;

    @FindBy(id="confirmButton")
    private WebElement alertOkCancelButton;

    @FindBy(id="promtButton")
    private WebElement alertValueButton;


    //apoi se fac metodele
    public void interractAlertOk(){
        alertOkButton.click();
        alertMethods.acceptAlert();
//        Alert alertOk = driver.switchTo().alert();
//        alertOk.accept();
    }
    //mergi in cealalta pagina si apelezi metoda asta

    public void interractAlertDelay(){
        alertDelayButton.click();
        alertMethods.acceptAlert();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.alertIsPresent());
//        Alert alertDelay = driver.switchTo().alert();
//        alertDelay.accept();
    }

    public void interractAlertDismiss(){
       alertOkCancelButton.click();
       alertMethods.cancelAlert();
//        Alert alertOkCancel = driver.switchTo().alert();
//        alertOkCancel .dismiss();
    }
    public void interractAlertValue(String value){
        alertValueButton.click();
        alertMethods.fillAlert(value);
//        Alert alertValue = driver.switchTo().alert();
//        alertValue.sendKeys(value);
//        alertValue .accept();
    }
}
