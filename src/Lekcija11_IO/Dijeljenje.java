package Lekcija11_IO;

import java.util.Scanner;

public class Dijeljenje {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Unesite dva cijela broja: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();

		System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));

		input.close();

	}

}
