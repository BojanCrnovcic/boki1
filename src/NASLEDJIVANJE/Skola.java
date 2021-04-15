package NASLEDJIVANJE;

public class Skola {
    public static void main(String[] args) {

        Nastavnik nastavnik1 = new Nastavnik("Jovo","Simic","Francuski",40);
        Nastavnik nastavnik2 = new Nastavnik("Pero","Peric","Matematika",40);

        nastavnik1.setIme("Jovo");
        nastavnik1.setPrezime("jOVIC");
        System.out.println("Ime: "+nastavnik1.getIme()+"; Prezime: "+nastavnik1.getPrezime()+"; "+nastavnik1.toString());


    }
}
