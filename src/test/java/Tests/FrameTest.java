package Tests;

import Pages.AlertFrameWindowPage;
import Pages.FramesPage;
import Pages.HomePage;
import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import SharedData.Hooks;

import java.time.Duration;

public class FrameTest extends Hooks {


    @Test
    public void test_method() {

        HomePage homePage = new HomePage(getDriver());
        homePage.clickAlertFrameWindow();

        AlertFrameWindowPage alertFrameWindowPage = new AlertFrameWindowPage(getDriver());
        alertFrameWindowPage.clickFrames();

        FramesPage framesPage = new FramesPage(getDriver());
        framesPage.interractFrame1();
        framesPage.interractFrame2();





//        driver = new ChromeDriver();
//        driver.get("https://demoqa.com/");
//        driver.manage().window().maximize();
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,450)", "");
//
//
//        WebElement alertsFrameWindow = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
//        alertsFrameWindow.click();
//
//        WebElement frames = driver.findElement(By.xpath("//span[text()='Frames']"));
//        frames.click();

//        FramesPage framesPage = new FramesPage(driver);
//        framesPage.interractFrame1();
//        framesPage.frameTextget();
//        framesPage.exitFrame();
//        framesPage.interractFrame2();
//        framesPage.frameTextget();
//        framesPage.exitFrame();




//        driver.switchTo().frame("frame1");
//
//        WebElement frameText = driver.findElement(By.id("sampleHeading"));
//        System.out.println(frameText.getText());
//
//        driver.switchTo().defaultContent();  // intoarcere inapoi pe pagina mare


//        driver.switchTo().frame("frame2");
//
//        WebElement frame2Text = driver.findElement(By.id("sampleHeading"));
//        System.out.println(frame2Text.getText());






    }
}
