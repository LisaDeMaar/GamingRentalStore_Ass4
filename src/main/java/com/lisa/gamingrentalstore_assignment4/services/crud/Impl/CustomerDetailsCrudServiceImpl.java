/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.gamingrentalstore_assignment4.services.crud.Impl;

import com.lisa.gamingrentalstore_assignment4.model.CustomerDetails;
import com.lisa.gamingrentalstore_assignment4.services.crud.CustomerDetailsCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Lisa
 */
public class CustomerDetailsCrudServiceImpl implements CustomerDetailsCrudService {


    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public CustomerDetails find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public CustomerDetails persist(CustomerDetails entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public CustomerDetails merge(CustomerDetails entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public CustomerDetails remove(CustomerDetails entity) {

        return  null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<CustomerDetails> findAll() {
        return null;
    } 
    
}
