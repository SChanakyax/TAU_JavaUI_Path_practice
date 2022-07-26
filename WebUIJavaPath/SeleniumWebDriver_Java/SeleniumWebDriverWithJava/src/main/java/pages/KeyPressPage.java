package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.security.Key;

public class KeyPressPage {

    private By inputFied = By.id("target");
    private By resultText = By.id("result");

    private WebDriver driver;

    public KeyPressPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterText(String text){
        driver.findElement(inputFied).sendKeys(text);
    }

    //chord() send multiple keys at one time
    public void enterPi(){
        //for mac
        enterText(Keys.chord(Keys.ALT,"p") +  "=3.14");
    }

    public String getResult(){
        return driver.findElement(resultText).getText();
    }



}
