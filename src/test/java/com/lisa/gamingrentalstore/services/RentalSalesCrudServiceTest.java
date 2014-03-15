/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.gamingrentalstore.services;

import com.lisa.gamingrentalstore_assignment4.model.Cashier;
import com.lisa.gamingrentalstore_assignment4.model.RentalSales;
import com.lisa.gamingrentalstore_assignment4.services.crud.RentalSalesCrudService;
import java.util.Date;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
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
public class RentalSalesCrudServiceTest {
    
    @Mock
    RentalSalesCrudService rentalSalesCrudService;
    
    public RentalSalesCrudServiceTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public void setUpClass() throws Exception {
        
         MockitoAnnotations.initMocks(this);
        rentalSalesCrudService = Mockito.mock(RentalSalesCrudService.class);
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
    public void testCreate() throws Exception 
    {
         Cashier cashier1 = new Cashier.Builder("CA001").cashierName("Lynne").cashierSurname("Smith").build();
        Date date1= new Date(2014,02,11);
        
        RentalSales rentalSales1 = new RentalSales.Builder("R001").rentalDate(date1).rentalPeriod("One Week").returnDate(new Date(2014,02,18)).rentalTotalPrice(80.00).amountRendered(90.00).change(10.00).cashier(cashier1).build();
         RentalSales returnRentalSales = rentalSalesCrudService.persist(rentalSales1);
         when(rentalSalesCrudService.persist(rentalSales1)).thenReturn(returnRentalSales);
         Mockito.verify(rentalSalesCrudService).persist(rentalSales1);
    }
    
     @Test
    public void testRead() throws Exception 
    {
      Cashier cashier1 = new Cashier.Builder("CA001").cashierName("Lynne").cashierSurname("Smith").build();
        Date date1= new Date(2014,02,11);
        
        RentalSales rentalSales1 = new RentalSales.Builder("R001").rentalDate(date1).rentalPeriod("One Week").returnDate(new Date(2014,02,18)).rentalTotalPrice(80.00).amountRendered(90.00).change(10.00).cashier(cashier1).build();
        RentalSales returnRentalSales = rentalSalesCrudService.find(rentalSales1.getRentalID());
        when(rentalSalesCrudService.find(rentalSales1.getRentalID())).thenReturn(returnRentalSales);
        Mockito.verify(rentalSalesCrudService).find(rentalSales1.getRentalID());
    }
    
    @Test
    public void testUpdate() throws Exception 
    {
       
        Cashier cashier1 = new Cashier.Builder("CA001").cashierName("Lynne").cashierSurname("Smith").build();
        Date date1= new Date(2014,02,11);
        
        RentalSales rentalSales1 = new RentalSales.Builder("R001").rentalDate(date1).rentalPeriod("One Week").returnDate(new Date(2014,02,18)).rentalTotalPrice(80.00).amountRendered(90.00).change(10.00).cashier(cashier1).build();
        rentalSales1 = new RentalSales.Builder("R002").rentalDate(date1).rentalPeriod("One Week").returnDate(new Date(2014,02,18)).rentalTotalPrice(80.00).amountRendered(90.00).change(10.00).cashier(cashier1).build();  
        RentalSales returnRentalSales2 = rentalSalesCrudService.merge(rentalSales1);
        when(rentalSalesCrudService.merge(rentalSales1)).thenReturn(returnRentalSales2);
       
        Mockito.verify(rentalSalesCrudService).merge(rentalSales1);
        
       
    }
    
    @Test
    public void testDelete() throws Exception 
    {
        Cashier cashier1 = new Cashier.Builder("CA001").cashierName("Lynne").cashierSurname("Smith").build();
        Date date1= new Date(2014,02,11);
        
        RentalSales rentalSales1 = new RentalSales.Builder("R001").rentalDate(date1).rentalPeriod("One Week").returnDate(new Date(2014,02,18)).rentalTotalPrice(80.00).amountRendered(90.00).change(10.00).cashier(cashier1).build();
        RentalSales returnRentalSales = rentalSalesCrudService.remove(rentalSales1);
        when(rentalSalesCrudService.remove(rentalSales1)).thenReturn(returnRentalSales);
        Mockito.verify(rentalSalesCrudService).remove(rentalSales1);
    }
}
