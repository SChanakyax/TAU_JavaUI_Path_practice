package base;

import com.google.common.io.Files;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.CookieManager;
import utils.EventReporter;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;


//Run only to test the WebDriverEventListner
public class BaseTestClass_forWebDriverEventListner {

    private EventFiringWebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");


        /**
         * WebDriver EventListeners     2MoreEventListeners new ChromeDriver(getChromeOptions())
         */
        driver = new EventFiringWebDriver(new ChromeDriver(getChromeOptions()));
        driver.register(new EventReporter());
        goHome();//Load the page again to run the other test inside a class

        //setCookie();


        System.out.println(driver.getTitle());//get the title of the application


    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");    homePage = new HomePage(driver);
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
        //driver.quit();
    }


    /**
     * WebDriver EventListeners 2
     */
    private ChromeOptions getChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
       // options.setHeadless(true);//No actual browser when running

        return options;
    }

    //Manage cookies in the browser -> Eventlisteners
    private void setCookie(){
        Cookie cookie = new Cookie.Builder("tau","123")
                .domain("the-internet.herokuapp.com")
                .build(); ///this create cookie

        driver.manage().addCookie(cookie);
    }

    public CookieManager getCookieManger(){
        return new CookieManager(driver);
    }

    //To give the class access to the webDriver Special ->> not in the HomePage
    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }

}

