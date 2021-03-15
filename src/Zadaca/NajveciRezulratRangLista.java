package Zadaca;

import java.util.Scanner;

public class NajveciRezulratRangLista {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite broj ucenika:");
        int brojUcenika = unos.nextInt();

        String prviUcenik = "";
        String drugiUcenik = "";
        String ucenik = "";
        double najboljaOcjena = 0, drugaNajbolja =0;
        double ocjena;

        System.out.println("Unesite ime ucenika: ");
        prviUcenik = unos.next();
        System.out.println("Unesite njegovu ojenu: ");
        najboljaOcjena = unos.nextDouble();

        while (brojUcenika>1) {
            System.out.println("Unesite ime ucenika: ");
            ucenik=unos.next();
            System.out.println("Unesite njegovu ocijenu: ");
            ocjena = unos.nextDouble();

            if (ocjena>najboljaOcjena){
                drugaNajbolja = najboljaOcjena;
                drugiUcenik = prviUcenik;
                najboljaOcjena=ocjena;
                prviUcenik = ucenik;
                brojUcenika--;
                continue;
            }
            if(ocjena < najboljaOcjena && ocjena > drugaNajbolja){
                ocjena = drugaNajbolja;
                ucenik = drugiUcenik;
            } brojUcenika--;
        }
        System.out.println("Rang lista:");
        System.out.println("Najbolji ucenik je: "+prviUcenik+" sa ocijenom: "+najboljaOcjena);
        System.out.println("Drugi najbolji ucenik je: "+drugiUcenik+" sa ocijenom: "+drugaNajbolja);
    }
}
