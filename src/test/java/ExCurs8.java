import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExCurs8 extends SeleniumHelper{
    @Test
    public void Open() {
        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.xpath("//ul[@id=\"homefeatured\"]/li[4]/div/div[1]/div/a[1]/img")).click();
     WebElement quantity = driver.findElement(By.xpath("//*[@id=\"quantity_wanted\"]"));
     quantity.sendKeys("5");
     Select dropDown = new Select(driver.findElement(By.id("group_1")));
     dropDown.selectByVisibleText("M");
}}
