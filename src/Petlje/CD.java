package Petlje;

import java.util.Scanner;

public class CD {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite vrijednost:");
        double vrijednost = unos.nextDouble();

        System.out.println("Unesite rast:");
        double rast = unos.nextDouble();

        System.out.println( "Unesite mjesec:");
        double mjesec = unos.nextDouble();

        double KONACNAVREDNOST = vrijednost+vrijednost*rast/1200;
        System.out.println("mjesec            CD vrijednost");
        for (int i = 1; i <= mjesec; i++) {
            KONACNAVREDNOST += KONACNAVREDNOST * rast / 1200;
            System.out.println(i+"           "+KONACNAVREDNOST);

        }
    }
}
