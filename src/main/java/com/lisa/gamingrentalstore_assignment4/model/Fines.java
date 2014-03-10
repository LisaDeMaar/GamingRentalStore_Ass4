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
public final class Fines 
{
    private String fineID;
    private double fineAmount;
    
    private Fines()
    {
        
    }
    
    private Fines(Builder builder)
   {
       fineID = builder.fineID;
       fineAmount = builder.fineAmount;
          
   }
    
    public static class Builder
  {
        private String fineID;
        private double fineAmount;
        

        public Builder(String fineID) {
            this.fineID = fineID;
            
        }
        
         public Builder fineAmount(double fineAmount) 
        {
            this.fineAmount = fineAmount;
            
            return this;
                    
        }
         
          public Fines build(){
            return new Fines(this);
        }
    }
    
    public String getFineID() {
        return fineID;
    }

    public double getFineAmount() 
    {
        return fineAmount;
    }
    
     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fines fines = (Fines) o;

        if (!fineID.equals(fines.fineID)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return fineID.hashCode();
    }
}
