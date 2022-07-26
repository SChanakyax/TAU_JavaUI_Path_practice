import com.applitools.eyes.selenium.Eyes;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class BaseTests {

   protected static WebDriver driver;
   protected static Eyes eyes;

   @BeforeClass
   public static void setUp() {
       Properties props = System.getProperties();
       try {
           props.load(new FileInputStream(new File("resources/test.properties")));
       } catch(Exception e) {
           e.printStackTrace();
           System.exit(-1);
       }

       driver = new ChromeDriver();
       initiateEyes();

       //Change this to your own directory
       driver.get("file:///Users/angie/workspace/automation-bookstore-master/website/index.html");
   }

   @AfterClass
   public static void tearDown() { driver.quit(); }

   private static void initiateEyes(){
       eyes = new Eyes();
       eyes.setApiKey(System.getProperty("applitools.api.key"));
   }