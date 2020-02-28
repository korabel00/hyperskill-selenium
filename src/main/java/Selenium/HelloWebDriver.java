package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HelloWebDriver {

    public static void main(String[] args) throws InterruptedException {

        //создаем объект Хромдрайвера
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

        //получаем страницу
        chromeDriver.get("https://selenium.dev/");

        //находим поле поиска заполняем его и нажимаем Enter
        WebElement searchField = chromeDriver.findElement(By.xpath("//*[@id=\"gsc-i-id1\"]"));
        searchField.sendKeys("api");
        searchField.sendKeys(Keys.ENTER);

        List<WebElement> titles = chromeDriver.findElements(By.className("gs-title"));
        System.out.println(titles.size());
        Thread.sleep(2000);
        chromeDriver.quit();

//        WebDriver fireFoxDriver = new ChromeDriver();
//        fireFoxDriver.get("https://selenium.dev/");
//        Thread.sleep(2000);
//        fireFoxDriver.quit();

    }
}
