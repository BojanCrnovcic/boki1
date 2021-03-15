package com.company;

import NIZOVI.ZadatakNajmanjiElementUNizu;

import java.util.Scanner;

public class PZ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] najmanjiNiz = new int[10];

        System.out.println("Unesite 10 elemenata u niz: ");
        for (int i = 0; i<najmanjiNiz.length;i++){
            najmanjiNiz[i]= input.nextInt();
        }

        System.out.println("Najmanji index ovog niza je: "+ ZadatakNajmanjiElementUNizu.indexOfSmallestElement(najmanjiNiz));

    }
}










