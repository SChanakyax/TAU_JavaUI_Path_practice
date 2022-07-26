package stepsPackage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Steps {

    WebDriver driver;

    @Before()
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SC\\Documents\\ChromeWebDriver\\Version103.1050\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Given("I am in the login page")
    @Given("I am in the login page of the Para Bank Application")
    public void i_am_in_the_login_page_of_the_para_bank_application() {

        driver.get("http://parabank.parasoft.com/parabank/index.htm");
    }
    @When("I enter valid {string} and {string}")
    public void i_enter_valid_credentials(String usernamex,String passwordx)
    {
       // List<String> loginForm = table.asList();
        driver.findElement(By.name("username")).sendKeys(usernamex);
        driver.findElement(By.name("password")).sendKeys(passwordx);
        driver.findElement(By.name("username")).submit();
    }
    @Then("I should be taken to the Overview page")
    public void i_should_be_taken_to_the_overview_page() throws Exception{
       // Thread.sleep(4000);

                driver.findElement(By.xpath("//div//h1")).isDisplayed();
                     /*WebDriverWait wait = new WebDriverWait(driver, 20);
        //       // wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id= 'rightPanel']/div/div/h1")));
        //       driver.findElement(By.xpath("//div[contains(@id,'leftPanel')]//a[contains(. , 'Log Out')]")).click();


                      */

    }

    @After()
    public void quitBrowser(){
        driver.quit();
    }

}
