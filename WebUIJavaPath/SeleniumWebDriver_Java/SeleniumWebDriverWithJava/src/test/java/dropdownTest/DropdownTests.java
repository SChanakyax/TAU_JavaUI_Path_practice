package dropdownTest;

import base.BaseTest;
import base.BaseTest_for_the_Framework;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTests extends BaseTest_for_the_Framework {

    @Test
    public void testSelectOption(){
        //Invoke the Homepage Method
       var dropdownPage =  homePage.clickDropDown();
       String option = "Option 1";

       dropdownPage.selectFromDropDown(option);
       var selectedOptions = dropdownPage.getSelectedOptions();

       assertEquals(selectedOptions.size(), 1,"INcorrect no of options");
       assertTrue(selectedOptions.contains(option),"Option not selected");
    }

}
