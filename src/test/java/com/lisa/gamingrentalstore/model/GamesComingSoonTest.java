/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.gamingrentalstore.model;

import com.lisa.gamingrentalstore_assignment4.model.GamesComingSoon;
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
public class GamesComingSoonTest {
    
    public GamesComingSoonTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
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
    public void testCreation() throws Exception 
    {
        GamesComingSoon games = new GamesComingSoon.Builder("Grand Theft Auto V").gameDescription("Open world, action adventure game.").build();
        
        Assert.assertNotNull(games);
        
        Assert.assertEquals(games.getGameName(), "Grand Theft Auto V");
    }
}
