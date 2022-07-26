package sendKeys;

import base.BaseTestClass_forWebDriverEventListner;
import base.BaseTest_for_the_Framework;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeysTest extends BaseTestClass_forWebDriverEventListner {

    @Test
    public void testBackSpace(){
        var keyPressPage = homePage.clickKeyPress();
        keyPressPage.enterText("A"+ Keys.BACK_SPACE);
        
        assertEquals(keyPressPage.getResult(),"You entered: BACK_SPACE","Backspace not captured");
    }

    @Test
    public void testPi(){
        var keypage = homePage.clickKeyPress();
        keypage.enterPi();

        assertEquals(keypage.getResult(),"pie");
    }
}
