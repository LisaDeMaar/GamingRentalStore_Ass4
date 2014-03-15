/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.gamingrentalstore.services;

import com.lisa.gamingrentalstore_assignment4.model.GameReview;
import com.lisa.gamingrentalstore_assignment4.services.crud.GameReviewCrudService;
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
public class GameReviewCrudServiceTest {
    
     @Mock
    GameReviewCrudService gameReviewCrudService;
    
    public GameReviewCrudServiceTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public void setUpClass() throws Exception {
        
         MockitoAnnotations.initMocks(this);
        gameReviewCrudService = Mockito.mock(GameReviewCrudService.class);
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
          GameReview gameReview1 = new GameReview.Builder("Superb game").categoryName("****").build();
         GameReview returnGameReview = gameReviewCrudService.persist(gameReview1);
         when(gameReviewCrudService.persist(gameReview1)).thenReturn(returnGameReview);
         Mockito.verify(gameReviewCrudService).persist(gameReview1);
    }
    
     @Test
    public void testRead() throws Exception 
    {
        GameReview gameReview1 = new GameReview.Builder("Superb game").categoryName("****").build();
        GameReview returnGameReview = gameReviewCrudService.find(gameReview1.getDescription());
        when(gameReviewCrudService.find(gameReview1.getDescription())).thenReturn(returnGameReview);
        Mockito.verify(gameReviewCrudService).find(gameReview1.getDescription());
    }
    
    @Test
    public void testUpdate() throws Exception 
    {
       
        GameReview gameReview1 = new GameReview.Builder("Superb game").categoryName("****").build();
        gameReview1 = new GameReview.Builder("Super game").categoryName("****").build();  
        GameReview returnGameReview2 = gameReviewCrudService.merge(gameReview1);
        when(gameReviewCrudService.merge(gameReview1)).thenReturn(returnGameReview2);
       
        Mockito.verify(gameReviewCrudService).merge(gameReview1);
        
       
    }
    
    @Test
    public void testDelete() throws Exception 
    {
         GameReview gameReview1 = new GameReview.Builder("Superb game").categoryName("****").build();
        GameReview returnGameReview = gameReviewCrudService.remove(gameReview1);
        when(gameReviewCrudService.remove(gameReview1)).thenReturn(returnGameReview);
        Mockito.verify(gameReviewCrudService).remove(gameReview1);
    }
}
