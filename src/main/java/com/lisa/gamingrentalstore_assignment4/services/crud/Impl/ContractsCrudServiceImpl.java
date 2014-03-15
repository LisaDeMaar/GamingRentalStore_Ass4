/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.gamingrentalstore_assignment4.services.crud.Impl;

import com.lisa.gamingrentalstore_assignment4.model.Contracts;
import com.lisa.gamingrentalstore_assignment4.services.crud.ContractsCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Lisa
 */
public class ContractsCrudServiceImpl implements ContractsCrudService {


    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Contracts find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Contracts persist(Contracts entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Contracts merge(Contracts entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Contracts remove(Contracts entity) {

        return  null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Contracts> findAll() {
        return null;
    } 
    
}
