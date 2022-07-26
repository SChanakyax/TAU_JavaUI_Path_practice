package SliderTest;

import base.BaseTest_for_the_Framework;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HorizontalSliderTest extends BaseTest_for_the_Framework {

    @Test
    public void testSlider(){
        String value = "4";
        var sliderPage = homePage.slideHorizontalSlider();
        sliderPage.enterSliderValue(value);

        assertEquals(sliderPage.getSliderResult(), value,"Slider value incorrect!");
    }

}
