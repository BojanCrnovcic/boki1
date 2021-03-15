package NIZOVI;

import java.util.Random;
import java.util.Scanner;

public class UnesiVelicinuNiza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite niz:");
        int duzinaNiza = scanner.nextInt();

        int[] nizBrojeva = new int[duzinaNiza];
        System.out.println("Niz nesumicnih brojeva:");
        for (int i = 0; i < nizBrojeva.length; i++) {
            nizBrojeva[i] =(int) Math.random();

            System.out.print(i+", ");
        }

    }
}

