package NASLEDJIVANJE;

public class Osoba {

    private String ime;
    private String prezime;
    private String datumRodjenja;
    private String pol;
    private double visina;
    private double tezina;

    public Osoba(String ime, String prezime) {

    }

    public Osoba(String ime, String prezime, String datumRodjenja, String pol, double visina, double tezina) {
        this.ime = ime;
        this.prezime = prezime;
        this.datumRodjenja = datumRodjenja;
        this.pol = pol;
        this.visina = visina;
        this.tezina = tezina;
    }




    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(String datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    public String getPol() {
        return pol;
    }

    public void setPol(String pol) {
        this.pol = pol;
    }

    public double getVisina() {
        return visina;
    }

    public void setVisina(double visina) {
        this.visina = visina;
    }

    public double getTezina() {
        return tezina;
    }

    public void setTezina(double tezina) {
        this.tezina = tezina;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "ime :'" + ime + '\'' +
                ", prezime :'" + prezime + '\'' +
                ", datumRodjenja :'" + datumRodjenja + '\'' +
                ", pol :'" + pol + '\'' +
                ", visina :" + visina +
                ", tezina :" + tezina +
                '}';
    }
}