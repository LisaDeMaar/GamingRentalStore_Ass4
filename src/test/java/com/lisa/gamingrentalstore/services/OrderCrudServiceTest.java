/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.gamingrentalstore.services;

import com.lisa.gamingrentalstore_assignment4.model.Order;
import com.lisa.gamingrentalstore_assignment4.services.crud.OrderCrudService;
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
public class OrderCrudServiceTest {
    
    @Mock
    OrderCrudService orderCrudService;
    
    public OrderCrudServiceTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public void setUpClass() throws Exception {
        
         MockitoAnnotations.initMocks(this);
        orderCrudService = Mockito.mock(OrderCrudService.class);
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
         Order order1 = new Order.Builder("Order1").orderDate(new Date(2014,03,05)).build();
         Order returnOrder = orderCrudService.persist(order1);
         when(orderCrudService.persist(order1)).thenReturn(returnOrder);
         Mockito.verify(orderCrudService).persist(order1);
    }
    
     @Test
    public void testRead() throws Exception 
    {
       Order order1 = new Order.Builder("Order1").orderDate(new Date(2014,03,05)).build();
        Order returnOrder = orderCrudService.find(order1.getOrderID());
        when(orderCrudService.find(order1.getOrderID())).thenReturn(returnOrder);
        Mockito.verify(orderCrudService).find(order1.getOrderID());
    }
    
    @Test
    public void testUpdate() throws Exception 
    {
       
        Order order1 = new Order.Builder("Order1").orderDate(new Date(2014,03,05)).build();
        order1 = new Order.Builder("Order2").orderDate(new Date(2014,03,05)).build();    
        Order returnOrder2 = orderCrudService.merge(order1);
        when(orderCrudService.merge(order1)).thenReturn(returnOrder2);
       
        Mockito.verify(orderCrudService).merge(order1);
        
       
    }
    
    @Test
    public void testDelete() throws Exception 
    {
        Order order1 = new Order.Builder("Order1").orderDate(new Date(2014,03,05)).build();
        Order returnOrder = orderCrudService.remove(order1);
        when(orderCrudService.remove(order1)).thenReturn(returnOrder);
        Mockito.verify(orderCrudService).remove(order1);
    }
}
