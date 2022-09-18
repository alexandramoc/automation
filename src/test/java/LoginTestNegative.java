import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestNegative {
    @Test
    public void loginTestNegative(){
        System.setProperty("webdriver.gecko.driver","/usr/local/bin/geckodriver/");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://the-internet.herokuapp.com/login");
        WebElement usernameField =driver.findElement(By.id("username"));
        usernameField.sendKeys("tomsmith1");

        WebElement passwordField =driver.findElement(By.id("password"));
        passwordField.sendKeys("SuperSecretPassword!");

        WebElement loginButton =driver.findElement(By.className("radius"));
        loginButton.click();

        WebElement failMessage =driver.findElement(By.id("flash"));
        System.out.println("mesajul este" + failMessage.getText());

        Assert.assertEquals(failMessage.getText(),"Secure Area");


    }
}
