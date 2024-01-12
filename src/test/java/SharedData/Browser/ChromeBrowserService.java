package SharedData.Browser;

import Logger.LoggerUtility;
import PropertyUtility.PropertyUtility;
import SharedData.SharedData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.HashMap;

public class ChromeBrowserService extends BaseBrowserService implements BroswerService {
    private WebDriver driver;
    @Override
    public void openBrowser(Boolean cicd) {
        ChromeOptions chromeOptions = (ChromeOptions) prepareBroswerOptions(cicd);
        driver = new ChromeDriver(chromeOptions); // trebuie sa se deschida folosindu-se de ce i-am zis noi mai jos
//        driver.get("https://demoqa.com/");
        ///in locul ei va fi:
        driver.get(getBrowserOptions().get("url"));
        //aducem url-ul asa, pentru ca l-am definit in fisierul de proprietati
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
        ChromeOptions chromeOptions = new ChromeOptions();
        if(cicd){
            chromeOptions.addArguments("--headless");
        }
        if(!testData.get("headless").isEmpty()){
              chromeOptions.addArguments(testData.get("headless"));}
        chromeOptions.addArguments(testData.get("gpu"));
        chromeOptions.addArguments(testData.get("infobars"));
        chromeOptions.addArguments(testData.get("sandbox"));
        chromeOptions.addArguments(testData.get("resolution"));
        return chromeOptions;
    }

    public WebDriver getDriver() {
        return driver;
    }


}
