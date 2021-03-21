package NIZOVI;

import java.util.Scanner;

public class CountOccurrenceOfNumbers7_3 {
    public static void main(String[] args) {
        int[] counts = new int[100];
        System.out.print("Unesite brojeve izmedju 1-100: ");
        count(counts);
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) System.out.println((i + 1) + " se ponavlja " + counts[i] + " puta ");
        }
    }

    public static void count(int[] counts) {
        Scanner input = new Scanner(System.in);
        int unos;
        do {
            unos = input.nextInt();
            if (unos >= 1 && unos <= 100)
                counts[unos - 1]++;
        } while (unos != 0);
    }
}


