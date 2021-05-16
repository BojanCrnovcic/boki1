package Lekcija11_IO;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ScannerReader {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get("scores.txt");
		Scanner input = new Scanner(path);

		while (input.hasNext()) {

			String firstName = input.next();
			String lastName = input.next();
			int score = input.nextInt();

			System.out.println(firstName + " " + lastName + " " + score);
		}

		input.close();

	}

}
