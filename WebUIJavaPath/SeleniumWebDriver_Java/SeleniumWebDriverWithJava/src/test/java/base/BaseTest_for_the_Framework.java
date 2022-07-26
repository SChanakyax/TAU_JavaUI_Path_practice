package base;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.HomePage;

import java.io.File;
import java.io.IOException;
import com.google.common.io.Files;
import java.util.List;

public class BaseTest_for_the_Framework {

    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        //instantiate
        driver = new ChromeDriver();
        goHome();//Load the page again to run the other test inside a class

        System.out.println(driver.getTitle());//get the title of the application

        homePage = new HomePage(driver);
    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
    }

    //Runs after each test runs
    //ITestResult is a testNG class to validate(if)
    //Run any testCase by failing screenshot retrieve Have to do once
    @AfterMethod
    public void takeScreenshotonFaliures(ITestResult result){
        if(ITestResult.FAILURE == result.getStatus()){//if test failed
            var camera = (TakesScreenshot)driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);

            try{

                Files.move(screenshot, new File("resources/screenshots/"+result.getName()+".png")); //result.getName() get the testcase name
            }catch (IOException e){
                e.printStackTrace();
            }
        }

       // System.out.println("Screenshot taken and path: " + screenshot.getAbsolutePath());
    }


    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    /*No need
    public static void main(String[] args) {
        BaseTest test = new BaseTest();
        test.setUp();
    }
     */
}
