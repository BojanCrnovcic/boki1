package Metode;

public class GameCraps6_30 {
    public static void main(String[] args) {

        ispisRezultata();

    }


    public static void ispisRezultata() {
        if (pobjeda()) {
            System.out.println("POBJEDA");
        } else {
            System.out.println("PORAZ");
        }
    }

    private static boolean pobjeda() {
        int suma = sumaBacanja();
        if (suma == 2 || suma == 3 || suma == 12) {
            return false;
        }
        if (suma == 7 || suma == 11) {
            return true;
        }
        return nastaviBacanje(suma);
    }

    private static boolean nastaviBacanje(int point) {
        System.out.println("Point: " + point);
        while (true) {
            int suma = sumaBacanja();
            if (suma == 7) {
                return false;
            }
            if (suma == point) {
                return true;
            }
        }
    }


    private static int zavrtiKocku() {
        int rezultatBacnja = (int) (Math.random() * 6) + 1;
        return rezultatBacnja;
    }

    private static int sumaBacanja() {
        int prvoBacanje = zavrtiKocku();
        int drugoBacanje = zavrtiKocku();
        int rezultat = prvoBacanje + drugoBacanje;
        System.out.println("Suma bacanja: " + rezultat);
        return rezultat;
    }
}

