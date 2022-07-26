package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MultipleWindowsPage;

public class HomePage {

    /*
    0 HomePage->LoginPage->SecureAreaPage
    1 HomePage->DropDownPage->Select*option ->
     */
    private WebDriver driver;
    //1 private By formAuthenticationLink = By.linkText("Form Authentication");

    public HomePage(WebDriver driver){this.driver= driver;}

    public LoginPage clickFormAuthentication(){
       //1  driver.findElement(formAuthenticationLink).click();
        // 1 call the clickLink method
        clickLink("Form Authentication");

        //to the login page
        return new LoginPage(driver);
    }

    //1 If create a link have to create method, 45 links 45 methods So design a
    //1 generic method
    //private -> So the test will not access this
    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

    //public as this should return the dropdown page
    public DropdownPage clickDropDown(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    //Hover over the elements ->used by HoverTest
    public HoversPage clickHovers(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    //sendKeys -> KeyPress check
    public KeyPressPage clickKeyPress(){
        clickLink("Key Presses");
        return new KeyPressPage(driver);
    }

    public SliderPage slideHorizontalSlider(){
        clickLink("Horizontal Slider");
        return new SliderPage(driver);
    }

    public AlertPage clickJavaScriptAlert(){
        clickLink("JavaScript Alerts");
        return new AlertPage(driver);
    }

    /*******fileUplaod********/
    public FileUploadPage clickFileUpload(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }

    ///Modal
    public ModalPage clickModalLink(){
        clickLink("Entry Ad");
        return new ModalPage(driver);
    }

    /********Context Menu************/
    public ContextMenuPage clickContextMenuLink(){
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }

    /*********WysiwygEditor*************/
    public WysiwyEditorPage clickWysiwygEditor(){
        clickLink("WYSIWYG Editor");
        return new WysiwyEditorPage(driver);
    }

    /********waiting Strategies*************/
    public DynamicLoadingPage clickDynamicLoading(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }


    /*******************Large And Deep DOM********************/
    public LargeAndDeepDOM clickLargeAndDeepDOM(){
        clickLink("Large & Deep DOM");
        return new LargeAndDeepDOM(driver);
    }

    /********Infinite Scroll**************/
    public InfiniteScrollPage clickinfiniteScroll(){
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }

    /*********Click Multiple Windows Navigations WebDriver****************.*/
    public MultipleWindowsPage clickMultipleWindows(){
        clickLink("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }


}
