package NASLEDJIVANJE;

public class Macka extends Animal{

    public Macka() {

    }

    @Override
    public void hrana() {
        System.out.println("Macija hrana");
    }

    @Override
    public void buka() {
        System.out.println("Macija buka");
    }
}
