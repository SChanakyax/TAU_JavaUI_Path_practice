package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {

    private WebDriver driver;

    //WebElement locator hoverimage
    private By figureBox = By.className("figure");

    //figcaption element
    private By boxCaption = By.className("figcaption");

    public HoversPage(WebDriver driver){
        this.driver = driver;
    }

    //int index -> 3 images to be hovered

    /**
     *List index starts at 0 to get the 1st element index-1
     * @param index 1
     */
    public FigureCaption hoverOverFigure(int index){
        //Creating a webElement for the figure
        WebElement figure = driver.findElements(figureBox).get(index - 1);

        Actions actions = new Actions(driver);
        //Action class use Builder pattern allows to chain multiple method calls and execute all at once
        //This method should move the mouse to the figure to cause hover action
        //perform will execute the action
        actions.moveToElement(figure).perform();

        /*there are many figcaption elements so we dont find it from DOM (3 figcation elements within the figure)
        figure.findElement() - > will find the elements within the element itself
         */

        return new FigureCaption(figure.findElement(boxCaption));
    }

    //Inner Class to handle -> figurecaption element
    public class FigureCaption{

        private WebElement caption;

        //Header and the link
        private By header = By.tagName("h5");
        private By link = By.tagName("a");

        //Need a constructor to accept the web elements
        public FigureCaption(WebElement caption){
            this.caption = caption;
        }

        //Know if the caption is displayed
        public boolean isCaptionDisplayed(){
            return caption.isDisplayed(); //WebElement interation method
        }

        //What's the title getTitle
        public String getTitle(){
            return caption.findElement(header).getText();
        }

        public String getLink(){
            return caption.findElement(link).getAttribute("href");
        }

        public String getLinkText(){
            return caption.findElement(link).getText();
        }


    }


}
