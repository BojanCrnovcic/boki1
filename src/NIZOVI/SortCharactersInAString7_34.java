package NIZOVI;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SortCharactersInAString7_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite string:");

        String unos = input.nextLine();

        System.out.println("Vracanje stringa: "+sort(unos));
    }


    public static String sort(String s){
        char [] chars = s.toCharArray();
        for (int i = 0; i<chars.length; i++){
          Arrays.sort(chars);
        }

        return Arrays.toString(chars);
    }
}
