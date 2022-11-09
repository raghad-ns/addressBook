package com.mycompany.aderessbook;

// import java.util.Date;
// import java.time.Month;
// import java.text.ParseException;
import java.time.LocalDate;

public class BirthDate {
    private int day;
    private int month;
    private int year;
    String[] arr = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sep", "Oct", "Nov", "Dec" };
    int md[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public BirthDate(int day ,int month, int year){
        this.day =day;
        this.month =month;
        this .year = year;

    }

    //// getters

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    //// setters
    public void setDay(int day) {
        if (day < 1 || day > 31)
            System.out.println("Invalid Input");   
        else
            this.day = day;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12)
        System.out.println("Invalid Input");  
        else
            this.month = month;
    }

    public void setYear(int year) {
        if (year > 2022)
        System.out.println("Invalid Input");  
            
        else
            this.year = year;
    }

    //// getinfo
    public String getInfo() {
  
              String date = "{ " + arr[month - 1] + " " + day + " , "  + year + "}";
              return date;
        
      
    }

    ////// getAge
    public String  getAge() {
        LocalDate currentDate = java.time.LocalDate.now();
        // Get day from date
        int curday = currentDate.getDayOfMonth();

        // Get month from date
        int curmonth = currentDate.getMonthValue();

        // Get year from date
        int curyear = currentDate.getYear();

        int PersonYear = curyear - this.year;
        int PersonMonth;
        int PersonDay;
        if (curmonth < this.month) {
            PersonYear--;
            PersonMonth = 12 - (curmonth - month);
        } 
        else {
            PersonMonth = (curmonth - month);
        }
        if (curday < this.day) {
            PersonMonth--;
            PersonDay = md[curmonth - 1] - (curday - this.day);
        } 
        else {
            PersonDay = curday - this.day;
        }
       
 
            String age = "The Age: "+PersonYear+"year  "+PersonMonth+ " month  "+PersonDay+" day \n "; 
            return (age);
        
    }
}
