import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class ContextMenu {


    @Test
    public void contextMenu() {
        System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver/");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://the-internet.herokuapp.com/context_menu");
        WebElement contextMenu = driver.findElement(By.id("hot-spot"));
        Actions actions = new Actions(driver);
        actions.contextClick(contextMenu).perform();
    }
}