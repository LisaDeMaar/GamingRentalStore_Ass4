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
public final class GameCategory 
{
    private String gameCategoryID;
    private String categoryName;
    
    private GameCategory()
    {
        
    }
    
    private GameCategory(Builder builder)
   {
       gameCategoryID = builder.gameCategoryID;
       categoryName = builder.categoryName;
   }
    
    public static class Builder
  {
        private String gameCategoryID;
        private String categoryName;
        

        public Builder(String gameCategoryID) {
            this.gameCategoryID = gameCategoryID;
            
        }
        
         public Builder categoryName(String categoryName) 
        {
            this.categoryName = categoryName;
            
            return this;
                    
        }
         
          public GameCategory build(){
            return new GameCategory(this);
        }
    }
    
    public String getCategoryID() {
        return gameCategoryID;
    }

    public String getCategoryName() 
    {
        return categoryName;
    }
    
     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GameCategory category = (GameCategory) o;

        if (!gameCategoryID.equals(category.gameCategoryID)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return gameCategoryID.hashCode();
    }
}
