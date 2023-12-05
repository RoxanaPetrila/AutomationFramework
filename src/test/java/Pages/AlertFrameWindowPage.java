package Pages;

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
    }

    public void clickFrames(){Frames.click();}

    public void clickWindows(){Windows.click();}


}
