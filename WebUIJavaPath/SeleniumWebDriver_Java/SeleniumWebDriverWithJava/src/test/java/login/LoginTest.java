package login;

import base.BaseTest_for_the_Framework;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.*;

public class LoginTest extends BaseTest_for_the_Framework {

    @Test
    public void testSuccessfullyLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUserName("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickButton();
        /*assertEquals(secureAreaPage.getAlertText()," You logged into a secure area! ×",
                "Alert text incorrect");
                Use assert True
         */

        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"),
                "Alert text incorrect");
    }
}
