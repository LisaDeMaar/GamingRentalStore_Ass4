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
public final class Order 
{
    private String orderID;
    private Date orderDate;
    
     private Order()
    {
        
    }
    
     private Order(Builder builder)
   {
       orderID = builder.orderID;
       orderDate = builder.orderDate;
      
   }
    
    public static class Builder
  {
         private String orderID;
         private Date orderDate;

        public Builder(String orderID) {
            this.orderID = orderID;
            
        }
        
         public Builder orderDate(Date orderDate) 
        {
            this.orderDate = orderDate;
            
            return this;
                    
        }
         
          public Order build(){
            return new Order(this);
        }
    }
    
    public String getOrderID() {
        return orderID;
    }

    public Date getOrderDate() 
    {
        return orderDate;
    }
    
     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order review = (Order) o;

        if (!orderID.equals(review.orderID)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return orderID.hashCode();
    }
}
       