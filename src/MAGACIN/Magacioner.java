package MAGACIN;

import java.util.ArrayList;

public class Magacioner {

    private String ime;
    private ArrayList<Artikl> listaZaduzenihArtikala;

    public Magacioner(String ime) {
        this.ime = ime;
        listaZaduzenihArtikala= new ArrayList<>();
    }    public Magacioner() {
        listaZaduzenihArtikala= new ArrayList<>();
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public ArrayList<Artikl> getListaZaduzenihArtikala() {
        return listaZaduzenihArtikala;
    }

    public void setListaZaduzenihArtikala(ArrayList<Artikl> listaZaduzenihArtikala) {
        this.listaZaduzenihArtikala = listaZaduzenihArtikala;
    }

    @Override
    public String toString() {
        return "Magacioner{" +
                "ime='" + ime + '\'' +
                ", listaZaduzenihArtikala=" + listaZaduzenihArtikala +
                '}';
    }
}