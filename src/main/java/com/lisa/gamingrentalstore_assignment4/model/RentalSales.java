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
public class RentalSales 
{
    private String rentalID;
    private Date rentalDate;
    private String rentalPeriod;
    private Date returnDate;
    private double rentalTotalPrice;
    private double amountRendered;
    private double change;
    private Cashier cashier;
    
    private RentalSales()
    {
    }
    
     private RentalSales(Builder builder)
        {
            rentalID = builder.rentalID;
            rentalDate = builder.rentalDate;
            rentalPeriod = builder.rentalPeriod;
            returnDate = builder.returnDate;
            rentalTotalPrice = builder.rentalTotalPrice;
            amountRendered = builder.amountRendered;
            change = builder.change;
            

        }
     
     public static class Builder
     {
        private String rentalID;
        private Date rentalDate;
        private String rentalPeriod;
        private Date returnDate;
        private double rentalTotalPrice;
        private double amountRendered;
        private double change;
        private Cashier cashier;
        
        public Builder(String rentalID)
        {
            this.rentalID = rentalID;
        }
        
         public Builder rentalDate(Date rentalDate)
        {
            this.rentalDate = rentalDate;
            return this;
        }
         
         public Builder rentalPeriod(String rentalPeriod)
         {
             this.rentalPeriod = rentalPeriod;
             return this;
         }
         public Builder returnDate(Date returnDate)
         {
             this.returnDate = returnDate;
             return this;
         }
         public Builder rentalTotalPrice(double rentalTotalPrice)
         {
             this.rentalTotalPrice = rentalTotalPrice;
             return this;
         }
         public Builder amountRendered(double amountRendered)
         {
             this.amountRendered = amountRendered;
             return this;
         }
         public Builder change(double change)
         {
             this.change = change;
             return this;
         }
         
         public Builder cashier(Cashier value)
         {
             cashier = value;
             return this;
         }
         
           
            public RentalSales build(){
            return new RentalSales(this);
        }
    }

    public String getRentalID() {
        return rentalID;
    }

    public Date getRentalDate() 
    {
        return rentalDate;
    }

    public String getRentalPeriod() {
        return rentalPeriod;
    }
    
     public Date getReturnDate() 
     {
        return returnDate;
    }
     
      public double getRentalTotalPrice() {
        return rentalTotalPrice;
    }
    public double getamountRendered() {
        return amountRendered;
    }
    public double getChange() {
        return change;
    }
     public Cashier getCashier() {
        return cashier;
    }
   
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RentalSales rentalSales = (RentalSales) o;

        if (!rentalSales.equals(rentalSales.rentalID)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return rentalID.hashCode();
    }
    
}
