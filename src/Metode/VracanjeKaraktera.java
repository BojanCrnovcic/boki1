package Metode;

public class VracanjeKaraktera {
    public static void main(String[] args) {
        ispisKaraktera('a','u',4);
    }


    public static void ispisKaraktera (char pocetniKarakter, char zavrsnikarakter, int brojPoLiniji){
        int brojacu=0;
        for (char i = pocetniKarakter; i<zavrsnikarakter; i++){
            brojacu++;
            System.out.print(" "+ i);

            if (brojPoLiniji == brojacu){
                System.out.println();
                brojacu=0;
            }
        }
    }
}
