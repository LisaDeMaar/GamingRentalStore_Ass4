/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.gamingrentalstore.services;

import com.lisa.gamingrentalstore_assignment4.model.OrderItem;
import com.lisa.gamingrentalstore_assignment4.services.crud.OrderItemCrudService;
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
public class OrderItemCrudServiceTest {
    
    @Mock
    OrderItemCrudService orderItemCrudService;
    
    public OrderItemCrudServiceTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public void setUpClass() throws Exception {
        
         MockitoAnnotations.initMocks(this);
        orderItemCrudService = Mockito.mock(OrderItemCrudService.class);
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
        OrderItem orderItem1 = new OrderItem.Builder("ITEM001").quantity(1).build();
         OrderItem returnOrderItem = orderItemCrudService.persist(orderItem1);
         when(orderItemCrudService.persist(orderItem1)).thenReturn(returnOrderItem);
         Mockito.verify(orderItemCrudService).persist(orderItem1);
    }
    
     @Test
    public void testRead() throws Exception 
    {
       OrderItem orderItem1 = new OrderItem.Builder("ITEM001").quantity(1).build();
        OrderItem returnOrderItem = orderItemCrudService.find(orderItem1.getId());
        when(orderItemCrudService.find(orderItem1.getId())).thenReturn(returnOrderItem);
        Mockito.verify(orderItemCrudService).find(orderItem1.getId());
    }
    
    @Test
    public void testUpdate() throws Exception 
    {
       
        OrderItem orderItem1 = new OrderItem.Builder("ITEM001").quantity(1).build();
        orderItem1 = new OrderItem.Builder("ITEM002").quantity(1).build();    
        OrderItem returnOrderItem2 = orderItemCrudService.merge(orderItem1);
        when(orderItemCrudService.merge(orderItem1)).thenReturn(returnOrderItem2);
       
        Mockito.verify(orderItemCrudService).merge(orderItem1);
        
       
    }
    
    @Test
    public void testDelete() throws Exception 
    {
        OrderItem orderItem1 = new OrderItem.Builder("ITEM001").quantity(1).build();
        OrderItem returnOrderItem = orderItemCrudService.remove(orderItem1);
        when(orderItemCrudService.remove(orderItem1)).thenReturn(returnOrderItem);
        Mockito.verify(orderItemCrudService).remove(orderItem1);
    }
}
