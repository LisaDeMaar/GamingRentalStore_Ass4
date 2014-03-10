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
public final class Cashier 
{
    private String cashierID;
    private String cashierName;
    private String cashierSurname;
    
    //private contructor
    private Cashier()
    {      
    }
    
    private Cashier(Builder builder)
    {
        cashierID = builder.cashierID;
        cashierName = builder.cashierName;
        cashierSurname = builder.cashierSurname;       
    }
    
    public static class Builder
    {
    private String cashierID;
    private String cashierName;
    private String cashierSurname;
    
        

        public Builder(String cashierID) {
            this.cashierID = cashierID;
        }

        public Builder cashierName(String cashierName)
        {
            this.cashierName = cashierName;
            return this;
        }

        public Builder cashierSurname (String cashierSurname){
            this.cashierSurname = cashierSurname;
            return this;
        }

        public Cashier build(){
            return new Cashier(this);
        }
    }
        
         public String getCashierID() {
        return cashierID;
    }

    public String getCashierName() 
    {
        return cashierName;
    }

    public String getCashierSurname() {
        return cashierSurname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cashier cashier = (Cashier) o;

        if (!cashierID.equals(cashier.cashierID)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return cashierID.hashCode();
    }
    
    
    
}
