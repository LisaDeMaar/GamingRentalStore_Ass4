/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.gamingrentalstore.services;

import com.lisa.gamingrentalstore_assignment4.model.GameCategory;
import com.lisa.gamingrentalstore_assignment4.services.crud.GameCategoryCrudService;
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
public class GameCategoryCrudServiceTest {
    
    @Mock
    GameCategoryCrudService gameCategoryCrudService;
    
    public GameCategoryCrudServiceTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public void setUpClass() throws Exception {
        
        MockitoAnnotations.initMocks(this);
        gameCategoryCrudService = Mockito.mock(GameCategoryCrudService.class);
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
         GameCategory gameCategory1 = new GameCategory.Builder("CAT001").categoryName("Latest").build();
         GameCategory returnGameCategory = gameCategoryCrudService.persist(gameCategory1);
         when(gameCategoryCrudService.persist(gameCategory1)).thenReturn(returnGameCategory);
         Mockito.verify(gameCategoryCrudService).persist(gameCategory1);
    }
    
     @Test
    public void testRead() throws Exception 
    {
       GameCategory gameCategory1 = new GameCategory.Builder("CAT001").categoryName("Latest").build();
        GameCategory returnGameCategory = gameCategoryCrudService.find(gameCategory1.getCategoryID());
        when(gameCategoryCrudService.find(gameCategory1.getCategoryID())).thenReturn(returnGameCategory);
        Mockito.verify(gameCategoryCrudService).find(gameCategory1.getCategoryID());
    }
    
    @Test
    public void testUpdate() throws Exception 
    {
       
        GameCategory gameCategory1 = new GameCategory.Builder("CAT001").categoryName("Latest").build();
        gameCategory1 = new GameCategory.Builder("CAT002").build();    
        GameCategory returnGameCategory2 = gameCategoryCrudService.merge(gameCategory1);
        when(gameCategoryCrudService.merge(gameCategory1)).thenReturn(returnGameCategory2);
       
        Mockito.verify(gameCategoryCrudService).merge(gameCategory1);
        
       
    }
    
    @Test
    public void testDelete() throws Exception 
    {
        GameCategory gameCategory1 = new GameCategory.Builder("CAT001").categoryName("Latest").build();
        GameCategory returnGameCategory = gameCategoryCrudService.remove(gameCategory1);
        when(gameCategoryCrudService.remove(gameCategory1)).thenReturn(returnGameCategory);
        Mockito.verify(gameCategoryCrudService).remove(gameCategory1);
    }
}
