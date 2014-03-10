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
public final class Inventory 
{
    private String inventoryID;
    private int totalGames;
    private int gamesOut;
    private int gamesIn;
    
     private Inventory()
    {
        
    }
    
     private Inventory(Builder builder)
   {
       inventoryID = builder.inventoryID;
       totalGames = builder.totalGames;
       gamesIn = builder.gamesIn;
       gamesOut = builder.gamesOut;
   }
    
    public static class Builder
  {
        private String inventoryID;
        private int totalGames;
        private int gamesOut;
        private int gamesIn;
        

        public Builder(int totalGames) {
            this.totalGames = totalGames;
            
        }
        
         public Builder gamesOut(int gamesOut) 
        {
            this.gamesOut = gamesOut;
            
            return this;
                    
        }
         
         public Builder gamesIn(int gamesIn) 
        {
            this.gamesIn = gamesIn;
            
            return this;
                    
        }
         
          public Builder inventoryID(String inventoryID) 
        {
            this.inventoryID = inventoryID;
            
            return this;
                    
        }
         
          public Inventory build(){
            return new Inventory(this);
        }
    }
    
    public int getTotalGames() {
        return totalGames;
    }

    public int getGamesIn() 
    {
        return gamesIn;
    }
    
    public int getGamesOut() 
    {
        return gamesOut;
    }
    
     public String getInventoryID() 
    {
        return inventoryID;
    }
    
     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Inventory inventory = (Inventory) o;

        if (!inventoryID.equals(inventory.inventoryID)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return inventoryID.hashCode();
    }
    
}
