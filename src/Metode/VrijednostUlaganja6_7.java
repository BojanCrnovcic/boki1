package Metode;

import java.util.Scanner;

public class VrijednostUlaganja6_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite iznos:");
        int iznos = scanner.nextInt();

        System.out.println("Unesite kamatu:");
        double godisnjakamata = scanner.nextInt();
        godisnjakamata /=100;
        double mijKamata = godisnjakamata/12;
        System.out.println("GODINA ----------------- PORAST USTEDE");
        for (int i = 1; i<=30; i++){
            System.out.println(i+"                       "+buduceUlaganje(iznos,mijKamata,i));


        }





    }
    public static double buduceUlaganje(double iznos, double kamatnastopa, int godina){
        return iznos * Math.pow(1+kamatnastopa,godina*12);
    }
}
        
        
