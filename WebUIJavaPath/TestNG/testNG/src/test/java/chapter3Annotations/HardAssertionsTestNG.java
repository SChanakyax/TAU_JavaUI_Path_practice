package chapter3Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class HardAssertionsTestNG {
        WebDriver driver;

        @BeforeClass
        public void setUp ()
        {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rex Allen Jones II\\Downloads\\Drivers\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();

            driver.get("https://opensource-demo.orangehrmlive.com/");
            System.out.println("1. Open Chrome & Application");
        }

        @Test
        public void signIn ()
        {
            WebElement textUsername = driver.findElement(By.id("txtUsername"));
           // Highlighter.highlightElement(driver, textUsername);
            textUsername.sendKeys("Admin");

            WebElement textPassword = driver.findElement(By.id("txtPassword"));
          //  Highlighter.highlightElement(driver, textPassword);
            textPassword.sendKeys("admin123");

            WebElement buttonLogin = driver.findElement(By.id("btnLogin"));
           // Highlighter.highlightElement(driver, buttonLogin);
            buttonLogin.click();

            System.out.println("2. Sign In");
        }

        /*
         As expected, after running this, testHomePageVerification failed. Let’s look at the output. Steps 3, 4, and 5 are missing. The AssertionError shows our message "The Welcome Link Is Not Correct On The Home Page" because our test failed. However, this is the only AssertionError shown, even though we know that assertTrue should also fail. There is only one AssertionError because we used a hard assert.
         A hard assert stops immediately after a failure then continues on to the next annotation. In this case, assertEquals failed so the subsequent assertions within this method were skipped and the script went on to the next @Test method, userSearch.
       */
        @Test
        public void testHomePageVerification ()
        {
            Assert.assertEquals(true, true, "The Welcome Link Is Not Correct On The Home Page");
            System.out.println("3. Verify Welcome Link");

            Assert.assertFalse(false, "The Admin Tab Is Not Displayed On The Home Page");
            System.out.println("4. Verify Admin Tab");

            Assert.assertTrue(true, "The Dashboard Is Not Correct On The Home Page");
            System.out.println("5. Verify Dashboard");

        }

        @Test
        public void userSearch ()
        {
            WebElement menuAdmin = driver.findElement(By.id("menu_admin_viewAdminModule"));
         //   Highlighter.highlightElement(driver, menuAdmin);
            menuAdmin.click();

            WebElement textUserName = driver.findElement(By.id("searchSystemUser_userName"));
       //     Highlighter.highlightElement(driver, textUserName);
            textUserName.sendKeys("Admin");

            WebElement buttonSearch = driver.findElement(By.id("searchBtn"));
       //     Highlighter.highlightElement(driver, buttonSearch);
            buttonSearch.click();

            System.out.println("6. Search For User");
        }

        @Test
        public void userSignOut ()
        {
            WebElement linkWelcome = driver.findElement(By.id("welcome"));
       //     Highlighter.highlightElement(driver, linkWelcome);
            linkWelcome.click();

            WebElement linkLogout = driver.findElement(By.xpath("//div[@id='welcome-menu']/descendant::a[contains(@href,'logout')]"));
      //      Highlighter.highlightElement(driver, linkLogout);
            linkLogout.click();

            System.out.println("7. Sign Out");
        }

        @AfterClass
        public void tearDown ()
        {
            System.out.println("8. Close Chrome & Application");
            driver.quit();
        }
    }