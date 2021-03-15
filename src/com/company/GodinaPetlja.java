package com.company;

import java.util.Scanner;

public class GodinaPetlja {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        int pocetnaGodina=0;
        int krajnjuGodinu=0;
        int godina=0;

        do {
            System.out.println("Unesite pocetnu godinu:");
            pocetnaGodina = unos.nextInt();

            System.out.println("Unesite krajnju godinu:");
            krajnjuGodinu = unos.nextInt();

            godina= krajnjuGodinu-pocetnaGodina;
            System.out.println("Razmak medju godinama " + godina);
        }while (godina<10);



    }
}
