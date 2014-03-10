/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.gamingrentalstore_assignment4.model;

import java.util.Date;

/**
 *
 * @author Lisa
 */
public final class Demographic 
{
    private String gender;
    private String age;
    private Date dob;
    
    private Demographic()
    {
        
    }
    
    private Demographic(Builder builder)
   {
      gender = builder.gender;
      age = builder.age;
      dob = builder.dob;
   }
    
    
  public static class Builder
  {
        private String gender;
        private String age;
        private Date dob;
        

        public Builder(String gender) {
            this.gender = gender;
            
        }
        
         public Builder age(String age) 
        {
            this.age = age;
            
            return this;
                    
        }
            
         
          public Builder dob(Date dob) {
            this.dob = dob;
            
            return this;
          }

       

        public Demographic build(){
            return new Demographic(this);
        }
    }
  
   public String getGender() {
        return gender;
    }

    public String getAge() 
    {
        return age;
    }
    
     public Date getDob() 
    {
        return dob;
    }

   

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Demographic demographic = (Demographic) o;

        if (!gender.equals(demographic.gender)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return gender.hashCode();
    }
    
    
}
