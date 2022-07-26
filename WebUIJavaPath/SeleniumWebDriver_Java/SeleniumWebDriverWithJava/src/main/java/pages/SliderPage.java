package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SliderPage {
    WebDriver driver;

    private By sliderRangeValue = By.xpath("//span[contains(@id,'range')]");//output
    private By slider = By.xpath("//input[@type='range']");//giving value
    public SliderPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterSliderValue(String sliderValue){
        while(!getSliderResult().equals(sliderValue)){
            driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
        }
    }


    public String getSliderResult(){
        return driver.findElement(sliderRangeValue).getText();
    }

}
