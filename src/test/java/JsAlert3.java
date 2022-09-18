import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JsAlert3 extends SeleniumHelper {

        @Test
        public void clickJsConfirm () {
            driver.get("https://the-internet.herokuapp.com/javascript_alerts");
            driver.findElement(By.xpath("//*[@onclick=\"jsConfirm()\"]")).click();
            Alert alert = driver.switchTo().alert();
            alert.dismiss();
            Assert.assertEquals(driver.findElement(By.id("result")), "You clicked: Cancel");
}
}
