package chapter7DependancyTesting;

import org.testng.annotations.Test;

public class AmazoneFakeSiteGroupTest {

    @Test (groups = "smoke")
    public void test1_LogIn(){
        System.out.println("1 login smoke");
    }

    @Test(groups = {"smoke","regression"})
    public void test2_SearchProducts(){
        System.out.println("2 search products smoke regression");
    }

    @Test(groups = {"regression","integration","defect.fix"})
    public void test3_PlaceOrder(){
        System.out.println("3. place order regression integration has a defect");
    }

    @Test(groups = {"system","defect.backlog"})
    public void test4_SendConfirmation(){
        System.out.println("4 send conformation system has a defect");
    }

    @Test(groups = {"regression","defect.progress"})
    public void test5_ShipOrder(){
        System.out.println("5 shipOrder jas a progress defect");
    }

    @Test
    public void test6_LogOut(){
        System.out.println("6 Logout no group");
    }

}
