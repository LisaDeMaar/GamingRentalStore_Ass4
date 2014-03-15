/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.gamingrentalstore.services;

import com.lisa.gamingrentalstore_assignment4.model.Games;
import com.lisa.gamingrentalstore_assignment4.services.crud.GamesCrudService;
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
public class GameCrudServiceTest {
    
    @Mock
    GamesCrudService gameCrudService;
    
    public GameCrudServiceTest() {
        
        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public void setUpClass() throws Exception {
        
         MockitoAnnotations.initMocks(this);
        gameCrudService = Mockito.mock(GamesCrudService.class);
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
        Games game1 = new Games.Builder("GAM001").name("The Sims 4").build();
         Games returnGames = gameCrudService.persist(game1);
         when(gameCrudService.persist(game1)).thenReturn(returnGames);
         Mockito.verify(gameCrudService).persist(game1);
    }
    
     @Test
    public void testRead() throws Exception 
    {
       Games game1 = new Games.Builder("GAM001").name("The Sims 4").build();
        Games returnGames = gameCrudService.find(game1.getGameID());
        when(gameCrudService.find(game1.getGameID())).thenReturn(returnGames);
        Mockito.verify(gameCrudService).find(game1.getGameID());
    }
    
    @Test
    public void testUpdate() throws Exception 
    {
       
        Games game1 = new Games.Builder("GAM001").name("The Sims 4").build();
        game1 = new Games.Builder("GAM002").name("The Sims 4").build();    
        Games returnGames2 = gameCrudService.merge(game1);
        when(gameCrudService.merge(game1)).thenReturn(returnGames2);
       
        Mockito.verify(gameCrudService).merge(game1);
        
       
    }
    
    @Test
    public void testDelete() throws Exception 
    {
        Games game1 = new Games.Builder("GAM001").name("The Sims 4").build();
        Games returnGames = gameCrudService.remove(game1);
        when(gameCrudService.remove(game1)).thenReturn(returnGames);
        Mockito.verify(gameCrudService).remove(game1);
    }
}
