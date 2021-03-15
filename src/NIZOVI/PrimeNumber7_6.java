package NIZOVI;

import Metode.IsPrime6_10;

public class PrimeNumber7_6 {
    public static void main(String[] args) {

        int count = 0;
        int [] niz = PomocnaKlasa.unesiNiz(50);

        for (int i = 0; i<niz.length;i++){
            if (IsPrime6_10.isPrime(i)){
                count++;
                System.out.println("Prime number is: "+niz[i]);
            }
        }
    }
}
