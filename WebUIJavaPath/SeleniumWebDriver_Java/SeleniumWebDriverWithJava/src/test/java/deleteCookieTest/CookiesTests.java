package deleteCookieTest;

import base.BaseTestClass_forWebDriverEventListner;
import com.sun.source.tree.AssertTree;
import org.openqa.selenium.Cookie;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;

public class CookiesTests extends BaseTestClass_forWebDriverEventListner {

    @Test
    public void testDeleteCookie(){
        var cookieManager = getCookieManger();
        Cookie xook = cookieManager.buildCookie("optimizelyBuckets","%7B%7D");
        cookieManager.deleteCookie(xook);
        assertFalse(cookieManager.isCookiePresent(xook),"Cookie was not deleted!");

    }


}
