package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v101.network.Network;
import org.openqa.selenium.devtools.v101.network.model.ConnectionType;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Optional;

public class NetworkConditions {

    ChromeDriver driver;
    DevTools devTools;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        devTools = driver.getDevTools();
    }

    /*
The parameters are offline, latency, downloadThroughput, uploadThroughput, and connectionType. Connection type is the only optional parameter.

The method that we wrote for enabling the network has 3 optional parameters — maxTotalBufferSize, maxResourceBufferSize, and maxPostDataSize
Do you see how the first 2 parameters are experiments? If I hover, the tooltip says this may be changed, moved, or removed.


     */

    //Slow loading
    @Test
    public void enableSlowWebsite(){
        devTools.createSession();
        devTools.send(Network.enable(
                Optional.empty(),
                Optional.empty(),
                Optional.empty()
        ));

        devTools.send(Network.emulateNetworkConditions(
                false,
                150,
                2500,
                2000,
                Optional.of(ConnectionType.CELLULAR3G)));

        driver.get("https://www.linkedin.com/");
        System.out.println("Enable slow network " + driver.getTitle());


    }

    //To see the difference of loading
    @Test
    public void doNotEnableWebsite(){
        driver.get("https://www.linkedin.com/");

        System.out.println("Donot enable network" + driver.getTitle());
    }


}
