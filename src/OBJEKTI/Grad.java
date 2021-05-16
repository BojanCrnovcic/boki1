package OBJEKTI;

public class Grad {

    private String naziv;
    private int brojStanovnistva;

    public Grad() {

    }

    public Grad(String naziv, int brojStanovnistva) {
        this.naziv = naziv;
        this.brojStanovnistva = brojStanovnistva;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getBrojStanovnistva() {
        return brojStanovnistva;
    }

    public void setBrojStanovnistva(int brojStanovnistva) {
        this.brojStanovnistva = brojStanovnistva;
    }

    @Override
    public String toString() {
        return
                "Naziv :" + naziv + '\'' +
                ", BrojStanovnistva :" + brojStanovnistva;
    }
}
