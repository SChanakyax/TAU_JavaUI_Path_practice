package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {
    /**
     * When scrolling down to the page new paragraphs are added
     * They were not exist on the DOM cannot locate
     *
     */

    private WebDriver driver;

    By textBlocks = By.className("jscroll-added");

    public InfiniteScrollPage(WebDriver driver){
        this.driver = driver;
    }

    public void scrollToParagraph(int index){
        String script = "window.scrollTo(0 , document.body.scrollHeight)"; //Horizontal 0 and verticle
        var jsExecutor = (JavascriptExecutor)driver;
        while (getNumberOfParagraphsPresent()< index){
            jsExecutor.executeScript(script);
        }
    }

    //Scroll down some amounts get the number of paragraphs
    private int getNumberOfParagraphsPresent(){
        return driver.findElements(textBlocks).size();
    }



}
