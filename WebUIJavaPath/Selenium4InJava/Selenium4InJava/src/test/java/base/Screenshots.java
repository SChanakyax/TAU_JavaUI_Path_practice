package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Screenshots {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://applitools.com/");

    }

    @AfterClass
    public void teardown(){
        driver.quit();
    }

    @Test
    public void takeWebElementScreenshot(){
        WebElement NextGenerationPlatform = driver.findElement(By.cssSelector("#post-8 h1"));
        File source = NextGenerationPlatform.getScreenshotAs(OutputType.FILE);
        File destination = new File("Image.png");

        try {
            FileHandler.copy(source,destination);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void takeWebElementPageSectionScreenshot() throws IOException {
        WebElement aplit = driver.findElement(By.cssSelector("#post-8>header"));
        File source = aplit.getScreenshotAs(OutputType.FILE); //memeory store abstract representation
        FileUtils.copyFile(source, new File("applitoolls.png")); //Combine together

    }

    @Test  //For Firefox
    public void takeFullPageScreenshot() throws IOException {
        File source = ((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
        FileHandler.copy(source,new File("aaa.png"));

    }


}
