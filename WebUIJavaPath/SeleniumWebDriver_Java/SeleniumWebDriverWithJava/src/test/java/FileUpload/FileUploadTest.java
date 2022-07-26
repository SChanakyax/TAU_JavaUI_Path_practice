package FileUpload;

import base.BaseTest_for_the_Framework;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTest extends BaseTest_for_the_Framework {

    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("C:\\Users\\SC\\Desktop\\WileyQE\\WebUIJavaPath\\SeleniumWebDriver_Java\\SeleniumWebDriverWithJava\\resources\\chromedriver.exe");
        assertEquals(uploadPage.getUploadedFiles(),"chromedriver.exe","upload button not fine");
    }

}
