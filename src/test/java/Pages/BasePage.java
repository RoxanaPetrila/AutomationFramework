package Pages;

import HelpMethods.AlertMethods;
import HelpMethods.ElementMethods;
import HelpMethods.FrameMethods;
import HelpMethods.WindowMethods;
import com.beust.ah.A;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    //tot ceea ce este comun in toate paginile se poate defini aici si sa fie share-uit peste tot.
    //se va reduce codul duplicat, constructorii duplicati si page factory-ul duplicat
    public WebDriver driver;
    public WindowMethods windowMethods;
    public AlertMethods alertMethods;
    public FrameMethods frameMethods;
    public ElementMethods elementMethods;


    public BasePage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        windowMethods = new WindowMethods(driver);
        alertMethods = new AlertMethods(driver);
        frameMethods = new FrameMethods(driver);
        elementMethods = new ElementMethods(driver);

    }
}
