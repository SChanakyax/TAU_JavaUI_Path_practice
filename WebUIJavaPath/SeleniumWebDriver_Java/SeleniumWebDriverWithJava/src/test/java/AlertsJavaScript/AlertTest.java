package AlertsJavaScript;

import base.BaseTest_for_the_Framework;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTest extends BaseTest_for_the_Framework {

    @Test
    public void testAcceptAlert(){
        var alertsPage = homePage.clickJavaScriptAlert();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();

        //To test result
        assertEquals(alertsPage.getResults(),"You successfully clicked an alert","Result Text is incorrect");
    }

    @Test
    public void textGetTextFromAlert(){
        var alertsPage = homePage.clickJavaScriptAlert();
        alertsPage.triggerConfirmAlert();
        //alertsPage.alert_clickToAccept();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismissAlert();

        assertEquals(text,"I am a JS Confirm","Alert Text incorrect");

    }

    @Test
    public void testSetInputInAlert(){
        var alertsPage = homePage.clickJavaScriptAlert();
        alertsPage.triggerPromptAlert();
        String text = " sandeep";
        alertsPage.alert_setInput(text);
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResults(),"You entered:" + text,"Result Text is incorrect");
    }
}
