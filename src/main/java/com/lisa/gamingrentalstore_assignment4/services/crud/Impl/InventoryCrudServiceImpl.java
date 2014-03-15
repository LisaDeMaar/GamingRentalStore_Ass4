/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.gamingrentalstore_assignment4.services.crud.Impl;

import com.lisa.gamingrentalstore_assignment4.model.Inventory;
import com.lisa.gamingrentalstore_assignment4.services.crud.InventoryCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Lisa
 */
public class InventoryCrudServiceImpl implements InventoryCrudService {


    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Inventory find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Inventory persist(Inventory entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Inventory merge(Inventory entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Inventory remove(Inventory entity) {

        return  null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Inventory> findAll() {
        return null;
    } 
    
}
