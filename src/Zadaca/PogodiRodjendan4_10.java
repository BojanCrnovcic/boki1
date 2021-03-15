package Zadaca;

import java.util.Scanner;

public class PogodiRodjendan4_10 {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);

        System.out.println("Da li je vas rodjendan :");
        String da = unos.next();
        char jes = da.charAt(1);
        System.out.println(jes + " Vas je rodjendan.");


        String ne = unos.next();
        char no = ne.charAt(0);
        System.out.println(no+ " Nije vas rodjendan");

    }
}
