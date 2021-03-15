package com.company;

import java.util.Scanner;

public class OcjenePonovo {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite broj bodova:");
        int bodovi = unos.nextInt();

        if (bodovi > 90){
            System.out.println("Ocjena je 10");
        }
        if (bodovi >= 80 && bodovi <90){
            System.out.println("Ocjena je 9");
        }
        if (bodovi >= 70 && bodovi <80){
            System.out.println("Ocjena je 8");
        }
        if (bodovi >= 60 && bodovi <70){
            System.out.println("Ocjena je 7");
        }
        if (bodovi >= 50 && bodovi <60){
            System.out.println("Ocjena je 6");
        }
        if (bodovi < 50){
            System.out.println("bruko... ");
        }
    }

}
