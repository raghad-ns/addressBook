/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aderessbook;

/**
 *
 * @author smart
 */
public class Person extends Data implements Compare {
    private String firstName;
    private String lastName ;
    private BirthDate bd;
    
    //getter
    
    public String getFirst() {
        return firstName;
    }
    
     public String getLast() {
        return lastName;
    }
     
     public BirthDate getBirthDate(){
        return bd;
    }
     
     public void setFirst(String firstName) {
            this.firstName = firstName;
      }
     
      public void setLast(String lastName) {
        this.lastName = lastName;
    }
    
    public void setBirthDate(BirthDate bd) {
        this.bd = bd;
    }
    
     @Override
    public boolean compareBy (String name) {
        
        boolean dual = false ;
        
        if (name.trim().contains(" ")) {
            
            String firstNameTest = name.substring(0, name.indexOf(' ')) ;
            String lastNameTest = name.substring(name.indexOf(' ')) ;
            
            dual = (
                this.firstName.toLowerCase().trim().contains(firstNameTest.toLowerCase()) || 
                this.lastName.toLowerCase().trim().contains(lastNameTest.toLowerCase())
                );
        }
        
        return (
            this.firstName.toLowerCase().trim().contains(name.toLowerCase()) || 
            this.lastName.toLowerCase().trim().contains(name.toLowerCase()) || 
            dual
            );
        
    }
    
    @Override
    public String getInfo() {
        return "Person Name : " + firstName + " " + lastName + '\n' 
                + bd.getInfo() + '\n' + super.getInfo() ;
    }
    
}
