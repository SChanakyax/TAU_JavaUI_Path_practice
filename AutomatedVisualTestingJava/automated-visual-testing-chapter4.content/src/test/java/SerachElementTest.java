import base.BaseTests;
import base.BaseTests4;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class SerachElementTest extends BaseTests4 {
    @Test
    public void testSearchByFullTitle_Element(){

        page.search("Agile Testing");
        validateElement(By.id("pid3"));

        Assert.assertEquals("Number of books returned", 1,page.getNumberOfVisibleBooks());
    }


}