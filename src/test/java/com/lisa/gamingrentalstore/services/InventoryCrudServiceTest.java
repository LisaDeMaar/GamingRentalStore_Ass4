/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.gamingrentalstore.services;

import com.lisa.gamingrentalstore_assignment4.model.Inventory;
import com.lisa.gamingrentalstore_assignment4.services.crud.InventoryCrudService;
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
public class InventoryCrudServiceTest {
    
     @Mock
    InventoryCrudService inventoryCrudService;
    
    public InventoryCrudServiceTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public void setUpClass() throws Exception {
        
         MockitoAnnotations.initMocks(this);
        inventoryCrudService = Mockito.mock(InventoryCrudService.class);
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
         Inventory inv1 = new Inventory.Builder(3).gamesIn(3).gamesOut(0).inventoryID("INV001").build();
         Inventory returnInventory = inventoryCrudService.persist(inv1);
         when(inventoryCrudService.persist(inv1)).thenReturn(returnInventory);
         Mockito.verify(inventoryCrudService).persist(inv1);
    }
    
     @Test
    public void testRead() throws Exception 
    {
       Inventory inv1 = new Inventory.Builder(3).gamesIn(3).gamesOut(0).inventoryID("INV001").build();
        Inventory returnInventory = inventoryCrudService.find(inv1.getInventoryID());
        when(inventoryCrudService.find(inv1.getInventoryID())).thenReturn(returnInventory);
        Mockito.verify(inventoryCrudService).find(inv1.getInventoryID());
    }
    
    @Test
    public void testUpdate() throws Exception 
    {
       
       Inventory inv1 = new Inventory.Builder(3).gamesIn(3).gamesOut(0).inventoryID("INV001").build();
        inv1 = new Inventory.Builder(3).gamesIn(3).gamesOut(0).inventoryID("INV002").build();   
        Inventory returnInventory2 = inventoryCrudService.merge(inv1);
        when(inventoryCrudService.merge(inv1)).thenReturn(returnInventory2);
       
        Mockito.verify(inventoryCrudService).merge(inv1);
        
       
    }
    
    @Test
    public void testDelete() throws Exception 
    {
        Inventory inv1 = new Inventory.Builder(3).gamesIn(3).gamesOut(0).inventoryID("INV001").build();
        Inventory returnInventory = inventoryCrudService.remove(inv1);
        when(inventoryCrudService.remove(inv1)).thenReturn(returnInventory);
        Mockito.verify(inventoryCrudService).remove(inv1);
    }
}
