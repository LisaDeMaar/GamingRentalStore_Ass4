/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.gamingrentalstore_assignment4.services.crud.Impl;

import com.lisa.gamingrentalstore_assignment4.model.OrderItem;
import com.lisa.gamingrentalstore_assignment4.services.crud.OrderItemCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Lisa
 */
public class OrderItemCrudServiceImpl implements OrderItemCrudService {


    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public OrderItem find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public OrderItem persist(OrderItem entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public OrderItem merge(OrderItem entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public OrderItem remove(OrderItem entity) {

        return  null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<OrderItem> findAll() {
        return null;
    } 
    
}
