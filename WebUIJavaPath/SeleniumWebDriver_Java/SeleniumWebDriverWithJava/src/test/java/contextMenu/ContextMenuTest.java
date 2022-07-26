package contextMenu;

import base.BaseTest_for_the_Framework;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTest extends BaseTest_for_the_Framework {


    @Test
    public void testRightClick(){
        var menuPage = homePage.clickContextMenuLink();
        menuPage.rightClickBox();
        String message = menuPage.getPopupText();
        menuPage.acceptPopUp();
        assertEquals(message, "You selected a context menu", "Popup message incorrect");
    }

}
