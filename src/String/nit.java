package String;

import java.util.Locale;
import java.util.Scanner;

public class nit {
    public static void main(String[] args) {

        Scanner unos = new Scanner(System.in);

        String korisnik = unos.next();

        switch (korisnik) {
            case "A": {
                System.out.println("5");
            }
            break;
            case "B": {
                System.out.println("4");
            }
            break;
            case "C": {
                System.out.println("3");
            }
            case "D": {
                System.out.println("2");
            }
            break;
            case "F": {
                System.out.println("1");
            }


        }
    }
}