package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class FindH3Class {

    public static void main(String[] args) {

        //Create Chromedriver instance
        WebDriver chromeDriver = new ChromeDriver();

        //Get a start page
        chromeDriver.get("https://www.google.com/");

        //Find an element after 5 seconds
        WebElement searchField = findElementAfterWaiting(chromeDriver, By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
        //Enter a value in it
        searchField.sendKeys("api");
        //Press "Enter"
        searchField.sendKeys(Keys.ENTER);


        List<WebElement> h3 = findListOfElementAfterWaiting(chromeDriver,By.tagName("h3"));
        System.out.println(h3.size());

        chromeDriver.quit();

    }

    private static WebElement findElementAfterWaiting(WebDriver chromeDriver, By by) {
        return new WebDriverWait(chromeDriver,5)
                .until(ExpectedConditions.presenceOfElementLocated(by));
    }

    private static List<WebElement> findListOfElementAfterWaiting(WebDriver chromeDriver, By by) {
        return new WebDriverWait(chromeDriver,5)
                .until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
    }
}
