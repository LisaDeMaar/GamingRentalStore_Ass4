/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.gamingrentalstore.services;

import com.lisa.gamingrentalstore_assignment4.model.StoreInfo;
import com.lisa.gamingrentalstore_assignment4.services.crud.StoreInfoCrudService;
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
public class StoreInfoCrudTest {
    
    @Mock
    StoreInfoCrudService storeInfoCrudService;
    
    public StoreInfoCrudTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public void setUpClass() throws Exception {
        
        MockitoAnnotations.initMocks(this);
        storeInfoCrudService = Mockito.mock(StoreInfoCrudService.class);
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
          StoreInfo storeInfo = new StoreInfo.Builder("Planet Games").managerName("THANK YOU").build();
         StoreInfo returnStoreInfo = storeInfoCrudService.persist(storeInfo);
         when(storeInfoCrudService.persist(storeInfo)).thenReturn(returnStoreInfo);
         Mockito.verify(storeInfoCrudService).persist(storeInfo);
    }
    
     @Test
    public void testRead() throws Exception 
    {
       StoreInfo storeInfo = new StoreInfo.Builder("Planet Games").managerName("THANK YOU").build();
        StoreInfo returnStoreInfo = storeInfoCrudService.find(storeInfo.getStoreName());
        when(storeInfoCrudService.find(storeInfo.getStoreName())).thenReturn(returnStoreInfo);
        Mockito.verify(storeInfoCrudService).find(storeInfo.getStoreName());
    }
    
    @Test
    public void testUpdate() throws Exception 
    {
       
         StoreInfo storeInfo = new StoreInfo.Builder("Planet Games").managerName("THANK YOU").build();
        storeInfo = new StoreInfo.Builder("Planet Games").managerName("THANK YOU, DANKIE").build();   
        StoreInfo returnStoreInfo2 = storeInfoCrudService.merge(storeInfo);
        when(storeInfoCrudService.merge(storeInfo)).thenReturn(returnStoreInfo2);
       
        Mockito.verify(storeInfoCrudService).merge(storeInfo);
        
       
    }
    
    @Test
    public void testDelete() throws Exception 
    {
         StoreInfo storeInfo = new StoreInfo.Builder("Planet Games").managerName("THANK YOU").build();
        StoreInfo returnStoreInfo = storeInfoCrudService.remove(storeInfo);
        when(storeInfoCrudService.remove(storeInfo)).thenReturn(returnStoreInfo);
        Mockito.verify(storeInfoCrudService).remove(storeInfo);
    }
}
