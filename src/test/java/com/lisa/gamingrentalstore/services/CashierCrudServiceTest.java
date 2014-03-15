/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.gamingrentalstore.services;

import com.lisa.gamingrentalstore_assignment4.model.Cashier;
import com.lisa.gamingrentalstore_assignment4.services.crud.CashierCrudService;
import java.security.KeyStore;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.testng.Assert;
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
public class CashierCrudServiceTest 
{
    @Mock
    CashierCrudService cashierCrudService;
    
    public CashierCrudServiceTest() {
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
    cashierCrudService = Mockito.mock(CashierCrudService.class);
    }

   @Test
    public void testCreate() throws Exception 
    {
         Cashier cashier1 = new Cashier.Builder("CA001").cashierName("Lynne").cashierSurname("Smith").build();
         Cashier returnCashier = cashierCrudService.persist(cashier1);
         when(cashierCrudService.persist(cashier1)).thenReturn(returnCashier);
         Mockito.verify(cashierCrudService).persist(cashier1);
    }
    
     @Test
    public void testRead() throws Exception 
    {
        Cashier cashier1 = new Cashier.Builder("CA001").cashierName("Lynne").cashierSurname("Smith").build();
        Cashier returnCashier = cashierCrudService.find(cashier1.getCashierID());
        when(cashierCrudService.find(cashier1.getCashierID())).thenReturn(returnCashier);
        Mockito.verify(cashierCrudService).find(cashier1.getCashierID());
    }
    
    @Test
    public void testUpdate() throws Exception 
    {
       
        Cashier cashier2 = new Cashier.Builder("CA002").cashierName("Kelly").build();
        cashier2 = new Cashier.Builder("CA001").cashierName("Shelly").build();
        Cashier returnCashier2 = cashierCrudService.merge(cashier2);
        when(cashierCrudService.merge(cashier2)).thenReturn(returnCashier2);
       
        Mockito.verify(cashierCrudService).merge(cashier2);
        
       
    }
    
    @Test
    public void testDelete() throws Exception 
    {
        Cashier cashier1 = new Cashier.Builder("CA001").cashierName("Lynne").cashierSurname("Smith").build();
        Cashier returnCashier = cashierCrudService.remove(cashier1);
        when(cashierCrudService.remove(cashier1)).thenReturn(returnCashier);
        Mockito.verify(cashierCrudService).remove(cashier1);
    }

}
