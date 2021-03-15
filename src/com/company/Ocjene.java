package com.company;

import java.util.Scanner;

public class Ocjene {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite broj bodva:");
        int bodovi = unos.nextInt();

        if (bodovi>90){
            System.out.println("Ocjena je 10");
        }
        else if (bodovi >= 80 ){
            System.out.println("Ocjena je 9");
        }
        else if (bodovi >= 70 ){
            System.out.println("Ocjena je 8");
        }
        else if (bodovi >= 60 ){
            System.out.println("Ocjena je 7");
        }
        else if (bodovi >= 50 ){
            System.out.println("Ocjena je 6");
        }
        else {
            System.out.println("Da li te je sramota ??? ");
        }

    }
}
