package HelpMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class WindowMethods {

    private WebDriver driver; // aceasta clasa va oferi dar metodele nu si clasele, driver-ul va fi privat

    public WindowMethods(WebDriver driver) {
        this.driver = driver;
    }
    public void switchToSpecificWindow(Integer size){
        List<String> tabs = new ArrayList<>(driver.getWindowHandles()); //lista de tab-uri
        driver.switchTo().window(tabs.get(size)); // mutam focusul pe tab-ul nou
        System.out.println("Url: " + driver.getCurrentUrl());
    }
    public void closeCurrentWindow(){
        driver.close();
    }

}
