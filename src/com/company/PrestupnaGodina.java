package com.company;

import java.util.Scanner;

public class PrestupnaGodina {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Provjerite da li je godina prestupna:");
        int godina = unos.nextInt();

        if (godina % 4 == 0 || godina % 400 == 0 && godina % 100 != 0){
            System.out.println(godina +" godina je prestupna!!");
        }
        else System.out.println(godina + " godina nije prestupna");


    }
}
