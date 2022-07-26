package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    private By usernameFeild = By.id("username");
    private By passwordFeild = By.id("password");
    private By loginButton = By.cssSelector("#login button");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void setUserName(String username){
        driver.findElement(usernameFeild).sendKeys(username);
    }

    public void setPassword(String password){
        driver.findElement(passwordFeild).sendKeys(password);
    }

    //to the new page after login
    public SecureAreaPage clickButton(){
        driver.findElement(loginButton).click();

        return new SecureAreaPage(driver);
    }



}
