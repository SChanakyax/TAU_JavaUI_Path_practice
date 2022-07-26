package chapter3Annotations;

import org.testng.annotations.*;

public class ConfigurationAnnotationsTestNG {

    @BeforeTest
    public void beforeTest(){
        System.out.println("open chrome");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("open test application");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Sign in");
    }

    @Test
    public void searchProduct(){
        System.out.println("Search for product");
    }

    @Test
    public void searchCustomer(){
        System.out.println("Search for customer");
    }


    @AfterMethod
    public void afterMethod(){
        System.out.println("Sign out");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("Close the test application");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("close chrome");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("Chrome - close all the cookies");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Chrome - Set up system property");
    }

}
