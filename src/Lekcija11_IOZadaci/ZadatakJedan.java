package Lekcija11_IOZadaci;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ZadatakJedan {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("ZadatakJedan.txt");
        try {
            Scanner input = new Scanner(path);
            int suma = 0;
            double prosjek = 0;

            while (input.hasNext()) {


                suma += input.nextInt();
                prosjek = suma / input.nextInt();

            }
            System.out.println("Suma je :" + suma);
            System.out.println("Prosjek je :"+prosjek);
        } catch (Exception exception) {

        }
    }
}
