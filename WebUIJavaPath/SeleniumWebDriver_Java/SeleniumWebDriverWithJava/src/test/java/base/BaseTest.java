package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTest {

    private WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        //instantiate
        driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");
        System.out.println(driver.getTitle());//get the title of the application

        //Change the browser window size
        //driver.manage().window().maximize();
        //driver.manage().window().fullscreen();
        //custom size
        //driver.manage().window().setSize(new Dimension(375,812));

        //findElement
        //WebElement inputLink = driver.findElement(By.linkText("Inputs"));
        //inputLink.click();

        //FindElements
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        WebElement name = driver.findElement(By.linkText("Sandeep"));
        name.click();




       // driver.quit();//close any of the windows that are open and complete out this session.
        //driver.close();  just close the window, but not necessarily the session

    }

    public static void main(String[] args) {
        BaseTest test = new BaseTest();
        test.setUp();
    }

}
