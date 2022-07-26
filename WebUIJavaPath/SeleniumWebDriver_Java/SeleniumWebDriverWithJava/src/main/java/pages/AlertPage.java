package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage {

    private WebDriver driver;

    private By triggerAlertButton = By.xpath(".//button[text()='Click for JS Alert']");

    private By triggerConfirmButton = By.xpath(".//button[text()='Click for JS Confirm']");

    private By triggerPrpomtButton = By.xpath(".//button[text()='Click for JS Prompt']");

    private By results = By.id("result");
    public AlertPage(WebDriver driver){
        this.driver = driver;
    }

    /*********Button1**************/
    //Button 1 triggerAlertJS
    public void triggerAlert(){
        driver.findElement(triggerAlertButton).click();
    }

    //Button 1 Accept the prompt
    public void alert_clickToAccept(){
        //driver.findElement cannot be used here
        //switchTo() -> changes from current context to something else
        driver.switchTo().alert().accept();
    }

    /*********Button2**************/
    //Button 2 Trigger ConfirmAlertJS
    public void triggerConfirmAlert(){
        driver.findElement(triggerConfirmButton).click();
    }

    //Button 2 Accept CofirmAlert
    public void alert_clickToDismissAlert(){
        driver.switchTo().alert().dismiss();//click the cancel button
    }

    //Get the JS alert text
    public String alert_getText(){
        return driver.switchTo().alert().getText();
    }


    //Result element is same
    public String getResults(){
        return driver.findElement(results).getText();
    }

    /*********Button3 - Prompt**************/
    public void triggerPromptAlert(){
        driver.findElement(triggerPrpomtButton).click();
    }

    public void alert_setInput(String textInput){
        driver.switchTo().alert().sendKeys(textInput);
    }

}
