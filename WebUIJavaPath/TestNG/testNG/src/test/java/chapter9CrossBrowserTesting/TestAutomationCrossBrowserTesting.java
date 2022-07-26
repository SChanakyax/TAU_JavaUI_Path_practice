package chapter9CrossBrowserTesting;

import io.github.bonigarcia.wdm.managers.InternetExplorerDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class TestAutomationCrossBrowserTesting {
    
    WebDriver webDriver;
    
    @Test
    
    public void verifyBrowser(String url,String browserType){
        
        if(browserType.equalsIgnoreCase("Internet Explorer")){
          //  System.setProperty("webdriver.ie.driver", "");
          //  driver = new InternetExplorerDriver();
        }else if (browserType.equalsIgnoreCase("Firefox"))
        {
         //   driver = new FirefoxDriver ();
        }
        else if (browserType.equalsIgnoreCase("Chrome"))
        {
          //  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rex Allen Jones II\\Downloads\\Drivers\\chromedriver.exe");
           // driver = new ChromeDriver ();
        }

       // driver.manage().window().maximize();
      //  driver.get(url);

        System.out.println("\n" + "Open " + browserType);
        System.out.println("   " +  webDriver.getTitle());
        System.out.println("   " +  webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div[1]/div[2]/div[1]/section[1]/p[1]")).getText());
        System.out.println("Close " + browserType + "\n");

        webDriver.quit();
    }
}