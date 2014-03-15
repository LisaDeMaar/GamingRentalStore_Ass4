/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.gamingrentalstore.services;

import com.lisa.gamingrentalstore_assignment4.model.Users;
import com.lisa.gamingrentalstore_assignment4.services.crud.UsersCrudService;
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
public class UsersCrudServiceTest {
    
    @Mock
    UsersCrudService usersCrudService;
    
    public UsersCrudServiceTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public void setUpClass() throws Exception {
        
         MockitoAnnotations.initMocks(this);
        usersCrudService = Mockito.mock(UsersCrudService.class);
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
        Users user1 = new Users.Builder("bonnie").password("362542").build();
         Users returnUsers = usersCrudService.persist(user1);
         when(usersCrudService.persist(user1)).thenReturn(returnUsers);
         Mockito.verify(usersCrudService).persist(user1);
    }
    
     @Test
    public void testRead() throws Exception 
    {
       Users user1 = new Users.Builder("bonnie").password("362542").build();
        Users returnUsers = usersCrudService.find(user1.getUsername());
        when(usersCrudService.find(user1.getUsername())).thenReturn(returnUsers);
        Mockito.verify(usersCrudService).find(user1.getUsername());
    }
    
    @Test
    public void testUpdate() throws Exception 
    {
       
        Users user1 = new Users.Builder("bonnie").password("362542").build();
        user1 = new Users.Builder("bonnie123").password("362542").build();    
        Users returnUsers2 = usersCrudService.merge(user1);
        when(usersCrudService.merge(user1)).thenReturn(returnUsers2);
       
        Mockito.verify(usersCrudService).merge(user1);
        
       
    }
    
    @Test
    public void testDelete() throws Exception 
    {
        Users user1 = new Users.Builder("bonnie").password("362542").build();
        Users returnUsers = usersCrudService.remove(user1);
        when(usersCrudService.remove(user1)).thenReturn(returnUsers);
        Mockito.verify(usersCrudService).remove(user1);
    }
}
