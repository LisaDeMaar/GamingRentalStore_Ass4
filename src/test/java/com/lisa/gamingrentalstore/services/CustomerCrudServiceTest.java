/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.gamingrentalstore.services;

import com.lisa.gamingrentalstore_assignment4.model.Customer;
import com.lisa.gamingrentalstore_assignment4.services.crud.CustomerCrudService;
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
public class CustomerCrudServiceTest {
    
     @Mock
    CustomerCrudService customerCrudService;
    
    public CustomerCrudServiceTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public void setUpClass() throws Exception {
        MockitoAnnotations.initMocks(this);
        customerCrudService = Mockito.mock(CustomerCrudService.class);
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
         Customer customer1 = new Customer.Builder("C001").build();
         Customer returnCustomer = customerCrudService.persist(customer1);
         when(customerCrudService.persist(customer1)).thenReturn(returnCustomer);
         Mockito.verify(customerCrudService).persist(customer1);
    }
    
     @Test
    public void testRead() throws Exception 
    {
       Customer customer1 = new Customer.Builder("C001").build();
        Customer returnCustomer = customerCrudService.find(customer1.getCustomerID());
        when(customerCrudService.find(customer1.getCustomerID())).thenReturn(returnCustomer);
        Mockito.verify(customerCrudService).find(customer1.getCustomerID());
    }
    
    @Test
    public void testUpdate() throws Exception 
    {
       
        Customer customer1 = new Customer.Builder("C001").build();
        customer1 = new Customer.Builder("C003").build();    
        Customer returnCustomer2 = customerCrudService.merge(customer1);
        when(customerCrudService.merge(customer1)).thenReturn(returnCustomer2);
       
        Mockito.verify(customerCrudService).merge(customer1);
        
       
    }
    
    @Test
    public void testDelete() throws Exception 
    {
        Customer customer1 = new Customer.Builder("C001").build();
        Customer returnCustomer = customerCrudService.remove(customer1);
        when(customerCrudService.remove(customer1)).thenReturn(returnCustomer);
        Mockito.verify(customerCrudService).remove(customer1);
    }
}
