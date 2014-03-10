/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.gamingrentalstore.model;

import com.lisa.gamingrentalstore_assignment4.model.Cashier;
import com.lisa.gamingrentalstore_assignment4.model.RentalSales;
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
public class RentalSalesTest {
    
    public RentalSalesTest() {
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
    public void testCreation() throws Exception {
        
        
        Cashier cashier1 = new Cashier.Builder("CA001").cashierName("Lynne").cashierSurname("Smith").build();
        Date date1= new Date(2014,02,11);
        
        RentalSales rentalSales1 = new RentalSales.Builder("R001").rentalDate(date1).rentalPeriod("One Week").returnDate(new Date(2014,02,18)).rentalTotalPrice(80.00).amountRendered(90.00).change(10.00).cashier(cashier1).build();
         
        Assert.assertNotNull(rentalSales1);
        Assert.assertEquals(rentalSales1.getRentalID(), "R001");
    


    }
}
