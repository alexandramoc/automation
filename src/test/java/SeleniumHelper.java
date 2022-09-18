import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

class SeleniumHelper {
    WebDriver driver;

    @BeforeMethod
    public void openBrowser () {
        System.setProperty("webdriver.gecko.driver","/usr/local/bin/geckodriver/");
        driver = new FirefoxDriver(); //Creating an object of FirefoxDriver
        driver.manage().window().maximize();
    }
}
