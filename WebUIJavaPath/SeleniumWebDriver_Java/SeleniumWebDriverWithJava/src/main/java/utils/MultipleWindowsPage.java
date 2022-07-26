package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindowsPage {

    private WebDriver driver;
    private By clickHereLink = By.linkText("Click Here");

    public MultipleWindowsPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickHere(){
        driver.findElement(clickHereLink).click();
    }

/*
Exercise -
Take either one, maybe let's go with the Example 2, and simulate a right click.

For example, if I were to hold down my command key and click on this link, then it would open this in a new tab. You may know other shortcuts as well. So, if you need to use the Keys or the Action classes to help you out, then do so.

After opening this link in a new tab, switch over to it and verify that the “Start” button is there

https://github.com/angiejones/selenium-webdriver-java-course/blob/master/webdriver_java/src/main/java/pages/DynamicLoadingPage.java
https://github.com/angiejones/selenium-webdriver-java-course/blob/master/webdriver_java/src/main/java/utils/WindowManager.java
https://github.com/angiejones/selenium-webdriver-java-course/blob/master/webdriver_java/src/test/java/exercises/chapter11/windows/WindowTests.java

 */


}
