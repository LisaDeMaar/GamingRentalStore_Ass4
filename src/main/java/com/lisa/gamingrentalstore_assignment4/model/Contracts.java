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
public final class Contracts 
{
    private String contractCode;
    private String contractName;
    private String contractLength;
    private String contractType;
    private double contractPrice;
    
    private Contracts()
    {
        
    }
    
    private Contracts(Builder builder)
    {
        contractCode = builder.contractCode;
        contractName = builder.contractName;
        contractLength = builder.contractLength;
        contractType = builder.contractType;
        contractPrice = builder.contractPrice;
    }
    
    public static class Builder{
        
        private String contractCode;
        private String contractName;
        private String contractLength;
        private String contractType;
        private double contractPrice;
        

        public Builder(String contractCode) {
            this.contractCode = contractCode;
        }

        public Builder contractName(String contractName)
        {
            this.contractName = contractName;
            return this;
        }

        
        public Builder contractLength(String contractLength)
        {
            this.contractLength = contractLength;
            return this;
        }
        
          public Builder contractType(String contractType)
        {
            this.contractType = contractType;
            return this;
        }
          
           public Builder contractPrice(double contracPrice)
        {
            this.contractType = contractType;
            return this;
        }
        public Contracts build(){
            return new Contracts(this);
        }
    }
    
     public String getContractCode() {
        return contractCode;
    }
     
     public String getContractName() {
        return contractName;
    }
     
     public String getContractLength() 
     {
        return contractLength;
    }
     
     public String getContractType() {
        return contractType;
    }
     
     public double getContractPrice() {
        return contractPrice;
    }
     
      @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contracts contract = (Contracts) o;

        if (!contractCode.equals(contract.contractCode)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return contractCode.hashCode();
    }
    
    
}
