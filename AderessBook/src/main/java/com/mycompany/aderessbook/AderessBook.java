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
                        System.out.println("Enter person's data");
                        Person tempPerson = new Person();

                    } else {
                        System.out.println("Enter bussiness's data");
                        Bussinesses tempBussenis = new Bussinesses();
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
