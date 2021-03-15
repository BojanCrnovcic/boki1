package Metode;

import java.util.Scanner;

public class MetodaOcjene {
    public static void main(String[] args) {
ispisOcjene(15.9);
ispisOcjene(55.7);
    }

    public static void ispisOcjene(double bodovi) {
        if (bodovi > 90) {
            System.out.println("Ocjena je 10");
        } else if (bodovi >= 80) {
            System.out.println("Ocjena je 9");
        } else if (bodovi >= 70) {
            System.out.println("Ocjena je 8");
        } else if (bodovi >= 60) {
            System.out.println("Ocjena je 7");
        } else if (bodovi >= 50) {
            System.out.println("Ocjena je 6");
        } else {
            System.out.println("Da li te je sramota ??? ");
        }


    }


}
