package hover;

import base.BaseTest_for_the_Framework;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HoverTest extends BaseTest_for_the_Framework {

    @Test
    public void testHoverUser1(){
        var hoversPage = homePage.clickHovers();
        var caption = hoversPage.hoverOverFigure(1);

        assertTrue(caption.isCaptionDisplayed(),"Caption is not displayed");
        assertEquals(caption.getTitle(),"name: user1","Caption Title incorrect");
        assertEquals(caption.getLinkText(),"View profile","Caption Link Text incorrect");
        //If the url changes,
        assertTrue(caption.getLink().endsWith("/users/1"),"Link incorrect");
    }

}
