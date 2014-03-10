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
public final class GamesComingSoon
{
    private String gameName;
    private String gameDescription;
    
     private GamesComingSoon()
    {
        
    }
    
     private GamesComingSoon(Builder builder)
   {
       gameName = builder.gameName;
       gameDescription = builder.gameDescription;
      
   }
    
    public static class Builder
  {
        private String gameName;
        private String gameDescription;
        

        public Builder(String gameName) {
            this.gameName = gameName;
            
        }
        
         public Builder gameDescription(String gameDescription) 
        {
            this.gameDescription = gameDescription;
            
            return this;
                    
        }
         
          public GamesComingSoon build(){
            return new GamesComingSoon(this);
        }
    }
    
    public String getGameName() {
        return gameName;
    }

    public String getGameDescription() 
    {
        return gameDescription;
    }
    
     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GamesComingSoon gamesComingSoon = (GamesComingSoon) o;

        if (!gameName.equals(gamesComingSoon.gameName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return gameName.hashCode();
    }
    
}
