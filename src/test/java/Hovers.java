import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Hovers extends SeleniumHelper {
    @Test
    public void hoverOver (){
        driver.get("https://the-internet.herokuapp.com/hovers");
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//*[@class=\"figure\"][1]/img"))).perform();
        driver.findElement(By.xpath("//*[@href=\"/users/1\"]")).click(); //Click pe ceva care se vede dupa hover
    }
}
