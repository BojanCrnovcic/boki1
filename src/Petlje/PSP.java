package Petlje;

public class PSP {
    public static void main(String[] args) {
        double skolarina = 5000;
        double POVECAVANJE =1.07;
        double duplaSkolarina =10000;
        int godina=0;

        while (skolarina<duplaSkolarina){

            skolarina*=POVECAVANJE;
            godina++;

        }
        System.out.println("Potrebno je "+godina+" godina.");

    }
}
