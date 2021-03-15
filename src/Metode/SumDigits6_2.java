package Metode;

public class SumDigits6_2 {
    public static void main(String[] args) {
        int suma = sumDigits(6548);
        System.out.println(" "+suma);
    }

    public static int sumDigits(long n){
        long suma =0;
        while (n>0){
            long poslednjaCifra = n%10;
            suma += poslednjaCifra;
            n = n/10;
        }

        return (int)suma;
    }
}
