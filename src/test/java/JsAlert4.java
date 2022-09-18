import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JsAlert4 extends SeleniumHelper {
    @Test
    public void clickJsPrompt() {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//*[@onclick=\"jsPrompt()\"]")).click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("gogu");
        alert.accept();
        Assert.assertEquals(driver.findElement(By.id("result")).getText(), "You entered: gogu");



    }
}
