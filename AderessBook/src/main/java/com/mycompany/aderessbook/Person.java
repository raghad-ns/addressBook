/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aderessbook;

/**
 *
 * @author smart
 */
public class Person extends Data {
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
    public String getInfo() {
        return "Person Name : " + firstName + " " + lastName + '\n' 
                + bd.getInfo() + '\n' + super.getInfo() ;
    }
    
}
