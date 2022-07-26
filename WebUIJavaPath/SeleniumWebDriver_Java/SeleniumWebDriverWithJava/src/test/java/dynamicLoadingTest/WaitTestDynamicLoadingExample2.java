package dynamicLoadingTest;

import base.BaseTest_for_the_Framework;
import okio.Timeout;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class WaitTestDynamicLoadingExample2 extends BaseTest_for_the_Framework {

    @Test
    public void testExample2Waits(){
        var waitPage = homePage.clickDynamicLoading().clickExample2();
        waitPage.clickStart();
        assertEquals(waitPage.getLoadedText(),"Hello World!","Text incorrect");
    }


}
