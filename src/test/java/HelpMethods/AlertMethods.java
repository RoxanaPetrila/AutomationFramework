package HelpMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertMethods {

    private WebDriver driver;
    public AlertMethods(WebDriver driver){ this.driver = driver;}


    private void waitForAlert(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
    }
    public void acceptAlert(){
        waitForAlert();  // il pui sa astepte in caz ca e nevoie
        Alert alertOk = driver.switchTo().alert();
        alertOk.accept();
    }
    public void cancelAlert(){
        waitForAlert();
        Alert alertOkCancel = driver.switchTo().alert();
        alertOkCancel .dismiss();
    }
    public void fillAlert(String value){
        waitForAlert();
        Alert alertValue = driver.switchTo().alert();
        alertValue.sendKeys(value);
        alertValue .accept();
    }

}
