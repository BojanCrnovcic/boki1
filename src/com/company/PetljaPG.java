package com.company;

import java.util.Scanner;

public class PetljaPG {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite pocetnu godinu: ");
        int pocetnaGodina = unos.nextInt();
        System.out.println("Unesite finalnu godinu: ");
        int finalnaGodina = unos.nextInt();
        int brojac =0;


        for (int godina = pocetnaGodina;godina<finalnaGodina;godina++){

            if (godina % 4 == 0 && godina % 100 != 0 || godina % 400 == 0){
                 brojac++;
                System.out.print(godina+" ");
            }
            if (brojac==10){
                System.out.println();
                brojac++;
            }



        }
    }

}
