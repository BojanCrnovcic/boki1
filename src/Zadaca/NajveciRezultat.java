package Zadaca;

import java.util.Scanner;

public class NajveciRezultat {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite broj ucenika:");
        int brojUcenika = unos.nextInt();
        int brojac=1;
        String imeUcenika = "";
        String imeNovogUcenika ="";
        double najboljaOcjena;
        double ocjena;

        System.out.println("Unesite ime ucenika:");
        imeUcenika = unos.next();

        System.out.println("Unesite ocijenu od ucenika:");
        najboljaOcjena = unos.nextDouble();

        while (brojUcenika>=brojac++){
            System.out.println("Unesite ime ucenika:");
            imeNovogUcenika = unos.next();
            System.out.println("Unesite ocijenu od ucenika:");
            ocjena = unos.nextDouble();

            if (ocjena>najboljaOcjena){
                najboljaOcjena = ocjena;
                imeUcenika = imeNovogUcenika;

            }

        }
        System.out.println("Najbolji ucenik je: "+imeUcenika+" sa ocijenom od :"+najboljaOcjena);
    }
}
