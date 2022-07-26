package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {

    WebDriver driver;
    private By inputField = By.id("file-upload");
    private By uploadButton = By.id("file-submit");

    //TestCheck
    private By uploadFiles = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickUploadButton(){
        driver.findElement(uploadButton).click();
    }

    /**
     * provides path of file to the form then
     * click upload button
     * @param absolutePathFile
     * The complete path of the file to upload
     */
    public void uploadFile(String absolutePathFile){
        driver.findElement(inputField).sendKeys(absolutePathFile);
        clickUploadButton();
    }

    public String getUploadedFiles(){
        return driver.findElement(uploadFiles).getText();
    }

}
