package bankService;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CustomerTest {

    /**
     * The system should be able to store information on new customers
     * Scenario :
     * 1
     * 2
     * 3
     * BDD scenario
     */

    @Test
    public void creatingCustomerWithValidData_StoresSpecificData(){
        //Given and when
        Customer customer = new Customer("Sandeep","Disnl","sc@gmail.com");

        //Then
        assertNotNull(customer);//to check obj created
        assertEquals(customer.getName(),"sandeep");;
        assertEquals(customer.getAddress(),"Disnl");
        assertEquals(customer.getEmail(),"sc@gmail.com");
    }

    /**
     *  The system should be able to update customer information using valid data.
     *  Scenario:
     *  1. Given I create a new customer named Mickey Mouse.
     *  2. When I update Mickey's customer information with Minnie's information.
     *  3. Then Minnie's information should be stored in the system.
     */
    @Test
    public void updatingCustomerDataWithDifferentValidValues_StoresNewValues() {

        // Given
        Customer customer = new Customer("Mickey", "Disneyland", "Mickey@Disneyland.com");

        // When
        customer.updateName("Minnie Mouse");
        customer.updateAddress("Disney World");
        customer.updateEmail("Minnie@Disneyworld.com");

        // Then
        assertEquals(customer.getName(), "Minnie Mouse");
        assertEquals(customer.getAddress(), "Disney World");
        assertEquals(customer.getEmail(), "Minnie@Disneyworld.com");

    }

}