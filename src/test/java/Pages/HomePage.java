package Pages;

import Logger.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    //definesti elementele specifice [aginii tale de homepage

   // @FindBy // -- > astea se numesc adnotari si vin de la TEST NG
    @FindBy (xpath ="//h5[text()='Alerts, Frame & Windows']")   // specifici dupa ce il identifici
    private WebElement alertsFrameWindow; // faci o variabila globala si ii spui asa cum ai numit-o

    @FindBy (xpath = "//h5[text()='Forms']")
    private WebElement forms;

    @FindBy(xpath = "//h5[text()='Elements']")
    private WebElement elements;


    public void clickAlertFrameWindow(){
        alertsFrameWindow.click();    //faci o metoda specifica pt acest element si ii spui ce faci cu el
        LoggerUtility.info("The user clicks on Alert-frame-window button");
    }

    public void clickForms(){
        forms.click();
        LoggerUtility.info("The user clicks on forms element");
            }
    public void clickElements(){
        elements.click();
        LoggerUtility.info("The user clicks on Elements page");
    }
}
