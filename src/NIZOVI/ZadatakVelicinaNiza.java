package NIZOVI;

import java.util.Scanner;

public class ZadatakVelicinaNiza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite niz");
        int velicniaNiza = scanner.nextInt();


        int[] niz = new int[velicniaNiza];

        System.out.println("Unesite vrijednost elementa u nizu");
        for (int i = 0; i < velicniaNiza; i++) {
            niz[i] = scanner.nextInt();


        }
        int index = 0;
        int max = niz[0];
        for (int i = 1; i < niz.length; i++) {
            if (niz[i] > max) {
                max = niz[i];
                index = i;
            }
        }

        System.out.println("Maximalna vrijednost " + max);
        System.out.println("Index se nalazi na " + index);


    }
}
