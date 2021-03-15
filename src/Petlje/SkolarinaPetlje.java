package Petlje;

public class SkolarinaPetlje {
    public static void main(String[] args) {
        double skolarina = 10000;
        double kamata = 0.05;
        double total =0;

        for (double i = 1; i<=14; i++) {

            if (i ==10)
                skolarina+=kamata*skolarina;

            if (i>10)
                total+=skolarina;
            total++;

        }
        System.out.println("Cijena skolarine u desetoj godini je "+skolarina+" BAM.");
        System.out.println("Cijena skolarine u zadnje cetiri godine je "+total+" BAM.");
    }
}
