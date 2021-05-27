package EnumGenericsStrim;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DrugiZadatak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("unesi glavu ");
        String unos = input.next();
        unos = "M1";

        Map<Character,String> major = new HashMap<>();
        major.put('M',"Matematics");
        major.put('C',"Computer Science");
        major.put('I',"Information Technology");

        Map<Integer,String> status = new HashMap<>();
        status.put(1,"Freshman");
        status.put(2,"Sophomore");
        status.put(3,"Junior");
        status.put(4,"Senior");

        final String m = major.get('m');
        String stat = status.get(2);


        System.out.println(m+" "+stat);


    }
}
