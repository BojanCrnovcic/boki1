package BANKOMAT;

import java.util.ArrayList;

public class Account {

    private int brojRacuna;
    private String imeVlasnika;
    private double stanjeNaRacunu;
    private static ArrayList<Integer> brojevinaRacunu = new ArrayList<>();

    public Account() {

    }

    public Account(int brojRacuna, String imeVlasnika, double stanjeNaRacunu) {
        this.brojRacuna = brojRacuna;
        this.imeVlasnika = imeVlasnika;
        this.stanjeNaRacunu = stanjeNaRacunu;
    }

    public int getBrojRacuna() {
        return brojRacuna;
    }

    public void setBrojRacuna(int brojRacuna) {
        this.brojRacuna = brojRacuna;
        brojevinaRacunu.add(brojRacuna);
    }

    public String getImeVlasnika() {
        return imeVlasnika;
    }

    public void setImeVlasnika(String imeVlasnika) {
        this.imeVlasnika = imeVlasnika;
    }

    public double getStanjeNaRacunu() {
        return stanjeNaRacunu;
    }

    public void setStanjeNaRacunu(double stanjeNaRacunu) {
        this.stanjeNaRacunu = stanjeNaRacunu;
    }

    public boolean jednakBroj(int brojRacuna) {
        for (Integer val : brojevinaRacunu) {
            if (val == brojRacuna) {
                System.out.println("Broj ' " + val + " ' vec postoji. Pokusajte ponovo. ");
            }
        }
        return false;
    }

    public boolean jeNegativan(int brojRacuna) {
        if (brojRacuna < 0) {
            System.out.println("Nije dozvoljeno imati negativan broj racuna. Pokusajte ponovo.");
            return true;
        }
        return false;
    }

    public boolean jeNegativan(double stanjeNaRacunu) {
        if (stanjeNaRacunu < 0) {
            System.out.println("Nije dozvoljeno imati negativan iznos na racunu. Pokusajte ponovo.");
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return " Broj racuna: " + brojRacuna +
                " Ime Vlasnika: " + imeVlasnika + '\'' +
                " Stanje na racunu: " + stanjeNaRacunu
                ;
    }
}
