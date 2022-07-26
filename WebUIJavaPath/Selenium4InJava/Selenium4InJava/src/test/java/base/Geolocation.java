package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.emulation.Emulation;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Geolocation {

    //MockGeoLocations
    ChromeDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void mockGeoLocation(){
        //CDP command method
        Map coordinates = new HashMap()
        {
            {
                put("latitude",38.897701);
                put("longitude",-77.036537);
                put("accuracy",1);

            }
        };
        driver.executeCdpCommand("Emulation.setGeolocationOverride", coordinates);
        driver.get("https://where-am-i.org/");
    }


    @Test
    public void mockGeoLocationDEVTools(){
        DevTools devTools = driver.getDevTools();
        devTools.createSession();

        devTools.send(Emulation.setGeolocationOverride(Optional.of(38.897701),
                Optional.of(-77.036537),
                Optional.of(1)));

        driver.get("https://where-am-i.org/");
    }
}
