/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.gamingrentalstore.model;

import com.lisa.gamingrentalstore_assignment4.model.Cashier;
import com.lisa.gamingrentalstore_assignment4.model.Contracts;
import com.lisa.gamingrentalstore_assignment4.model.CustomerAccount;
import com.lisa.gamingrentalstore_assignment4.model.CustomerDetails;
import com.lisa.gamingrentalstore_assignment4.model.RentalSales;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.text.html.ListView;
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
public class CustomerAccountTest {
    
    public CustomerAccountTest() {
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
        
        Contracts contract1 =  new Contracts.Builder("CON001").contractLength("One month").contractName("MonthContract").contractType("Rentals for a month").contractPrice(300.00).build();
        Cashier cashier1 = new Cashier.Builder("CA001").cashierName("Lynne").cashierSurname("Smith").build();
        Date date1= new Date(2014,02,11);
        
        RentalSales rentalSales1 = new RentalSales.Builder("R001").rentalDate(date1).rentalPeriod("One Week").returnDate(new Date(2014,02,18)).rentalTotalPrice(80.00).amountRendered(90.00).change(10.00).cashier(cashier1).build();
        
        List<RentalSales> rentalSales = new ArrayList();
        rentalSales.add(rentalSales1);
        
        CustomerDetails customerDetails1 = new CustomerDetails.Builder("Sarah").customerSrname("Michael").telephoneNumber("021-7056524").cellNumber("08463257525").postalAddress("13 York Street, Plumstead").build();
        CustomerAccount customerAccount1 = new CustomerAccount.Builder("DEM001").customerDetails(customerDetails1).rentalSales(rentalSales).contract(contract1).build();
        
        Assert.assertNotNull(customerAccount1);
        Assert.assertEquals(customerAccount1.getRentalCode(), "DEM001");
    


    }

   



    
    
    
}
