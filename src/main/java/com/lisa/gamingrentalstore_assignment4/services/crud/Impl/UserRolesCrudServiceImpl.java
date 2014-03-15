/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.gamingrentalstore_assignment4.services.crud.Impl;

import com.lisa.gamingrentalstore_assignment4.model.UserRoles;
import com.lisa.gamingrentalstore_assignment4.services.crud.UserRolesCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Lisa
 */
public class UserRolesCrudServiceImpl implements UserRolesCrudService {


    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public UserRoles find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public UserRoles persist(UserRoles entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public UserRoles merge(UserRoles entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public UserRoles remove(UserRoles entity) {

        return  null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<UserRoles> findAll() {
        return null;
    } 
    
}
