/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.gamingrentalstore_assignment4.model;

/**
 *
 * @author Lisa
 */
public class PaymentType 
{
    private String paymentTypeID;
    private String paymentType;
    
       private PaymentType()
    {
        
    }
    
     private PaymentType(Builder builder)
   {
       paymentTypeID = builder.paymentTypeID;
       paymentType = builder.paymentType;
            
   }
    
    public static class Builder
  {
        private String paymentTypeID;
        private String paymentType;
        
        public Builder(String paymentTypeID) {
            this.paymentTypeID = paymentTypeID;
            
        }
        
         public Builder paymentType (String paymentType) 
        {
            this.paymentType = paymentType;
            
            return this;
                    
        }
         
          public PaymentType build(){
            return new PaymentType(this);
        }
    }
    
    public String getPaymentTypeID() {
        return paymentTypeID;
    }

    public String getPaymentType() 
    {
        return paymentType;
    }
    
     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PaymentType paymentType = (PaymentType) o;

        if (!paymentTypeID.equals(paymentType.paymentTypeID)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return paymentTypeID.hashCode();
    }
    
}
