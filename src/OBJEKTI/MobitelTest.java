package OBJEKTI;

public class MobitelTest {
    public static void main(String[] args) {

        Mobitel mobitel = new Mobitel();

        mobitel.setBrand("Samsung");
        mobitel.setModel("A7");
        mobitel.setGodinaProizvodnje(2018);


        System.out.println("Brend mobitela: "+mobitel.getBrend());
        System.out.println("Model mobitela: "+mobitel.getModel());
        System.out.println("Godina proizvodnje: "+mobitel.getGodinaProizvodnje());


    }
}