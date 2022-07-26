package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.DuckDuckGoResultPage;
import pageobjects.DuckDuckGoSearchPage;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PageObjectWebTest {

    private WebDriver driver;

    @BeforeEach
    public void initWebDriver(){
        driver = new ChromeDriver();
    }

    @Test
    public void searchDuckDuckGo(){
        DuckDuckGoSearchPage searchPage = new DuckDuckGoSearchPage(driver);
        searchPage.loadPage();
        searchPage.search("giant panda");

        DuckDuckGoResultPage resultPage = new DuckDuckGoResultPage(driver);
        List<String> linkTexts = resultPage.getResultLinkText("panda");

        for(String text: linkTexts){
            assertTrue(text.matches("(?i).*panda.*"));
        }
    }

    @AfterEach
    public void quitWebDriver(){
        driver.quit();
    }

}
