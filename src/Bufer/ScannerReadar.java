package Bufer;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ScannerReadar {
    public static void main(String[] args) throws IOException {

        Path putanjadoFjala = Paths.get("suma.txt");
        try {
            Scanner input = new Scanner(putanjadoFjala);

            ArrayList<Integer> broj = new ArrayList<>();
            int suma = 0;
            int prosjek = 0;

            while (input.hasNext()) {

                suma += input.nextInt();

                suma = prosjek/ input.nextInt();

                System.out.println("Suma je : "+suma);
            }
        } catch (Exception exception) {
            System.out.println("Pogresan fajl");
        }
    }
}

