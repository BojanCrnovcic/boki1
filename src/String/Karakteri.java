package String;

import java.util.Scanner;

public class Karakteri {
    public static void main(String[] args) {

        Scanner unos = new Scanner(System.in);

        String poruka = unos.nextLine();
        System.out.println(""+poruka.length());
        System.out.println(""+poruka.charAt(0));

    }
}
