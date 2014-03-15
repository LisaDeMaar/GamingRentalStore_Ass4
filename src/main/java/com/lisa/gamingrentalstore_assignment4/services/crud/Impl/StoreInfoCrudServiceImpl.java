/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.gamingrentalstore_assignment4.services.crud.Impl;

import com.lisa.gamingrentalstore_assignment4.model.StoreInfo;
import com.lisa.gamingrentalstore_assignment4.services.crud.StoreInfoCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Lisa
 */
public class StoreInfoCrudServiceImpl implements StoreInfoCrudService {


    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public StoreInfo find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public StoreInfo persist(StoreInfo entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public StoreInfo merge(StoreInfo entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public StoreInfo remove(StoreInfo entity) {

        return  null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<StoreInfo> findAll() {
        return null;
    } 
    
}
