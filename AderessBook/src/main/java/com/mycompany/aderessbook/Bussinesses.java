
package com.mycompany.aderessbook;

import java.util.ArrayList;

public class Bussinesses extends Data implements Compare {
    
    private String Title;
    private String Genre;
    private String Wibsite;
    private Person ContactPerson;
    
    ///getter

    public String getTitle() {
        return Title;
    }

    public String getGenre() {
        return Genre;
    }

    public String getWibsite() {
        return Wibsite;
    }

    public Person getContactPerson() {
        return ContactPerson;
    }
  
    //setter

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public void setGenre(String Genre) {
        this.Genre = Genre;
    }

    public void setWibsite(String Wibsite) {
         this.Wibsite = Wibsite;
    }

    public void setContactPerson(Person ContactPerson) {
         this.ContactPerson = ContactPerson;
    }
    
    @Override
    public boolean compareBy (String title) {
        return this.Title.toLowerCase().contains(title.toLowerCase()) ;
    }
    
    @Override
    public String getInfo(){

        return 
                "The Title is : " +
                this.Title + "The Genre: " +
                this.Genre + "The Wibsite : " + 
                this.Wibsite + "ContactPerson : " +
                this.ContactPerson + 
                '\n' +super.getInfo() ;

    }

}
