/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.gamingrentalstore_assignment4.model;

import java.util.Date;

/**
 *
 * @author Lisa
 */
public class RentalLog 
{
    private String rentalLogID;
    private Date currentDate;
    
          private RentalLog()
    {
        
    }
    
     private RentalLog(Builder builder)
   {
       rentalLogID = builder.rentalLogID;
       currentDate = builder.currentDate;
            
   }
    
    public static class Builder
  {
        private String rentalLogID;
        private Date currentDate;
        
        public Builder(String rentalLogID) {
            this.rentalLogID = rentalLogID;
            
        }
        
         public Builder currentDate (Date currentDate) 
        {
            this.currentDate = currentDate;
            
            return this;
                    
        }
         
          public RentalLog build(){
            return new RentalLog(this);
        }
    }
    
    public String getRentalLogID() {
        return rentalLogID;
    }

    public Date getCurrentDate() 
    {
        return currentDate;
    }
    
     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RentalLog paymentType = (RentalLog) o;

        if (!rentalLogID.equals(paymentType.rentalLogID)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return rentalLogID.hashCode();
    }
    
}
