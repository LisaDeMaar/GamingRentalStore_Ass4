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
public final class GameReview 
{
    private String description;
    private String rating;
    
    private GameReview()
    {
        
    }
    
     private GameReview(Builder builder)
   {
       description = builder.description;
       rating = builder.rating;
   }
    
    public static class Builder
  {
        private String description;
        private String rating;
        

        public Builder(String description) {
            this.description = description;
            
        }
        
         public Builder categoryName(String rating) 
        {
            this.rating = rating;
            
            return this;
                    
        }
         
          public GameReview build(){
            return new GameReview(this);
        }
    }
    
    public String getDescription() {
        return description;
    }

    public String getRating() 
    {
        return rating;
    }
    
     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GameReview review = (GameReview) o;

        if (!description.equals(review.description)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return description.hashCode();
    }
           
}
