package Excercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseClassExercise {

    WebDriver driver;

    public void setUp(){
        //set property
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("chrome starts now");

        //loadPage
        driver.get("https://the-internet.herokuapp.com/");
        System.out.println("web page loaded");

        WebElement shiftContent_link = driver.findElement(By.xpath("//li/a[contains(.,'Shifting Content')]"));
        shiftContent_link.click();
        System.out.println("shiftContent_link clicked");

        List<WebElement> countShifingContent = driver.findElements(By.xpath("//div[contains(@class,'example')]/a"));
        System.out.println("The Shifting Content Page <a> count ");
        System.out.println(countShifingContent.size());


        WebElement MenuElement = driver.findElement(By.xpath("//div[contains(@class,'example')]/a[contains(.,'Example 1: Menu Element')]"));
        MenuElement.click();
        System.out.println("MenuElement clicked");

        driver.quit();

        /*
        Author Answers
         driver.findElement(By.linkText("Shifting Content")).click();
        driver.findElement(By.linkText(("Example 1: Menu Element"))).click();
        List<WebElement> menuItems = driver.findElements(By.tagName("li"));
        System.out.println("Number of menu items: " + menuItems.size());

        driver.quit();
         */
    }

    public static void main(String[] args) {
        BaseClassExercise exercise = new BaseClassExercise();
        exercise.setUp();
    }

}
