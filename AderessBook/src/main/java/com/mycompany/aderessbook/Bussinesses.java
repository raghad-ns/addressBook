
package com.mycompany.aderessbook;


public class Bussinesses extends Data implements Compare {
    
    private String Title;
    private String Genre;
    private String Wibsite;
    private Person ContactPerson;

    public Bussinesses(String Title, String Genre, String Wibsite, Person ContactPerson, String country, String city, String email, String postsal, String telNum) {
        super(country, city, email, postsal, telNum);
        this.Title = Title;
        this.Genre = Genre;
        this.Wibsite = Wibsite;
        this.ContactPerson = ContactPerson;
    }
    
    ///getter
   
    public Bussinesses( ) {
    }

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
        return (this.Title.toLowerCase().startsWith(title.toLowerCase()) || ContactPerson.compareBy(title)) ;
    }
    
    @Override
    public String getInfo(){

        return 
                "Bussiness Information : \nThe Title is : " +
                this.Title + "\nThe Genre: " +
                this.Genre + "\nThe Wibsite : " + 
                this.Wibsite + "\nContact " +
                this.ContactPerson.getInfo() + 
                super.getInfo();

    }
    @Override
    public String fileFormat() {
        return  this.Title + ":" +
                this.Genre + ":" + 
                this.Wibsite + ":" +
                this.ContactPerson.fileFormat() + ":" +
                super.fileFormat();
    }

}
