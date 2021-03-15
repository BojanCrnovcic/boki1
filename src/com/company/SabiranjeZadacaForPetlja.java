package com.company;

import java.util.Scanner;

public class SabiranjeZadacaForPetlja {
    public static void main(String[] args) {
        int suma = 0;
        int broj = 0;
        while (broj < 20) {
            broj++;
            suma += broj;
            if (suma >= 100) {
                break;
            }
        }
        System.out.println("Broj je: " + broj);
        System.out.println("Suma je: " + suma);
    }

}

