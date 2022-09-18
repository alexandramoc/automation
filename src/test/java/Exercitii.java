import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Exercitii extends SeleniumHelper {
    @Test
    public void AccessSite() {
        driver.get("http://www.kevinlamping.com/webdriverio-course-content/index.html");
        WebElement section = driver.findElement(By.xpath("/html/body/div[3]/a"));
        section.click();
        Select drpDown = new Select(driver.findElement(By.id("robotType")));
        drpDown.selectByVisibleText("HAL");
        WebElement quantity = driver.findElement(By.id("qty"));
        quantity.sendKeys("14");
        WebElement buyButton = driver.findElement(By.id("buyNowButton"));
        buyButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //timpul max de asteptare
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class=\"medium-6 large-5 columns cart\"]/div[2]")).getText(), "Thank you human for your purchase of 14 HAL robot(s).\n" +
                "×");

    }

    @Test
    public void ValidateEmail() {
        driver.get("http://www.kevinlamping.com/webdriverio-course-content/index.html");
        Actions actions = new Actions(driver); //crearea unui obiect de tip Actions
        actions.moveToElement(driver.findElement(By.xpath("//li[@class=\"has-submenu is-dropdown-submenu-parent opens-right\"]/a"))).perform(); //hover
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//li[@class=\"is-submenu-item is-dropdown-submenu-item\"] [2]/a")).click();
        WebElement email = driver.findElement(By.id("review-email"));
        email.sendKeys("wrong");
        WebElement submitReview = driver.findElement(By.xpath("//*[@id=\"comment-form\"]/button"));
        submitReview.click();
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"comment-form\"]/label[1]/p")).getText(), "Please enter a valid email address.");
    }

    @Test
    public void SelectSection() {
        driver.get("http://www.kevinlamping.com/webdriverio-course-content/index.html");
        driver.findElement(By.xpath("/html/body/div[3]/a")).click();
        WebElement addReview = driver.findElement(By.id("review-email"));
        addReview.sendKeys("mocanualexandra@yahoo.com");
        WebElement sendReview = driver.findElement(By.xpath("//*[@id=\"comment-form\"]/button"));
        sendReview.click();
        Assert.assertEquals(driver.findElement(By.xpath("//form[@id=\"comment-form\"]/div/p")).getText(), "There are some errors in your review.");

    }

    @Test
    public void SimilarProducts() {
        driver.get("http://www.kevinlamping.com/webdriverio-course-content/index.html");
        driver.findElement(By.xpath("/html/body/div[3]/a")).click();
        driver.findElement(By.id("panel2-label")).click();
    }

    @Test
    public void HoverOver() {
        driver.get("http://www.kevinlamping.com/webdriverio-course-content/index.html");
        Actions actions = new Actions(driver); //crearea unui obiect de tip Actions
        actions.moveToElement(driver.findElement(By.xpath("//li[@class=\"has-submenu is-dropdown-submenu-parent opens-right\"]/a"))).perform(); //hover
        driver.findElement(By.xpath("//li[@class=\"is-submenu-item is-dropdown-submenu-item\"] [3]/a")).click();
        Assert.assertEquals(driver.getCurrentUrl(), "http://www.kevinlamping.com/webdriverio-course-content/product-page.html");
}
    @Test
    public void  PictureChanges () {
        driver.get("http://www.kevinlamping.com/webdriverio-course-content/index.html");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li/a/img[@src=\"images/robot-5.jpg\"]")));

    }

}
