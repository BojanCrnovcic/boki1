package NASLEDJIVANJE;

import java.util.Scanner;

public class AnimalTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Animal animal = new Animal();

        System.out.println("Unesite ( 1 ) za psa ili ( 2 ) za macku: ");

        int unos = input.nextInt();

        if (unos == 1){
            animal = new Pas();
        }
        else if (unos == 2){
            animal = new Macka();
        }
        else animal = new Animal();

        animal.hrana();
        animal.buka();
    }
}
