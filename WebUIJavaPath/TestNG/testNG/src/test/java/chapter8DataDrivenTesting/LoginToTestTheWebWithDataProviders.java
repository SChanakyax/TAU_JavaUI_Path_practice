package chapter8DataDrivenTesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginToTestTheWebWithDataProviders {

    WebDriver driver;

    @Test(dataProvider = "logInData")
    public void logIn(String email, String password, boolean success){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        //driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys(email);
        driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys(password);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();

        System.out.println("Log In Credentials: " + "\n" +
                "  Email = " + email + "\n" +
                "  Password = " + password + "\n" +
                "  Successful Log In = " + success + "\n" );

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String actualResult = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")).getText();
        String expectedResult = "Sign out";
        Assert.assertEquals(actualResult, expectedResult, "The Actual & Expected Results Do Not Match");

        driver.quit();
    }

    @DataProvider //(name="loginProvider") optional
    public Object[][] logInData(){
        Object[][] data = new Object[3][3]; //Object multi dimensional array

        data [0] [0] = "TestNG@Framework.com";
        data [0] [1] = "TestNG1234";
        data [0] [2] = true;
    /*    data [1] [0] = "Joe@Doe.com";
        data [1] [1] = "DoeDoe34";
        data [1] [2] = false;
        data [2] [0] = "Test@AutomationU.com";
        data [2] [1] = "TAU1234";
        data [2] [2] = true;
*/
        return data;

    }

}
