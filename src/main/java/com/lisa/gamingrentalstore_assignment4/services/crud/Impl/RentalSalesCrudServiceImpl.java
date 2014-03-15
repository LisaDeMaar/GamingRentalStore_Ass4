/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.gamingrentalstore_assignment4.services.crud.Impl;

import com.lisa.gamingrentalstore_assignment4.model.RentalSales;
import com.lisa.gamingrentalstore_assignment4.services.crud.RentalSalesCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Lisa
 */
public class RentalSalesCrudServiceImpl implements RentalSalesCrudService {


    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public RentalSales find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public RentalSales persist(RentalSales entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public RentalSales merge(RentalSales entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public RentalSales remove(RentalSales entity) {

        return  null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<RentalSales> findAll() {
        return null;
    } 
    
}
