/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.gamingrentalstore.services;

import com.lisa.gamingrentalstore_assignment4.model.Fines;
import com.lisa.gamingrentalstore_assignment4.services.crud.FinesCrudService;
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
public class FinesCrudServiceTest 
{
      @Mock
    FinesCrudService finesCrudService;
      
    public FinesCrudServiceTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public void setUpClass() throws Exception {
        
        MockitoAnnotations.initMocks(this);
        finesCrudService = Mockito.mock(FinesCrudService.class);
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
         Fines fine1 = new Fines.Builder("F001").fineAmount(30.00).build();
         Fines returnFines = finesCrudService.persist(fine1);
         when(finesCrudService.persist(fine1)).thenReturn(returnFines);
         Mockito.verify(finesCrudService).persist(fine1);
    }
    
     @Test
    public void testRead() throws Exception 
    {
       Fines fine1 = new Fines.Builder("F001").fineAmount(30.00).build();
        Fines returnFines = finesCrudService.find(fine1.getFineID());
        when(finesCrudService.find(fine1.getFineID())).thenReturn(returnFines);
        Mockito.verify(finesCrudService).find(fine1.getFineID());
    }
    
    @Test
    public void testUpdate() throws Exception 
    {
       
        Fines fine1 = new Fines.Builder("F001").fineAmount(30.00).build();
        fine1 = new Fines.Builder("F002").build();
        Fines returnFines2 = finesCrudService.merge(fine1);
        when(finesCrudService.merge(fine1)).thenReturn(returnFines2);
       
        Mockito.verify(finesCrudService).merge(fine1);
        
       
    }
    
    @Test
    public void testDelete() throws Exception 
    {
       Fines fine1 = new Fines.Builder("F001").fineAmount(30.00).build();
        Fines returnFines = finesCrudService.remove(fine1);
        when(finesCrudService.remove(fine1)).thenReturn(returnFines);
        Mockito.verify(finesCrudService).remove(fine1);
    }
}
