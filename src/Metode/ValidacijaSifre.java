package Metode;

public class ValidacijaSifre {

    public static boolean validiraj(String sifra){

        final int MINIMALNOKARAKTERA = 8;
        final int MINIMALNOBROJEVA = 2;

        if (sifra.length()<MINIMALNOKARAKTERA){
            System.out.println("Sifra je pogresna. Nema dovoljno karaktera.");
            return false; }

        if (!Character.isLetterOrDigit(sifra.length())) {
            System.out.println("Sifra je pogresna. Posjeduje nevazeci znak.");}


        for (int i = 0; i<sifra.length();i++) {

            char ch = sifra.charAt(i);



                if (Character.isDigit(MINIMALNOBROJEVA)){
                    System.out.println("Sifra je pogresna. Posjedujete nedovoljno brojeva.");
                } return false;

            }


        return true;

    }
}
