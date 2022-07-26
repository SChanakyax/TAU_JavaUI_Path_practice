import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class loginTest {
    ChromeDriver driver; //can write WebDriver , but has to cast to get devTools drirectly

    @Test
    public void viewBrowserConsoleLogs(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        System.out.println("ssssssss");

    }


}
