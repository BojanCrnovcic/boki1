package Petlje;

public class TabelaPetljeKGFunta {
    public static void main(String[] args) {
        final double RAZLIKAIZMEDJU = 2.2;
        System.out.println("kilogram            funta");

        for (int i = 1;i<=199;i++){
            System.out.println(i+ "                   "+(i*RAZLIKAIZMEDJU));
        }



    }
}