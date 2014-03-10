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
public class Users 
{
    private String username;
    private String password;
    
      private Users()
    {
        
    }
    
     private Users(Builder builder)
   {
         username = builder.username;
         password = builder.password;
   }
    
    public static class Builder
  {
        private String username;
        private String password;
        

        public Builder(String username) {
            this.username = username;
            
        }
        
         public Builder password(String password) 
        {
            this.password = password;
            
            return this;
                    
        }
         
          public Users build(){
            return new Users(this);
        }
    }
    
    public String getUsername() {
        return username;
    }

    public String getPassword() 
    {
        return password;
    }
    
     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Users user = (Users) o;

        if (!username.equals(user.username)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return username.hashCode();
    }
}
