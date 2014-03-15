/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.gamingrentalstore_assignment4.services.crud.Impl;

import com.lisa.gamingrentalstore_assignment4.model.GamesComingSoon;
import com.lisa.gamingrentalstore_assignment4.services.crud.GamesComingSoonCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Lisa
 */
public class GamesComingSoonCrudServiceImpl implements GamesComingSoonCrudService {


    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public GamesComingSoon find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public GamesComingSoon persist(GamesComingSoon entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public GamesComingSoon merge(GamesComingSoon entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public GamesComingSoon remove(GamesComingSoon entity) {

        return  null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<GamesComingSoon> findAll() {
        return null;
    } 
    
}
