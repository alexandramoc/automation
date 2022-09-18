import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SeleniumfFrstTest {
    @Test
    public void seleniumFirstTest (){
       // Incarc in proiect executabilul de chromedriver
        System.setProperty("webdriver.gecko.driver","/usr/local/bin/geckodriver/");

        WebDriver driver = new FirefoxDriver(); //Creating an object of FirefoxDriver
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.emag.ro/");
        System.out.println(driver.getTitle());
        String titleEmag = driver.getTitle();

        Assert.assertEquals("titleEmag","eMAG.ro - Căutarea nu se oprește niciodată!");

}
}
