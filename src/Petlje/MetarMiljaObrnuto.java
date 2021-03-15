package Petlje;

public class MetarMiljaObrnuto {
    public static void main(String[] args) {
        final double RAZLIKA =1.609;
        System.out.println("milja          kilometar | kilometar          milja");

        for (int i= 1, j =20; i<=10 && j<=65; i++, j+=5){
            System.out.println(i+"                  "+(i*RAZLIKA)+" | "+j+"          "+(j/RAZLIKA));
        }
    }
}
