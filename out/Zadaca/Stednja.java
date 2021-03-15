package com.company;

import java.util.Scanner;

public class Stednja {
    public static void main(String[] args){
        Scanner unos = new Scanner(System.in);
        System.out.println("Izracunajte kamatnu stopu:");;
        double kamata = unos.nextDouble();
        double mjesecJedan =  100 * (1 + 0.00417);
        double mjesecDva =  (100 + mjesecJedan) * (1 + 0.00417);
        double mjesecTri =  (100 + mjesecDva) * (1 + 0.00417);
        double mjesecCetiri =  (100 + mjesecTri) * (1 + 0.00417);
        double mjesecPet =  (100 + mjesecCetiri) * (1 + 0.00417);
        double mjesecSest =  (100 + mjesecPet) * (1 + 0.00417);

        double iznos = kamata + mjesecSest;
        System.out.println(iznos);
    }
}
