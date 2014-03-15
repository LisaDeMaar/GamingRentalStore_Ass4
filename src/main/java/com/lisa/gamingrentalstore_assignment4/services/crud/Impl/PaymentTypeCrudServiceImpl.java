/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.gamingrentalstore_assignment4.services.crud.Impl;

import com.lisa.gamingrentalstore_assignment4.model.PaymentType;
import com.lisa.gamingrentalstore_assignment4.services.crud.PaymentTypeCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Lisa
 */
public class PaymentTypeCrudServiceImpl implements PaymentTypeCrudService {


    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public PaymentType find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public PaymentType persist(PaymentType entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public PaymentType merge(PaymentType entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public PaymentType remove(PaymentType entity) {

        return  null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<PaymentType> findAll() {
        return null;
    } 
    
}
