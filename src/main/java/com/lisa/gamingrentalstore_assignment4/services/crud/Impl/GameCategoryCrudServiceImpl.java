/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.gamingrentalstore_assignment4.services.crud.Impl;

import com.lisa.gamingrentalstore_assignment4.model.GameCategory;
import com.lisa.gamingrentalstore_assignment4.services.crud.GameCategoryCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Lisa
 */
public class GameCategoryCrudServiceImpl implements GameCategoryCrudService {


    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public GameCategory find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public GameCategory persist(GameCategory entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public GameCategory merge(GameCategory entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public GameCategory remove(GameCategory entity) {

        return  null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<GameCategory> findAll() {
        return null;
    } 
    
}
