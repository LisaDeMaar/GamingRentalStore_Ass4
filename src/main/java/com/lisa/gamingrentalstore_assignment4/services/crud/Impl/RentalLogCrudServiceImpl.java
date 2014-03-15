/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.gamingrentalstore_assignment4.services.crud.Impl;

import com.lisa.gamingrentalstore_assignment4.model.RentalLog;
import com.lisa.gamingrentalstore_assignment4.services.crud.RentalLogCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Lisa
 */
public class RentalLogCrudServiceImpl implements RentalLogCrudService {


    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public RentalLog find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public RentalLog persist(RentalLog entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public RentalLog merge(RentalLog entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public RentalLog remove(RentalLog entity) {

        return  null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<RentalLog> findAll() {
        return null;
    } 
    
}
