package Pages;

import Logger.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertFrameWindowPage extends BasePage {

    public AlertFrameWindowPage(WebDriver driver) {
        super(driver);
    }
    @FindBy (xpath = "//span[text()='Alerts']")
    private WebElement Alerts;

    @FindBy (xpath = "//span[text()='Frames']")
    private WebElement Frames;

    @FindBy(xpath="//span[text()='Browser Windows']")
    private WebElement Windows;


    public void clickAlerts(){
        Alerts.click();
        LoggerUtility.info("The user clicks on Alerts button");
    }

    public void clickFrames(){Frames.click();
        LoggerUtility.info("The user clicks on Frames button");}

    public void clickWindows(){Windows.click();
        LoggerUtility.info("The user clicks on Windows button");}


}
