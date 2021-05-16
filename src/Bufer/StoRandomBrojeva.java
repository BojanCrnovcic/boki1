package Bufer;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class StoRandomBrojeva {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("100brojeva.txt");

        for (int i = 0; i < 100; i++) {

        }

        if (!Files.exists(path)) {
            Files.createFile(path);
        }

        BufferedWriter buffer = Files.newBufferedWriter(path);
        int radnom = 0;
        for (int i = 0; i < 100; i++) {
            radnom = (int) (Math.random() * 100);
            buffer.write(" " + radnom);


        }

        buffer.close();
        ArrayList<Integer> procitaniBrojeviIzFajla = new ArrayList<>();
        Scanner scanner = new Scanner(path);
        while (scanner.hasNext()) {
            procitaniBrojeviIzFajla.add(scanner.nextInt());

        }
        Collections.sort(procitaniBrojeviIzFajla);
        System.out.println(procitaniBrojeviIzFajla);
    }
}
