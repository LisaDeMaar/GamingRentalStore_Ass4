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
public final class Manager 
{
    private String managerID;
    private String managerName;
    
     private Manager()
    {
        
    }
    
     private Manager(Builder builder)
   {
           managerID = builder.managerID;
           managerName = builder.managerName;
   }
    
    public static class Builder
  {
         private String managerID;
        private String managerName;
        

        public Builder(String managerID) {
            this.managerID = managerID;
            
        }
        
         public Builder managerName(String managerName) 
        {
            this.managerName = managerName;
            
            return this;
                    
        }
         
          public Manager build(){
            return new Manager(this);
        }
    }
    
    public String getManagerID() {
        return managerID;
    }

    public String getManagerName() 
    {
        return managerName;
    }
    
     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Manager manager = (Manager) o;

        if (!managerID.equals(manager.managerID)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return managerID.hashCode();
    }
}
