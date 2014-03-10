/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.gamingrentalstore.model;

import com.lisa.gamingrentalstore_assignment4.model.CustomerDetails;
import com.lisa.gamingrentalstore_assignment4.model.Demographic;
import java.util.Date;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Lisa
 */
public class CustomerDetailsTest {
    
    public CustomerDetailsTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
      @Test
    public void testCreation() throws Exception 
    {
        Demographic demographic1 = new Demographic.Builder("male").age("25").dob(new Date(1990,02,18)).build();
        CustomerDetails customerDetails1 = new CustomerDetails.Builder("Sarah").customerSrname("Michael").telephoneNumber("021-7056524").cellNumber("08463257525").postalAddress("13 York Street, Plumstead").demographic(demographic1).build();
        
        Assert.assertNotNull(customerDetails1);
        Assert.assertEquals(customerDetails1.getCustomerName(), "Sarah");
    
    }
}
