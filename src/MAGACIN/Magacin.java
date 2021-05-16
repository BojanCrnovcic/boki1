package MAGACIN;

import java.util.ArrayList;

public class Magacin extends Artikl {

    private ArrayList<Magacioner>magaciioneri;
    private ArrayList<Otpremnica>otpremnice;
    private ArrayList<Artikl>artikli;
    private double kapacitetMagacina;

    public Magacin() {

    }

    public Magacin(ArrayList<Magacioner> magaciioneri, ArrayList<Otpremnica> otpremnice, ArrayList<Artikl> artikli, double kapacitetMagacina) {
        this.magaciioneri = magaciioneri;
        this.otpremnice = otpremnice;
        this.artikli = artikli;
        this.kapacitetMagacina = kapacitetMagacina;
    }

    public ArrayList<Magacioner> getMagaciioneri() {
        return magaciioneri;
    }

    public void setMagaciioneri(ArrayList<Magacioner> magaciioneri) {
        this.magaciioneri = magaciioneri;
    }

    public ArrayList<Otpremnica> getOtpremnice() {
        return otpremnice;
    }

    public void setOtpremnice(ArrayList<Otpremnica> otpremnice) {
        this.otpremnice = otpremnice;
    }

    public ArrayList<Artikl> getArtikli() {
        return artikli;
    }

    public void setArtikli(ArrayList<Artikl> artikli) {
        this.artikli = artikli;
    }

    public double getKapacitetMagacina() {

        double kapMag = 100 - getZauzetiProstor();

        return kapMag;
    }

    public void setKapacitetMagacina(double kapacitetMagacina) {
        this.kapacitetMagacina = kapacitetMagacina;
    }

    @Override
    public String toString() {
        return "Magacin{" +
                "magaciioneri=" + magaciioneri +
                ", otpremnice=" + otpremnice +
                ", artikli=" + artikli +
                ", kapacitetMagacina=" + kapacitetMagacina +
                '}';
    }
}
