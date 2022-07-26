package javascript;

import base.BaseTest_for_the_Framework;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class JavaScriptTest extends BaseTest_for_the_Framework {

    @Test
    public void testScrollToTable(){
        homePage.clickLargeAndDeepDOM().scrollToTable();
    }

    @Test
    public void testScrollToFifthParagraph(){
        homePage.clickinfiniteScroll().scrollToParagraph(5);
    }

    @Test
    public void testAddMultipleAttributeToDropdown(){
        var dropdownPage = homePage.clickDropDown();
        dropdownPage.addMultipleAttribute();

        var optionsSelect = List.of("option 1","option 2");
        optionsSelect.forEach(dropdownPage::selectFromDropDown);

        var selectOptions = dropdownPage.getSelectedOptions();
        assertTrue(selectOptions.containsAll(optionsSelect),"All options were not selected");
        assertEquals(selectOptions.size(), optionsSelect.size(),"Number of selected items");
    }

}
