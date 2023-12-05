package HelpMethods;

import org.openqa.selenium.WebDriver;

public class FrameMethods {
    private WebDriver driver; // aceasta clasa va oferi dar metodele nu si clasele, driver-ul va fi privat

    public FrameMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void switchToFrame(String value){
        driver.switchTo().frame(value);
    }

    public void switchMainFrame(){
        driver.switchTo().defaultContent();
    }
}
