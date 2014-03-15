/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.gamingrentalstore.services;

import com.lisa.gamingrentalstore_assignment4.model.RentalLog;
import com.lisa.gamingrentalstore_assignment4.services.crud.RentalLogCrudService;
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
public class RentalLogCrudServiceTest {
    
    @Mock
    RentalLogCrudService rentalLogCrudService;
    
    public RentalLogCrudServiceTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public void setUpClass() throws Exception {
        
        MockitoAnnotations.initMocks(this);
        rentalLogCrudService = Mockito.mock(RentalLogCrudService.class);
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
         RentalLog rentalLog1 = new RentalLog.Builder("RL1").currentDate(new Date(2014,03,05)).build();
         RentalLog returnRentalLog = rentalLogCrudService.persist(rentalLog1);
         when(rentalLogCrudService.persist(rentalLog1)).thenReturn(returnRentalLog);
         Mockito.verify(rentalLogCrudService).persist(rentalLog1);
    }
    
     @Test
    public void testRead() throws Exception 
    {
       RentalLog rentalLog1 = new RentalLog.Builder("RL1").currentDate(new Date(2014,03,05)).build();
        RentalLog returnRentalLog = rentalLogCrudService.find(rentalLog1.getRentalLogID());
        when(rentalLogCrudService.find(rentalLog1.getRentalLogID())).thenReturn(returnRentalLog);
        Mockito.verify(rentalLogCrudService).find(rentalLog1.getRentalLogID());
    }
    
    @Test
    public void testUpdate() throws Exception 
    {
       
        RentalLog rentalLog1 = new RentalLog.Builder("RL1").currentDate(new Date(2014,03,05)).build();
        rentalLog1 = new RentalLog.Builder("RL2").currentDate(new Date(2014,03,05)).build();    
        RentalLog returnRentalLog2 = rentalLogCrudService.merge(rentalLog1);
        when(rentalLogCrudService.merge(rentalLog1)).thenReturn(returnRentalLog2);
       
        Mockito.verify(rentalLogCrudService).merge(rentalLog1);
        
       
    }
    
    @Test
    public void testDelete() throws Exception 
    {
       RentalLog rentalLog1 = new RentalLog.Builder("RL1").currentDate(new Date(2014,03,05)).build();
        RentalLog returnRentalLog = rentalLogCrudService.remove(rentalLog1);
        when(rentalLogCrudService.remove(rentalLog1)).thenReturn(returnRentalLog);
        Mockito.verify(rentalLogCrudService).remove(rentalLog1);
    }
}
