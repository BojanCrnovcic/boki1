package Metode;

public class SansaZaPobjeduUCraps6_32 {
    public static void main(String[] args) {

        int brojacPobjeda = 0;

        for (int i = zavrtiKocku(); i<=10000; i++){
            ispisRezultata();
        }



    }


    public static void ispisRezultata() {
        int brojacPobjeda =0;
        if (pobjeda()) {
            System.out.println("POBJEDA");
            brojacPobjeda++;

        } else {
            System.out.println("PORAZ");
        }
    }

    private static boolean pobjeda() {
        int brojacPobjeda =0;
        int suma = sumaBacanja();
        if (suma == 2 || suma == 3 || suma == 12) {
            return false;
        }
        if (suma == 7 || suma == 11) {
            return true;
        }
        return true;
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



