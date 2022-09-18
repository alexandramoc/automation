import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    @Test
    public void loginTestPositive(){
        System.setProperty("webdriver.gecko.driver","/usr/local/bin/geckodriver/");
        WebDriver driver = new FirefoxDriver(); //Creating an object of FirefoxDriver
        driver.get("https://the-internet.herokuapp.com/login");

        WebElement usernameField =driver.findElement(By.xpath("//*[@id=\"username\"]"));
        usernameField.sendKeys("tomsmith");

        WebElement passwordField =driver.findElement(By.xpath("//*[@id=\"password\"]"));
       passwordField.sendKeys("SuperSecretPassword!");

        WebElement loginButton =driver.findElement(By.xpath("//*[@id=\"login\"]/button"));
        loginButton.click();

        WebElement successMessage =driver.findElement(By.tagName("h2"));
        Assert.assertEquals(successMessage.getText(),"Secure Area");

    }
}
