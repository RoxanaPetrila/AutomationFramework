package Pages;

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
    }

    public void clickForms(){
        forms.click();
    }
    public void clickElements(){
        elements.click();
    }
}
