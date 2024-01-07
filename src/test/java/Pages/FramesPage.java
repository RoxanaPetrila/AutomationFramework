package Pages;

import Logger.LoggerUtility;
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
        LoggerUtility.info("The user switches to 1st frame");
        System.out.println(frameText.getText());
        LoggerUtility.info("The user prints the frame Text value");
        frameMethods.switchMainFrame();
        LoggerUtility.info("The user switches back on default frame");

    }

//    public void frameTextget(){;
//        System.out.println(frameText.getText());}
//    public void exitFrame(){
//        driver.switchTo().defaultContent();}

    public void interractFrame2(){
        frameMethods.switchToFrame("frame2");
        LoggerUtility.info("The user switches to 2nd frame");
        System.out.println(frameText.getText());
        LoggerUtility.info("The user prints the frame Text value");
    }

    }


