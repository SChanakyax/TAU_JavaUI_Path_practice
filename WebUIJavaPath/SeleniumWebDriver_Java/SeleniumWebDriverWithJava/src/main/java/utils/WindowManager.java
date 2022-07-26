package utils;

import org.openqa.selenium.WebDriver;

public class WindowManager {
    private WebDriver driver;

    private WebDriver.Navigation navigation;

    public WindowManager(WebDriver driver){
        this.driver = driver;
        navigation = driver.navigate();
    }

    public void goBack(){
        //driver.navigate().back();
        navigation.back();
    }

    public void goFoward(){
        navigation.forward();
    }

    public void refreshPage(){
        navigation.refresh();
    }

    public void goTo(String url){
        navigation.to(url);
    }

    //Manage Mutiple windows
    public void switchToTab(String tabTitle){
        var windows = driver.getWindowHandles();

        System.out.println("Number of tabs" + windows.size());

        windows.forEach(System.out::println);

        //swith to the tab
        for(String window : windows){
            System.out.println("Switching to windows : " + window);
            driver.switchTo().window(window);

            System.out.println("Current Window totle : " + driver.getTitle());

            if(tabTitle.equals(driver.getTitle())){
                break;
            }
        }

    }

}
