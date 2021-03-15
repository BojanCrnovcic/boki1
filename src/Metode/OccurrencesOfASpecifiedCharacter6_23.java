package Metode;

public class OccurrencesOfASpecifiedCharacter6_23 {


    public static int count(String str, char a) {
        int brojac = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                brojac++;
                System.out.print("" + a);
            }
        }

        return brojac;
    }
}
