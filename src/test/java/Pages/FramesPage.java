package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FramesPage extends BasePage {
    public FramesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="sampleHeading")
    private WebElement frameText;


    public void interractFrame1(){
        frameMethods.switchToFrame("frame1");
        System.out.println(frameText.getText());
        frameMethods.switchMainFrame();
    }

//    public void frameTextget(){;
//        System.out.println(frameText.getText());}
//    public void exitFrame(){
//        driver.switchTo().defaultContent();}

    public void interractFrame2(){
        frameMethods.switchToFrame("frame2");
        System.out.println(frameText.getText());

    }

    }


