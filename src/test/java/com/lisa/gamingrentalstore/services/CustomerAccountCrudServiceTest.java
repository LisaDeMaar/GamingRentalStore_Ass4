/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.gamingrentalstore.services;

import com.lisa.gamingrentalstore_assignment4.model.Cashier;
import com.lisa.gamingrentalstore_assignment4.model.Contracts;
import com.lisa.gamingrentalstore_assignment4.model.CustomerAccount;
import com.lisa.gamingrentalstore_assignment4.model.CustomerDetails;
import com.lisa.gamingrentalstore_assignment4.model.RentalSales;
import com.lisa.gamingrentalstore_assignment4.services.crud.CustomerAccountCrudService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
public class CustomerAccountCrudServiceTest 
{
     @Mock
    CustomerAccountCrudService customerAccountCrudService;
    
    public CustomerAccountCrudServiceTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public void setUpClass() throws Exception 
    {
         MockitoAnnotations.initMocks(this);
    customerAccountCrudService = Mockito.mock(CustomerAccountCrudService.class);
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
         Contracts contract1 =  new Contracts.Builder("CON001").contractLength("One month").contractName("MonthContract").contractType("Rentals for a month").contractPrice(300.00).build();
        Cashier cashier1 = new Cashier.Builder("CA001").cashierName("Lynne").cashierSurname("Smith").build();
        Date date1= new Date(2014,02,11);
        
        RentalSales rentalSales1 = new RentalSales.Builder("R001").rentalDate(date1).rentalPeriod("One Week").returnDate(new Date(2014,02,18)).rentalTotalPrice(80.00).amountRendered(90.00).change(10.00).cashier(cashier1).build();
        
        List<RentalSales> rentalSales = new ArrayList();
        rentalSales.add(rentalSales1);
        
        CustomerDetails customerDetails1 = new CustomerDetails.Builder("Sarah").customerSrname("Michael").telephoneNumber("021-7056524").cellNumber("08463257525").postalAddress("13 York Street, Plumstead").build();
        CustomerAccount customerAccount1 = new CustomerAccount.Builder("DEM001").customerDetails(customerDetails1).rentalSales(rentalSales).contract(contract1).build();
        
         CustomerAccount returnCustomerAccount = customerAccountCrudService.persist(customerAccount1);
         when(customerAccountCrudService.persist(customerAccount1)).thenReturn(returnCustomerAccount);
         Mockito.verify(customerAccountCrudService).persist(customerAccount1);
    }
    
     @Test
    public void testRead() throws Exception 
    {
         Contracts contract1 =  new Contracts.Builder("CON001").contractLength("One month").contractName("MonthContract").contractType("Rentals for a month").contractPrice(300.00).build();
        Cashier cashier1 = new Cashier.Builder("CA001").cashierName("Lynne").cashierSurname("Smith").build();
        Date date1= new Date(2014,02,11);
        
        RentalSales rentalSales1 = new RentalSales.Builder("R001").rentalDate(date1).rentalPeriod("One Week").returnDate(new Date(2014,02,18)).rentalTotalPrice(80.00).amountRendered(90.00).change(10.00).cashier(cashier1).build();
        
        List<RentalSales> rentalSales = new ArrayList();
        rentalSales.add(rentalSales1);
        
        CustomerDetails customerDetails1 = new CustomerDetails.Builder("Sarah").customerSrname("Michael").telephoneNumber("021-7056524").cellNumber("08463257525").postalAddress("13 York Street, Plumstead").build();
        CustomerAccount customerAccount1 = new CustomerAccount.Builder("DEM001").customerDetails(customerDetails1).rentalSales(rentalSales).contract(contract1).build();
        
        CustomerAccount returnCustomerAccount = customerAccountCrudService.find(customerAccount1.getRentalCode());
        when(customerAccountCrudService.find(customerAccount1.getRentalCode())).thenReturn(returnCustomerAccount);
        Mockito.verify(customerAccountCrudService).find(customerAccount1.getRentalCode());
    }
    
    @Test
    public void testUpdate() throws Exception 
    {
       
         Contracts contract1 =  new Contracts.Builder("CON001").contractLength("One month").contractName("MonthContract").contractType("Rentals for a month").contractPrice(300.00).build();
        Cashier cashier1 = new Cashier.Builder("CA001").cashierName("Lynne").cashierSurname("Smith").build();
        Date date1= new Date(2014,02,11);
        
        RentalSales rentalSales1 = new RentalSales.Builder("R001").rentalDate(date1).rentalPeriod("One Week").returnDate(new Date(2014,02,18)).rentalTotalPrice(80.00).amountRendered(90.00).change(10.00).cashier(cashier1).build();
        
        List<RentalSales> rentalSales = new ArrayList();
        rentalSales.add(rentalSales1);
        
        CustomerDetails customerDetails1 = new CustomerDetails.Builder("Sarah").customerSrname("Michael").telephoneNumber("021-7056524").cellNumber("08463257525").postalAddress("13 York Street, Plumstead").build();
        CustomerAccount customerAccount1 = new CustomerAccount.Builder("DEM001").customerDetails(customerDetails1).rentalSales(rentalSales).contract(contract1).build();
        
        customerAccount1 = new CustomerAccount.Builder("DEM002").customerDetails(customerDetails1).rentalSales(rentalSales).contract(contract1).build();
        CustomerAccount returnCustomerAccount2 = customerAccountCrudService.merge(customerAccount1);
        when(customerAccountCrudService.merge(customerAccount1)).thenReturn(returnCustomerAccount2);
       
        Mockito.verify(customerAccountCrudService).merge(customerAccount1);
        
       
    }
    
    @Test
    public void testDelete() throws Exception 
    {
        Contracts contract1 =  new Contracts.Builder("CON001").contractLength("One month").contractName("MonthContract").contractType("Rentals for a month").contractPrice(300.00).build();
        Cashier cashier1 = new Cashier.Builder("CA001").cashierName("Lynne").cashierSurname("Smith").build();
        Date date1= new Date(2014,02,11);
        
        RentalSales rentalSales1 = new RentalSales.Builder("R001").rentalDate(date1).rentalPeriod("One Week").returnDate(new Date(2014,02,18)).rentalTotalPrice(80.00).amountRendered(90.00).change(10.00).cashier(cashier1).build();
        
        List<RentalSales> rentalSales = new ArrayList();
        rentalSales.add(rentalSales1);
        
        CustomerDetails customerDetails1 = new CustomerDetails.Builder("Sarah").customerSrname("Michael").telephoneNumber("021-7056524").cellNumber("08463257525").postalAddress("13 York Street, Plumstead").build();
        CustomerAccount customerAccount1 = new CustomerAccount.Builder("DEM001").customerDetails(customerDetails1).rentalSales(rentalSales).contract(contract1).build();
        
        CustomerAccount returnCustomerAccount = customerAccountCrudService.remove(customerAccount1);
        when(customerAccountCrudService.remove(customerAccount1)).thenReturn(returnCustomerAccount);
        Mockito.verify(customerAccountCrudService).remove(customerAccount1);
    }
}
