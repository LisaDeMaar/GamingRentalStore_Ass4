/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.gamingrentalstore_assignment4.model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Lisa
 */
public final class CustomerAccount 
{
   private String rentalCode;
   private CustomerDetails customerDetails;
   private List<RentalSales> rentalSales;
   private Contracts contract;
   
   
   private CustomerAccount()
   {
       
   }
   
   private CustomerAccount(Builder builder)
   {
       rentalCode = builder.rentalCode;
       customerDetails = builder.customerDetails;
       rentalSales = builder.rentalSales;
       contract = builder.contract;
       
   }
   
    public static class Builder{
        private String rentalCode;
        private CustomerDetails customerDetails;
        private List<RentalSales> rentalSales;
        private Contracts contract;

        public Builder(String rentalCode) {
            this.rentalCode= rentalCode;
        }

        public Builder customerDetails(CustomerDetails value )
        {
            customerDetails = value;
            return this;
        }

        public Builder rentalSales(List<RentalSales> value){
            rentalSales = value;
            return this;
        }
        
         public Builder contract(Contracts contract){
             this.contract = contract;
            return this;
        }

        public CustomerAccount build(){
            return new CustomerAccount(this);
        }
    }

    public String getRentalCode() {
        return rentalCode;
    }

    public CustomerDetails getCustomerDetails() 
    {
        return customerDetails;
    }

    public List<RentalSales> getRentalSales() {
        return rentalSales;
    }
    
    public Contracts getContract() {
        return contract;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomerAccount customerAccount = (CustomerAccount) o;

        if (!rentalCode.equals(customerAccount.rentalCode)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return rentalCode.hashCode();
    }
   
   
   
   
    
}
