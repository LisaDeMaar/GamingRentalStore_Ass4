/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.gamingrentalstore.services;

import com.lisa.gamingrentalstore_assignment4.model.Manager;
import com.lisa.gamingrentalstore_assignment4.services.crud.ManagerCrudService;
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
public class ManagerCrudServiceTest {
    
     @Mock
    ManagerCrudService managerCrudService;
    
    public ManagerCrudServiceTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public void setUpClass() throws Exception {
        
         MockitoAnnotations.initMocks(this);
        managerCrudService = Mockito.mock(ManagerCrudService.class);
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
          Manager manager1 = new Manager.Builder("MAN001").managerName("Eric Law").build();
         Manager returnManager = managerCrudService.persist(manager1);
         when(managerCrudService.persist(manager1)).thenReturn(returnManager);
         Mockito.verify(managerCrudService).persist(manager1);
    }
    
     @Test
    public void testRead() throws Exception 
    {
        Manager manager1 = new Manager.Builder("MAN001").managerName("Eric Law").build();
        Manager returnManager = managerCrudService.find(manager1.getManagerID());
        when(managerCrudService.find(manager1.getManagerID())).thenReturn(returnManager);
        Mockito.verify(managerCrudService).find(manager1.getManagerID());
    }
    
    @Test
    public void testUpdate() throws Exception 
    {
       
         Manager manager1 = new Manager.Builder("MAN001").managerName("Eric Law").build();
        manager1 = new Manager.Builder("MAN001").managerName("Ryan Riley").build();   
        Manager returnManager2 = managerCrudService.merge(manager1);
        when(managerCrudService.merge(manager1)).thenReturn(returnManager2);
       
        Mockito.verify(managerCrudService).merge(manager1);
        
       
    }
    
    @Test
    public void testDelete() throws Exception 
    {
        Manager manager1 = new Manager.Builder("MAN001").managerName("Eric Law").build();
        Manager returnManager = managerCrudService.remove(manager1);
        when(managerCrudService.remove(manager1)).thenReturn(returnManager);
        Mockito.verify(managerCrudService).remove(manager1);
    }
}
