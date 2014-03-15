/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.gamingrentalstore.services;

import com.lisa.gamingrentalstore_assignment4.model.Contracts;
import com.lisa.gamingrentalstore_assignment4.services.crud.ContractsCrudService;
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
public class ContractCrudServiceTest 
{
    @Mock
    ContractsCrudService contractCrudService;
    
    public ContractCrudServiceTest() {
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
        contractCrudService = Mockito.mock(ContractsCrudService.class);
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
         Contracts contract1 =  new Contracts.Builder("CON001").contractLength("One month").contractName("MonthContract").contractType("Rentals for a month").contractPrice(300.00).build();
         Contracts returnContracts = contractCrudService.persist(contract1);
         when(contractCrudService.persist(contract1)).thenReturn(returnContracts);
         Mockito.verify(contractCrudService).persist(contract1);
    }
    
     @Test
    public void testRead() throws Exception 
    {
       Contracts contract1 =  new Contracts.Builder("CON001").contractLength("One month").contractName("MonthContract").contractType("Rentals for a month").contractPrice(300.00).build();
        Contracts returnContracts = contractCrudService.find(contract1.getContractCode());
        when(contractCrudService.find(contract1.getContractCode())).thenReturn(returnContracts);
        Mockito.verify(contractCrudService).find(contract1.getContractCode());
    }
    
    @Test
    public void testUpdate() throws Exception 
    {
       
        Contracts contract1 =  new Contracts.Builder("CON001").contractLength("One month").contractName("MonthContract").contractType("Rentals for a month").contractPrice(300.00).build();
        contract1 = new Contracts.Builder("CON002").contractLength("One month").contractName("MonthContract").contractType("Rentals for a month").contractPrice(300.00).build();    
        Contracts returnContracts2 = contractCrudService.merge(contract1);
        when(contractCrudService.merge(contract1)).thenReturn(returnContracts2);
       
        Mockito.verify(contractCrudService).merge(contract1);
        
       
    }
    
    @Test
    public void testDelete() throws Exception 
    {
        Contracts contract1 =  new Contracts.Builder("CON001").contractLength("One month").contractName("MonthContract").contractType("Rentals for a month").contractPrice(300.00).build();
        Contracts returnContracts = contractCrudService.remove(contract1);
        when(contractCrudService.remove(contract1)).thenReturn(returnContracts);
        Mockito.verify(contractCrudService).remove(contract1);
    }
}
