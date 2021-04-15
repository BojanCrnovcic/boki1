package NASLEDJIVANJE;

public class Nastavnik extends Osoba{

    private String predmet;
    private int brojCasova;

    public Nastavnik(String ime, String prezime, String predmet, int brojCasova) {
        super(ime,prezime);
        this.predmet = predmet;
        this.brojCasova = brojCasova;
    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public int getBrojCasova() {
        return brojCasova;
    }

    public void setBrojCasova(int brojCasova) {
        this.brojCasova = brojCasova;
    }

    @Override
    public String toString() {
        return "Predmet : " + predmet + '\'' +
                ", Broj Casova :" + brojCasova ;
    }
}
