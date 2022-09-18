import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragDrop {
        @Test
        public void dragDrop () {
            System.setProperty("webdriver.gecko.driver","/usr/local/bin/geckodriver/");
            WebDriver driver = new FirefoxDriver(); //Creating an object of FirefoxDriver
            driver.get("https://the-internet.herokuapp.com/drag_and_drop");
            WebElement drag = driver.findElement(By.id("column-a"));
            WebElement drop = driver.findElement(By.id("column-b"));
            Actions action = new Actions(driver);
            action.moveToElement(drop);

    }
}
