package Petlje;

public class TabelaPetljaMetarMilja {
    public static void main(String[] args) {
        final double RAZLIKAUDUZINAMA =1.609;

        System.out.println("Milja                   Kilometar");

        for (int i =1;i<=10;i++){
            System.out.println(i+"                 "+(i*RAZLIKAUDUZINAMA));
        }

    }
}
