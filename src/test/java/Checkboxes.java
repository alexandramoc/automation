import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Checkboxes {
    @Test
    public void tickBoxes() {
        System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver/");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
        checkbox.click();
        System.out.println(driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).getAttribute("checked"));
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).getAttribute("checked"), "true");
    }
}


