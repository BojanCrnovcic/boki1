package Metode;

public class IsPrime6_10 {

    public static boolean isPrime(int broj){

        for (int i = 2; i<broj;i++){
            if (broj%i==0){
                return false;
            }
        }

        return true;
    }
}
