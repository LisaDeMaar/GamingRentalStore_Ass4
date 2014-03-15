/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.gamingrentalstore.services;

import com.lisa.gamingrentalstore_assignment4.model.GamesComingSoon;
import com.lisa.gamingrentalstore_assignment4.services.crud.GamesComingSoonCrudService;
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
public class GamesComingSoonCrudServiceTest {
    
    @Mock
    GamesComingSoonCrudService customerCrudService;
    
    public GamesComingSoonCrudServiceTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public void setUpClass() throws Exception {
        
        MockitoAnnotations.initMocks(this);
        customerCrudService = Mockito.mock(GamesComingSoonCrudService.class);
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
         GamesComingSoon gamesComingSoon = new GamesComingSoon.Builder("Grand Theft Auto V").gameDescription("Open world, action adventure game.").build();
         GamesComingSoon returnGamesComingSoon = customerCrudService.persist(gamesComingSoon);
         when(customerCrudService.persist(gamesComingSoon)).thenReturn(returnGamesComingSoon);
         Mockito.verify(customerCrudService).persist(gamesComingSoon);
    }
    
     @Test
    public void testRead() throws Exception 
    {
       GamesComingSoon gamesComingSoon = new GamesComingSoon.Builder("Grand Theft Auto V").gameDescription("Open world, action adventure game.").build();
        GamesComingSoon returnGamesComingSoon = customerCrudService.find(gamesComingSoon.getGameName());
        when(customerCrudService.find(gamesComingSoon.getGameName())).thenReturn(returnGamesComingSoon);
        Mockito.verify(customerCrudService).find(gamesComingSoon.getGameName());
    }
    
    @Test
    public void testUpdate() throws Exception 
    {
       
        GamesComingSoon gamesComingSoon = new GamesComingSoon.Builder("Grand Theft Auto V").gameDescription("Open world, action adventure game.").build();
        gamesComingSoon = new GamesComingSoon.Builder("Grand Theft Auto VI").gameDescription("Open world, action adventure game.").build();   
        GamesComingSoon returnGamesComingSoon2 = customerCrudService.merge(gamesComingSoon);
        when(customerCrudService.merge(gamesComingSoon)).thenReturn(returnGamesComingSoon2);
       
        Mockito.verify(customerCrudService).merge(gamesComingSoon);
        
       
    }
    
    @Test
    public void testDelete() throws Exception 
    {
        GamesComingSoon gamesComingSoon = new GamesComingSoon.Builder("Grand Theft Auto V").gameDescription("Open world, action adventure game.").build();
        GamesComingSoon returnGamesComingSoon = customerCrudService.remove(gamesComingSoon);
        when(customerCrudService.remove(gamesComingSoon)).thenReturn(returnGamesComingSoon);
        Mockito.verify(customerCrudService).remove(gamesComingSoon);
    }
}
