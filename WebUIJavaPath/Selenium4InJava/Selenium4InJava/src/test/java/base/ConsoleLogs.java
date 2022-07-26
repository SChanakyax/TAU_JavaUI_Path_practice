package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.log.Log;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ConsoleLogs {
    ChromeDriver driver; //can write WebDriver , but has to cast to get devTools drirectly

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

    @Test
    public void viewBrowserConsoleLogs(){
        //get the devtools and create a session
        DevTools devTools = driver.getDevTools();
        devTools.createSession(); //To take control of the developer tools panel in the browser


        //enable console logs
        devTools.send(Log.enable()); //interact with the dev tools

        //add a listener for console logs
        devTools.addListener(Log.entryAdded(),logEntry -> {
            System.out.println("-----------");
            System.out.println("Level:" + logEntry.getLevel());
            System.out.println("TEXT:" + logEntry.getText());
            System.out.println("Broken URL:" + logEntry.getUrl());

        });


        //Load the aut website
        driver.get("http://the-internet.herokuapp.com/broken_images");

    }


}
