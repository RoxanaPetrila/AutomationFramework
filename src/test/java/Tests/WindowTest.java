package Tests;

import Pages.AlertFrameWindowPage;
import Pages.HomePage;
import Pages.WindowsPage;
import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class WindowTest extends SharedData {


    @Test
    public void test_method() {

        HomePage homePage = new HomePage(getDriver());
        homePage.clickAlertFrameWindow();

        AlertFrameWindowPage alertFrameWindowPage = new AlertFrameWindowPage(getDriver());
        alertFrameWindowPage.clickWindows();

        WindowsPage windowsPage =  new WindowsPage(getDriver());
        windowsPage.interractTab();
        windowsPage.interractWindow();





//        WebElement alertsFrameWindow = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
//        alertsFrameWindow.click();
//
//        WebElement browserWindows = driver.findElement(By.xpath("//span[text()='Browser Windows']"));
//        browserWindows.click();
//
//        WebElement newTabButton = driver.findElement(By.id("tabButton"));
//        newTabButton.click();
//
//        System.out.println("url: " + driver.getCurrentUrl());
//
//        List<String> tabs = new ArrayList<>(driver.getWindowHandles()); // lista de tab-uri
//        driver.switchTo().window(tabs.get(1));
//
//        System.out.println("url: " + driver.getCurrentUrl());
//
//        driver.close();
//
//        driver.switchTo().window(tabs.get(0));
//        WebElement newWindowButton = driver.findElement(By.id("windowButton"));
//        newWindowButton.click();
//
//        System.out.println("url: " + driver.getCurrentUrl());
//
//        List<String> windows = new ArrayList<>(driver.getWindowHandles()); // lista de tab-uri
//        driver.switchTo().window(windows.get(1));
//
//        System.out.println("url: " + driver.getCurrentUrl());
//
//        driver.close();
//
//        driver.switchTo().window(windows.get(0));

    }
}
