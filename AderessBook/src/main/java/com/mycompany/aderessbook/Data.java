
package com.mycompany.aderessbook;

public class Data {
    private String country ;
    private String city ;
    private String postal ;
    private String email ;
    private String telNum ;

    Data () {
    // intialize
    }
    Data (String countrt , String city , String email , String postsal , String telNum) {
        this.country = countrt ;
        this.city = city ;
        this.email = email ;
        this.postal = postsal ;
        this.telNum = telNum ;
    }
    public String getCoutry () {
        return this.country ;
    }
    public String getCity () {
        return this.city ;
    }
    public String getEmail () {
        return this.email ;
    }
    public String getPostal () {
        return this.postal ;
    }
    public String getTelNum  () {
        return this.telNum ;
    }
    
    public void setCity(String city) {
       this.city = city;
    }
    
    public void setCountry(String country) {
       this.country = country;
    }
    public void setEmail(String email) {
       this.email = email;
    }
    
    public void setPostal(String postal) {
       this.postal = postal;
    }
    
    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    //must be completed as soon as posible

    public String getInfo () {
        return ("email : " +  this.email + " telephone number: " + this.telNum + "country : " + this.country + " city : " + this.city + " postal code: " + this.postal + '\n') ;
    }
}
