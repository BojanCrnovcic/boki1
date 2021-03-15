package com.company;

import java.util.Scanner;

public class Operater {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Da li je broj dijeljiv sa 2 i 3:");
        int broj = unos.nextInt();

        if (broj % 2 == 0 && broj % 3 == 0){
            System.out.println("Broj " + broj + " je djeljiv sa 2 i sa 3 ");
        }
        if (broj % 2 == 0 || broj % 3 == 0){
            System.out.println("Broj " + broj + " je djeljiv sa 2 ili sa 3");
        }
        if (broj % 2 == 0 ^ broj % 3 == 0){
            System.out.println("Broj " + broj + "je djeljiv ili sa 2 ili 3 ali ne oba broja");

        }
    }
}
