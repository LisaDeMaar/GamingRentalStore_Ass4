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
public final class CustomerDetails 
{
    private String customerName;
    private String customerSurname;
    private String telephoneNumber;
    private String cellNumber;
    private String postalAddress;
    Demographic demographic;
    
    private CustomerDetails()
    {
    }
    
     private CustomerDetails(Builder builder)
   {
       customerName = builder.customerName;
       customerSurname = builder.customerSurname;
       telephoneNumber = builder.telephoneNumber;
       cellNumber = builder.cellNumber;
       postalAddress = builder.postalAddress;
               
   }
     
     public static class Builder
     {
        private String customerName;
        private String customerSurname;
        private String telephoneNumber;
        private String cellNumber;
        private String postalAddress; 
        Demographic demographic;
        
        public Builder(String customerName)
        {
            this.customerName = customerName;
        }
        
         public Builder customerSrname(String customerSurname)
        {
            this.customerSurname = customerSurname;
            return this;
        }
         
         public Builder telephoneNumber(String telephoneNumber)
         {
             this.telephoneNumber = telephoneNumber;
             return this;
         }
         public Builder cellNumber(String cellNumber)
         {
             this.cellNumber = cellNumber;
             return this;
         }
         
           public Builder postalAddress(String postalAddress)
         {
             this.postalAddress = postalAddress;
             return this;
         }
           
             public Builder demographic(Demographic demographic)
         {
             this.postalAddress = postalAddress;
             return this;
         }
           
            public CustomerDetails build(){
            return new CustomerDetails(this);
        }
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerSurname() 
    {
        return customerSurname;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }
    
     public String getCellNumber() {
        return cellNumber;
    }
     
      public String getPostalAddress() {
        return postalAddress;
    }
      
     public Demographic getDemographic()
     {
         return demographic;
     }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomerDetails customerDetails = (CustomerDetails) o;

        if (!customerName.equals(customerDetails.customerName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return customerName.hashCode();
    }
         
     }
    
    

