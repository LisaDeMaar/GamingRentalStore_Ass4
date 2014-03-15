/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.gamingrentalstore.services;

import com.lisa.gamingrentalstore_assignment4.model.Demographic;
import com.lisa.gamingrentalstore_assignment4.services.crud.DemographicCrudService;
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
public class DemographicCrudServiceTest {
    @Mock
    DemographicCrudService demographicCrudService;
    
    public DemographicCrudServiceTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public void setUpClass() throws Exception {
         MockitoAnnotations.initMocks(this);
        demographicCrudService = Mockito.mock(DemographicCrudService.class);
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
         Demographic demographic1 = new Demographic.Builder("male").age("25").dob(new Date(1990,02,18)).build();
         Demographic returnDemographic = demographicCrudService.persist(demographic1);
         when(demographicCrudService.persist(demographic1)).thenReturn(returnDemographic);
         Mockito.verify(demographicCrudService).persist(demographic1);
    }
    
     @Test
    public void testRead() throws Exception 
    {
        Demographic demographic1 = new Demographic.Builder("male").age("25").dob(new Date(1990,02,18)).build();
        Demographic returnDemographic = demographicCrudService.find(demographic1.getAge());
        when(demographicCrudService.find(demographic1.getAge())).thenReturn(returnDemographic);
        Mockito.verify(demographicCrudService).find(demographic1.getAge());
    }
    
    @Test
    public void testUpdate() throws Exception 
    {
       
        Demographic demographic1 = new Demographic.Builder("male").age("25").dob(new Date(1990,02,18)).build();
        demographic1 = new Demographic.Builder("female").build();
        Demographic returnDemographic2 = demographicCrudService.merge(demographic1);
        when(demographicCrudService.merge(demographic1)).thenReturn(returnDemographic2);
       
        Mockito.verify(demographicCrudService).merge(demographic1);
        
       
    }
    
    @Test
    public void testDelete() throws Exception 
    {
         Demographic demographic1 = new Demographic.Builder("male").age("25").dob(new Date(1990,02,18)).build();
        Demographic returnDemographic = demographicCrudService.remove(demographic1);
        when(demographicCrudService.remove(demographic1)).thenReturn(returnDemographic);
        Mockito.verify(demographicCrudService).remove(demographic1);
    }
    
}
