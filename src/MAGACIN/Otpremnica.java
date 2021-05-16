package MAGACIN;

import java.util.ArrayList;

public class Otpremnica {

    private int idOtpremnice;
    private String kupac;
    private String preuzimac;
    private String imeMagacionera;
    private ArrayList<Artikl> listaArtikla;
    private double zauzetiProstor;

    public Otpremnica(int idOtpremnice, String kupac, String preuzimac, double zauzetiProstor, String imeMagacionera) {
        this.idOtpremnice = idOtpremnice;
        this.kupac = kupac;
        this.preuzimac = preuzimac;
        imeMagacionera = imeMagacionera;
        listaArtikla = new ArrayList<>();
        this.zauzetiProstor = zauzetiProstor;
    }

    public int getIdOtpremnice() {
        return idOtpremnice;
    }

    public void setIdOtpremnice(int idOtpremnice) {
        this.idOtpremnice = idOtpremnice;
    }

    public String getKupac() {
        return kupac;
    }

    public void setKupac(String kupac) {
        this.kupac = kupac;
    }

    public String getPreuzimac() {
        return preuzimac;
    }

    public void setPreuzimac(String preuzimac) {
        this.preuzimac = preuzimac;
    }

    public String getPredavac() {
        return imeMagacionera;
    }

    public void setPredavac(String imeMagacionera) {
        this.imeMagacionera = imeMagacionera;
    }

    public ArrayList<Artikl> getListaArtikla() {
        return listaArtikla;
    }

    public void setListaArtikla(ArrayList<Artikl> listaArtikla) {
        this.listaArtikla = listaArtikla;
    }

    public double getZauzetiProstor() {
        return zauzetiProstor;
    }

    public void setZauzetiProstor(double zauzetiProstor) {
        this.zauzetiProstor = zauzetiProstor;
    }

    @Override
    public String toString() {
        return "Otpremnica{" +
                "idOtpremnice=" + idOtpremnice +
                ", kupac='" + kupac + '\'' +
                ", preuzimac='" + preuzimac + '\'' +
                ", imeMagacionera='" + imeMagacionera + '\'' +
                ", listaArtikla=" + listaArtikla +
                ", zauzetiProstor=" + zauzetiProstor +
                '}';
    }
}

