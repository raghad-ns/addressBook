/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.aderessbook;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author smart
 */
public class AderessBook {

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        ArrayList<Bussinesses> bussinesses = new ArrayList<>();
        ArrayList<Data> searchResult = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.println("1. start 2. exit");
        int trigger = input.nextInt();
        while (trigger == 1) {
            System.out.println("1- Enter new adress . \n2- Search for some adress.");
            System.out.println("Enter your choice. ");
            int choice = input.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Do you want to add a (1. person or 2.bussiness)");
                    int type = input.nextInt();
                    if (type == 1) {
                        Person tempPerson = new Person();
                        System.out.println("Enter person's data");
                        System.out.println("Enter person's FirstName");
                        String personInfo = input.next();
                        tempPerson.setFirst(personInfo);
                        System.out.println("Enter person's LastName");
                        personInfo = input.next();
                        tempPerson.setLast(personInfo);
                        System.out.println("Enter person's City");
                        personInfo = input.next();
                        tempPerson.setCity(personInfo);
                        System.out.println("Enter person's Country");
                        personInfo = input.next();
                        tempPerson.setCountry(personInfo);
                        System.out.println("Enter person's Email");
                        personInfo = input.next();
                        tempPerson.setEmail(personInfo);
                        System.out.println("Enter person's Postal");
                        personInfo = input.next();
                        tempPerson.setPostal(personInfo);
                        System.out.println("Enter person's Telephone-Number");
                        personInfo = input.next();
                        tempPerson.setTelNum(personInfo);
                        System.out.println("Enter information for his birthdate");
                        System.out.println("Enter  day");
                        int day = input.nextInt();
                        System.out.println("Enter month");
                        int month = input.nextInt();
                        System.out.println("Enter year");
                        int year = input.nextInt();
                        BirthDate bd = new BirthDate(day, month, year);
                        tempPerson.setBirthDate(bd);
                        persons.add(tempPerson);

                    } else {
                        System.out.println("Let's go to Enter bussiness's data");
                        System.out.println(" Enter bussiness's Title");
                        String Title = input.next();
                        System.out.println(" Enter bussiness's Genre");
                        String Genre = input.next();
                        System.out.println(" Enter bussiness's Wibsite ");
                        String Wibsite = input.next();

                        System.out.println("Let's go to Enter person's data");
                        System.out.println(" Enter bussiness's firstName");
                        String firstName = input.next();
                        System.out.println(" Enter bussiness's lastName");
                        String lastName = input.next();

                        System.out.println("Enter information for his birthdate");
                        System.out.println("Enter  day");
                        int day = input.nextInt();
                        System.out.println("Enter month");
                        int month = input.nextInt();
                        System.out.println("Enter year");
                        int year = input.nextInt();
                        BirthDate bd = new BirthDate(day, month, year);

                        Person tempPerson = new Person(firstName, lastName, bd);

                        Bussinesses tempBussenis = new Bussinesses(Title, Genre, Wibsite, tempPerson);
                        bussinesses.add(tempBussenis);
                    }
                    break;
                }
            }

            String searchParam = input.next();
            searchParam = searchParam.toLowerCase();

            for (Person currentPerson : persons) {
                if (currentPerson.compareBy(searchParam)) {
                    searchResult.add(currentPerson);
                }
            }

            for (Bussinesses currentBussiness : bussinesses) {
                if (currentBussiness.compareBy(searchParam)) {
                    searchResult.add(currentBussiness);
                }
            }

            for (Data result : searchResult) {
                System.out.println(result.getInfo());
            }
        }
    }

}
