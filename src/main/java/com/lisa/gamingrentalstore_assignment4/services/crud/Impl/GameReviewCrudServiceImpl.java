/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.gamingrentalstore_assignment4.services.crud.Impl;

import com.lisa.gamingrentalstore_assignment4.model.GameReview;
import com.lisa.gamingrentalstore_assignment4.services.crud.GameReviewCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Lisa
 */
public class GameReviewCrudServiceImpl implements GameReviewCrudService {


    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public GameReview find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public GameReview persist(GameReview entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public GameReview merge(GameReview entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public GameReview remove(GameReview entity) {

        return  null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<GameReview> findAll() {
        return null;
    } 
    
}
