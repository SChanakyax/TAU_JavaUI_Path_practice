package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class RelativeLocators {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        //driver.manage().window().maximize();
        //driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.get("http://automationpractice.com/index.php");
        System.out.println("Title: " + driver.getTitle());
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void testRelativeLocator(){
       WebElement loginPanel = driver.findElement( By.id("logInPanelHeading"));
       WebElement credentials = driver.findElement(RelativeLocator.with(
               By.tagName("span"))
               .above(loginPanel));
        System.out.println(credentials.getText());
    }

    @Test
    public void testListOFElements(){
        List<WebElement> allSocialMedia = driver.findElements(with(By.tagName("img"))
                .near(By.id("footer"))); //above parameter

        for (WebElement socialMedia: allSocialMedia) {
            System.out.println(socialMedia.getAttribute("alt"));
        }
    }

}
