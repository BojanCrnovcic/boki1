package com.company;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Izracunajte vas BMI: ");

        System.out.println("Unesite vasu tezinu: ");
        double tezina = unos.nextDouble();
        System.out.println("Unesite vasu visinu: ");
        double visina = unos.nextDouble();

        double bmi = tezina / (visina * visina);

        if (bmi < 18.5){
            System.out.println("Pothranjenost!");
        }
        if (bmi >= 18.5 && bmi < 25.0){
            System.out.println("Normalan BMI.");
        }
        if (bmi >= 25.0 && bmi < 30.0){
            System.out.println("Gojaznost!");
        }
        if (bmi >= 30){
            System.out.println("Vi ste svinja!");
        }


    }
}
