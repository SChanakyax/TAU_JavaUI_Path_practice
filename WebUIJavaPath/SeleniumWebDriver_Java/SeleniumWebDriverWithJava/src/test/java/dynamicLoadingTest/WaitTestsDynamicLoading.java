package dynamicLoadingTest;

import base.BaseTest_for_the_Framework;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTestsDynamicLoading extends BaseTest_for_the_Framework {

    @Test
    public void testWaitUntilHidden(){
        var loadingPage = homePage.clickDynamicLoading().clickExample1(); /**/
        loadingPage.clickStart();
        assertEquals(loadingPage.getLoadedText(),"Hello World!","Loading Text Incorrect");
    }

}
