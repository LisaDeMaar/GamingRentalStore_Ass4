/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.gamingrentalstore_assignment4.services.crud.Impl;

import com.lisa.gamingrentalstore_assignment4.model.CustomerAccount;
import com.lisa.gamingrentalstore_assignment4.services.crud.CustomerAccountCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Lisa
 */
public class CustomerAccountCrudServiceImpl implements CustomerAccountCrudService {


    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public CustomerAccount find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public CustomerAccount persist(CustomerAccount entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public CustomerAccount merge(CustomerAccount entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public CustomerAccount remove(CustomerAccount entity) {

        return  null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<CustomerAccount> findAll() {
        return null;
    } 
    
}
