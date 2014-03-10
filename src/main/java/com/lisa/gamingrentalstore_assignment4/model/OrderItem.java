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
public class OrderItem 
{
    private String id;
    private int quantity;
    
      private OrderItem()
    {
        
    }
    
     private OrderItem(Builder builder)
   {
      id = builder.id;
      quantity = builder.quantity;       
      
   }
    
    public static class Builder
  {
        private String id;
        private int quantity;
        
        public Builder(String id) {
            this.id = id;
            
        }
        
         public Builder quantity(int quantity) 
        {
            this.quantity = quantity;
            
            return this;
                    
        }
         
          public OrderItem build(){
            return new OrderItem(this);
        }
    }
    
    public String getId() {
        return id;
    }

    public int getQuantity() 
    {
        return quantity;
    }
    
     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderItem review = (OrderItem) o;

        if (!id.equals(review.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
