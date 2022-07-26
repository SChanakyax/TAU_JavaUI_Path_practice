package modelTest;

import base.BaseTest_for_the_Framework;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ModalTest extends BaseTest_for_the_Framework {

    @Test
    public void testModalWindow(){
        var modalPage = homePage.clickModalLink();
        modalPage.clickHereButton();
        assertEquals(modalPage.getTextModelWindow(),"It's commonly used to encourage a user to take an action (e.g., give their e-mail address to sign up for something or disable their ad blocker).","Modal Window text not correct");
        modalPage.clickCloseModalWindow();

    }

}
