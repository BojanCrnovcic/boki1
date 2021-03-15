package com.company;

import java.util.Scanner;

public class DanUsedmiciZeller {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.print("Unesite godinu: ");
        int godina = unos.nextInt();

        System.out.print("Unesite mjesec: 1-12: ");
        int mjesec = unos.nextInt();

        int m;
        if (mjesec == 1) {
            m = 13;
            godina -= 1;
        } else if (mjesec == 2) {
            m = 14;
            godina -= 1;
        } else {
            m = mjesec;

        }

        int k = godina % 100;
        int j = godina / 100;

        System.out.print("Unesite dan u mjesecu 1-31:");
        int q = unos.nextInt();
        int h = (q + ((26 * (m + 1)) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;

        String danUsedmici = "";

        switch (h) {
            case 0:
                danUsedmici += "Subota";
                break;
            case 1:
                danUsedmici += "Nedelja";
                break;
            case 2:
                danUsedmici += "Ponedeljak";
                break;
            case 3:
                danUsedmici += "Utorak";
                break;

            case 4:
                danUsedmici += "Sreda";
                break;

            case 5:
                danUsedmici += "Cetvrtak";
                break;

            case 6:
                danUsedmici += "Petak";
                break;
        }
        System.out.print("Dan u sedmici je " + danUsedmici);
    }
}
