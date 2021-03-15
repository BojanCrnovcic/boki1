package com.company;

import java.util.Scanner;

public class PetljaPrestupnaGodina {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite pocetnu godinu?");
        int pocetnaGodina = 0;
        System.out.println("Uneiste finalnu godinu?");
        int finalnaGodina = 10;


        for (int godina = pocetnaGodina; godina < finalnaGodina; godina++) {

            System.out.println("Godina " + godina);
            if(godina % 4 == 0 || godina % 400 == 0 && godina % 100 != 0){}
        }
    }
}
