package SharedData.Browser;

import Logger.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;
import java.util.HashMap;

public class EdgeBroswerService extends BaseBrowserService implements BroswerService{

    private WebDriver driver;

    @Override
    public void openBrowser(Boolean cicd) {
        EdgeOptions edgeOptions = (EdgeOptions) prepareBroswerOptions(cicd);
        driver = new EdgeDriver(edgeOptions);
        driver.get(getBrowserOptions().get("url"));
//        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        LoggerUtility.info("The browser was opened successfully");

    }
    @Override
    public void clear() {driver.quit();
        LoggerUtility.info("The browser was closed successfully");

    }

    @Override
    public Object prepareBroswerOptions(Boolean cicd) {
        //astea cu prop utility se pun primele pentru ca intai am datele despre browswe si apoi sa le setez
//        PropertyUtility propertyUtility = new PropertyUtility("Browser");
        HashMap<String, String> testData = getBrowserOptions();
        EdgeOptions edgeOptions = new EdgeOptions();
        if(cicd){
            edgeOptions.addArguments("--headless");
        }
        if(!testData.get("headless").isEmpty()){
            edgeOptions.addArguments(testData.get("headless"));}
        edgeOptions.addArguments(testData.get("gpu"));
        edgeOptions.addArguments(testData.get("infobars"));
        edgeOptions.addArguments(testData.get("sandbox"));
        edgeOptions.addArguments(testData.get("resolution"));
        return edgeOptions;
    }


    public WebDriver getDriver() {
        return driver;
    }


    }
