/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.gamingrentalstore.services;

import com.lisa.gamingrentalstore_assignment4.model.PaymentType;
import com.lisa.gamingrentalstore_assignment4.services.crud.PaymentTypeCrudService;
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
public class PaymentTypeCrudServiceTest {
    
      @Mock
    PaymentTypeCrudService paymentTypeCrudService;
    
    public PaymentTypeCrudServiceTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public void setUpClass() throws Exception {
        
        MockitoAnnotations.initMocks(this);
        paymentTypeCrudService = Mockito.mock(PaymentTypeCrudService.class);
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
          PaymentType paymentType1 = new PaymentType.Builder("PAY001").paymentType("Cash").build();
         PaymentType returnPaymentType = paymentTypeCrudService.persist(paymentType1);
         when(paymentTypeCrudService.persist(paymentType1)).thenReturn(returnPaymentType);
         Mockito.verify(paymentTypeCrudService).persist(paymentType1);
    }
    
     @Test
    public void testRead() throws Exception 
    {
        PaymentType paymentType1 = new PaymentType.Builder("PAY001").paymentType("Cash").build();
        PaymentType returnPaymentType = paymentTypeCrudService.find(paymentType1.getPaymentTypeID());
        when(paymentTypeCrudService.find(paymentType1.getPaymentTypeID())).thenReturn(returnPaymentType);
        Mockito.verify(paymentTypeCrudService).find(paymentType1.getPaymentTypeID());
    }
    
    @Test
    public void testUpdate() throws Exception 
    {
       
        PaymentType paymentType1 = new PaymentType.Builder("PAY001").paymentType("Cash").build();
        paymentType1 = new PaymentType.Builder("PAY002").paymentType("Cash").build();    
        PaymentType returnPaymentType2 = paymentTypeCrudService.merge(paymentType1);
        when(paymentTypeCrudService.merge(paymentType1)).thenReturn(returnPaymentType2);
       
        Mockito.verify(paymentTypeCrudService).merge(paymentType1);
        
       
    }
    
    @Test
    public void testDelete() throws Exception 
    {
         PaymentType paymentType1 = new PaymentType.Builder("PAY001").paymentType("Cash").build();
        PaymentType returnPaymentType = paymentTypeCrudService.remove(paymentType1);
        when(paymentTypeCrudService.remove(paymentType1)).thenReturn(returnPaymentType);
        Mockito.verify(paymentTypeCrudService).remove(paymentType1);
    }
}
