package Pages;

import Logger.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormsPage extends BasePage {
    public FormsPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//span[text()='Practice Form']")
    private WebElement practiceForms;
    public void clickPracticeForms(){
        practiceForms.click();
        LoggerUtility.info("The user clicks on Forms page");
    }
}
