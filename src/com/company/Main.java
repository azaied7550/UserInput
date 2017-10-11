package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner Keyboard = new Scanner(System.in);

        // Getting user input through keyboard
        System.out.println("Please Enter First Initial");
        String firstInitial = Keyboard.next();

        System.out.println("Please Enter Last Name");
        String lastName= Keyboard.next();

        System.out.println("Please Enter House Number");
        int houseNumber= Keyboard.nextInt();

        System.out.println("Please Enter Street Name");
        String streetName= Keyboard.next();

        System.out.println("Please Enter Street Type");
        String streetType= Keyboard.next();

        System.out.println("Please Enter City Name");
        String city= Keyboard.next();

        //Displaying Results
        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);
    }
}
