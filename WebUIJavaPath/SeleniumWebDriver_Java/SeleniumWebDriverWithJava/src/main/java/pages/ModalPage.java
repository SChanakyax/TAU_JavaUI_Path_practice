package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ModalPage {
    WebDriver driver;

    private By clickHere = By.xpath("//a[@id='restart-ad']");
    private By modelText = By.xpath("//div[@class='modal-body']/p/text()");
    private By modelCloseBtn = By.xpath("//div[@class='modal-footer']//p");


    public ModalPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickHereButton(){
        driver.findElement(clickHere).click();
    }

    public String getTextModelWindow(){
        return driver.findElement(modelText).getText();
    }

    public void clickCloseModalWindow(){
        driver.findElement(modelCloseBtn).click();
    }

}
