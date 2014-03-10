/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.gamingrentalstore_assignment4.model;

import com.lisa.gamingrentalstore_assignment4.model.CustomerAccount.Builder;

/**
 *
 * @author Lisa
 */
public final class Customer 
{
    private String customerID;
    
    private Customer()
    {
        
    }
    
    private Customer(Builder builder)
    {
        customerID = builder.customerID;
    }
    
     public static class Builder
     {
         private String customerID;
         
          public Builder(String customerID) {
            this.customerID = customerID;
        }
          
           public Customer build(){
            return new Customer(this);
        }
     }
           
    public String getCustomerID() {
        return customerID;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (!customerID.equals(customer.customerID)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return customerID.hashCode();
    }
     
}
