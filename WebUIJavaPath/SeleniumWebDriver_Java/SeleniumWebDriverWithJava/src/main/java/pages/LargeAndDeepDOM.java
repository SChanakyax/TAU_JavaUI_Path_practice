package pages;

import org.openqa.selenium.*;

public class LargeAndDeepDOM {

    /**
     * ExecuteJS When WebDriver API cannot do(No inbuilt function) things like
     * Scrolling a page we have to write our own JS code
     */
    private WebDriver driver;

    private By table = By.id("large-table");

    public LargeAndDeepDOM(WebDriver driver){
        this.driver = driver;
    }

    public void scrollToTable(){
       //Create web element to find the table
        WebElement tableElement = driver.findElement(table);

        //no method in tableElement to reach the table so use JS
        //tableElement.
        //Provided by Selenium class - > have to cast the driver to JavaScriptExecutor
        String script= "arguments[0].scrollIntoView(); ";
        ((JavascriptExecutor)driver).executeScript(script, tableElement);//Replace the tableElement with script



    }

}
