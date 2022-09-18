import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JsAlert  {
    @Test
    public void clickAlert () {
        System.setProperty("webdriver.gecko.driver","/usr/local/bin/geckodriver/");
        WebDriver driver = new FirefoxDriver(); //Creating an object of FirefoxDriver
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//*[@onclick=\"jsAlert()\"]")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println( alert.getText());
        alert.accept();
        Assert.assertEquals(driver.findElement(By.id("result")).getText(), "You successfully clicked an alert");

    }
}
