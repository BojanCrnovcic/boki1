package Metode;

public class CountTheLettersInAString6_20 {


    public static int countLetters(String s) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                count++;
            }
        }
        System.out.print("" + count);
        return count;
    }
}
