package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class WindowsPage extends BasePage {
    public WindowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "tabButton")
    private WebElement newTabButton;
    @FindBy(id = "windowButton")
    private WebElement newWindowButton;

    public void interractTab() {
        newTabButton.click();
        windowMethods.switchToSpecificWindow(1);
        windowMethods.closeCurrentWindow();
        windowMethods.switchToSpecificWindow(0);}

//        System.out.println("Url: " + driver.getCurrentUrl());
//        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
//        driver.switchTo().window(tabs.get(1));
//        System.out.println("Url: " + driver.getCurrentUrl());
//        driver.close();
//        driver.switchTo().window(tabs.get(0));
//    }

        public void interractWindow() {
            newWindowButton.click();
            windowMethods.switchToSpecificWindow(1);
            windowMethods.closeCurrentWindow();
            windowMethods.switchToSpecificWindow(0);



        }
    }












