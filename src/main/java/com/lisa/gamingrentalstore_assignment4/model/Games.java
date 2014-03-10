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
public final class Games
{
    private String gameID;
    private String name;
    
    private Games()
    {
        
    }
    
     private Games(Builder builder)
   {
       gameID = builder.gameID;
       name = builder.name;
       
   }
    
    public static class Builder
  {
         private String gameID;
         private String name;
        

        public Builder(String gameID) {
            this.gameID = gameID;
            
        }
        
         public Builder name(String name) 
        {
            this.name = name;
            
            return this;
                    
        }
         
          public Games build(){
            return new Games(this);
        }
    }
    
    public String getGameID() {
        return gameID;
    }

    public String getName() 
    {
        return name;
    }
    
     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Games review = (Games) o;

        if (!gameID.equals(review.gameID)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return gameID.hashCode();
    }
    
}
