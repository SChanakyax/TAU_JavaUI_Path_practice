package navigation;

import base.BaseTestClass_forWebDriverEventListner;
import org.testng.annotations.Test;

public class NavigationTest extends BaseTestClass_forWebDriverEventListner {

    @Test
    public void testNavigator(){
        homePage.clickDynamicLoading().clickExample1();
        //Go backwards
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goFoward();
        getWindowManager().goTo("https://google.com");


        //Multiple Window handlme
        homePage.clickMultipleWindows().clickHere();
        getWindowManager().switchToTab("New Window");
    }

}
