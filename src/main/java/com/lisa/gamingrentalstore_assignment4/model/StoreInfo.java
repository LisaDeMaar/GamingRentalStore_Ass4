/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.gamingrentalstore_assignment4.model;

/**
 *
 * @author Lisa
 */
public class StoreInfo 
{
    private String storeName;
    private String receiptMessage;
    
    private StoreInfo()
    {
        
    }
    
     private StoreInfo(Builder builder)
   {
         storeName = builder.storeName;
         receiptMessage = builder.receiptMessage;
   }
    
    public static class Builder
  {
        private String storeName;
        private String receiptMessage;
        

        public Builder(String storeName) {
            this.storeName = storeName;
            
        }
        
         public Builder managerName(String receiptMessage) 
        {
            this.receiptMessage = receiptMessage;
            
            return this;
                    
        }
         
          public StoreInfo build(){
            return new StoreInfo(this);
        }
    }
    
    public String getStoreName() {
        return storeName;
    }

    public String getReceiptMessage() 
    {
        return receiptMessage;
    }
    
     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StoreInfo manager = (StoreInfo) o;

        if (!storeName.equals(manager.storeName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return storeName.hashCode();
    }
}
