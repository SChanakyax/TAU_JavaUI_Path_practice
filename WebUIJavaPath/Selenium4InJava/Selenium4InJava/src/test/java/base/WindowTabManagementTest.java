package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class WindowTabManagementTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().minimize();
        //driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.get("http://automationpractice.com/index.php");
        System.out.println("Title: " + driver.getTitle());
    }

    @AfterMethod
    public void tearDown(){
       // driver.quit();
    }


    //Test to load 2 tabs (newTab)
    //WebDriver newWindow = driver.switchTo().newWindow(WindowType.TAB); to open tabs
    @Test
    public void testNewWindowTab(){
        WebDriver newWindow = driver.switchTo().newWindow(WindowType.WINDOW);
        newWindow.get("http://automationpractice.com/index.php?controller=prices-drop");
        driver.manage().window().minimize();
        System.out.println("Title: " + driver.getTitle());
    }

    //Working in More windows in same session
    @Test
    public void testWorkingInBothWindowTabs(){
        //Auto open and switch to new window or tab
        driver.switchTo().newWindow(WindowType.TAB)
                .get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        driver.manage().window().minimize();
        System.out.println("Title: " + driver.getTitle());

        //Work in the new window or tab
        driver.findElement(By.id("email_create")).sendKeys("sandeep111@gmail.com"); //email label
        driver.findElement(By.id("SubmitCreate")).click();

        //Assign a value to each window
        //Get the window ID Handles
        Set<String> allWindowTabs =driver.getWindowHandles();//an alphanumeric id assigned to each window?
        Iterator<String> iterate= allWindowTabs.iterator();
        String mainFirstWindow = iterate.next(); //switch to 1st

        //Switch and work in the main window or tab
        driver.switchTo().window(mainFirstWindow);
        driver.findElement(By.id("search_query_top")).sendKeys("Shirt");
        driver.findElement(By.name("submit_search")).click();
        System.out.println("Title: " + driver.getTitle());

    }
}
