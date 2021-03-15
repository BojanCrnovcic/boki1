package Petlje;

public class KilogramFuntaObrnuto {
    public static void main(String[] args) {
        final double RAZLIKA = 2.2;
        System.out.println("kilogram          funta | funta          kilogram");

        for (int i = 1, j =20; i <= 199 && j <=515; i++, j+=5){
            System.out.println(i+"          "+(i*RAZLIKA)+" | "+j+"          "+(j/RAZLIKA));

        }
    }
}
