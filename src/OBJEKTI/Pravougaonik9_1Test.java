package OBJEKTI;

public class Pravougaonik9_1Test {
    public static void main(String[] args) {

        Pravougaonik9_1 pravougaonik = new Pravougaonik9_1(4,40);
        System.out.println("Poluprecnik ima "+pravougaonik.vratiPovrsinu()+" povrsinu i "+pravougaonik.vratiPerimeter()+" perimeter");

        Pravougaonik9_1 pravougaonik1 = new Pravougaonik9_1(3.5,35.9);
        System.out.println("Poluprecnik ima "+pravougaonik1.vratiPovrsinu()+" povrsinu i "+pravougaonik1.vratiPerimeter()+" perimeter");
    }
    }

