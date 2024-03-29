package SharedData;

import Logger.LoggerUtility;
import SharedData.Browser.BrowserFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class SharedData {

    //o clasa de baza in care sa salvezi informatii ce le poti folosi peste tot


    private WebDriver driver;

     // se va executa ca o preconditie inaintea testului tau
    public void setup(){

//        driver = new ChromeDriver();  // asta funct. pentru un browser , o facem sa mearga pentru toate
//        driver.get("https://demoqa.com/");
//        driver.manage().window().maximize();
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        LoggerUtility.info("The browser was opened successfully");
        driver = new BrowserFactory().getBrowserDriver();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,450)", "");

    }

     // postconditii - inchide driver-ul respectiv
    public void clear (){

       driver.quit();
        LoggerUtility.info("The browser was closed successfully");

    }

    public WebDriver getDriver() {
        return driver;
    }
}


