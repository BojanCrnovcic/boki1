package Zadaca;

import java.util.Scanner;

public class ASCIIkod4_08 {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);

        System.out.println("Unesite ASCII kod:");

        int upis = unos.nextInt();

        char ispis = (char) upis;

        System.out.println("Simbol za ASCII kod "+upis+ " je "+ispis);
    }
}
