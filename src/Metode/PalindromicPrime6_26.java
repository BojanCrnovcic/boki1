package Metode;

public class PalindromicPrime6_26 {
    public static void main(String[] args) {
        int broj = 2;
        int count = 1;

        do {
            if (isPrime(broj) && palindrom(broj)) {
                System.out.print(" " + broj);
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
            broj++;


        } while (count <= 100);

    }


    private static boolean palindrom(int broj) {
        int obrnutiBroj = 0;
        int zamjenaBroj = broj;
        while (broj > 0) {
            int zadnjiBroj = broj % 10;
            obrnutiBroj *= 10;
            broj /= 10;
            obrnutiBroj += zadnjiBroj;
        }
        return obrnutiBroj == zamjenaBroj;

    }

    private static boolean isPrime(int broj) {

        for (int i = 2; i < broj; i++) {
            if (broj % i == 0) {
                return false;
            }
        }

        return true;
    }
}
