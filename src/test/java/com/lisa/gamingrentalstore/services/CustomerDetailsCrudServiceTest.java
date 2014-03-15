/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.gamingrentalstore.services;

import com.lisa.gamingrentalstore_assignment4.model.CustomerDetails;
import com.lisa.gamingrentalstore_assignment4.model.Demographic;
import com.lisa.gamingrentalstore_assignment4.services.crud.CustomerDetailsCrudService;
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
public class CustomerDetailsCrudServiceTest 
{
    @Mock
    CustomerDetailsCrudService customerDetailsCrudService;
    
    public CustomerDetailsCrudServiceTest() {
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
        customerDetailsCrudService = Mockito.mock(CustomerDetailsCrudService.class);
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
          Demographic demographic1 = new Demographic.Builder("male").age("25").dob(new Date(1990,02,18)).build();
          CustomerDetails customerDetails1 = new CustomerDetails.Builder("Sarah").customerSrname("Michael").telephoneNumber("021-7056524").cellNumber("08463257525").postalAddress("13 York Street, Plumstead").demographic(demographic1).build();
          CustomerDetails returnCustomerDetails = customerDetailsCrudService.persist(customerDetails1);
          when(customerDetailsCrudService.persist(customerDetails1)).thenReturn(returnCustomerDetails);
          Mockito.verify(customerDetailsCrudService).persist(customerDetails1);
    }
    
     @Test
    public void testRead() throws Exception 
    {
        Demographic demographic1 = new Demographic.Builder("male").age("25").dob(new Date(1990,02,18)).build();
        CustomerDetails customerDetails1 = new CustomerDetails.Builder("Sarah").customerSrname("Michael").telephoneNumber("021-7056524").cellNumber("08463257525").postalAddress("13 York Street, Plumstead").demographic(demographic1).build();
        CustomerDetails returnCustomerDetails = customerDetailsCrudService.find(customerDetails1.getCellNumber());
        when(customerDetailsCrudService.find(customerDetails1.getCellNumber())).thenReturn(returnCustomerDetails);
        Mockito.verify(customerDetailsCrudService).find(customerDetails1.getCellNumber());
    }
    
    @Test
    public void testUpdate() throws Exception 
    {
       
        Demographic demographic1 = new Demographic.Builder("male").age("25").dob(new Date(1990,02,18)).build();
        CustomerDetails customerDetails1 = new CustomerDetails.Builder("Sarah").customerSrname("Michael").telephoneNumber("021-7056524").cellNumber("08463257525").postalAddress("13 York Street, Plumstead").demographic(demographic1).build();
        customerDetails1 = new CustomerDetails.Builder("Sarah").customerSrname("Davidson").telephoneNumber("021-7056524").cellNumber("08463257525").postalAddress("13 York Street, Plumstead").demographic(demographic1).build();    
        CustomerDetails returnCustomerDetails2 = customerDetailsCrudService.merge(customerDetails1);
        when(customerDetailsCrudService.merge(customerDetails1)).thenReturn(returnCustomerDetails2);
       
        Mockito.verify(customerDetailsCrudService).merge(customerDetails1);
        
       
    }
    
    @Test
    public void testDelete() throws Exception 
    {
        Demographic demographic1 = new Demographic.Builder("male").age("25").dob(new Date(1990,02,18)).build();
        CustomerDetails customerDetails1 = new CustomerDetails.Builder("Sarah").customerSrname("Michael").telephoneNumber("021-7056524").cellNumber("08463257525").postalAddress("13 York Street, Plumstead").demographic(demographic1).build();
        CustomerDetails returnCustomerDetails = customerDetailsCrudService.remove(customerDetails1);
        when(customerDetailsCrudService.remove(customerDetails1)).thenReturn(returnCustomerDetails);
        Mockito.verify(customerDetailsCrudService).remove(customerDetails1);
    }
}
