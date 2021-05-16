package MAGACIN;

public class Artikl {

    private String imeArtikla;
    private String imeDobavljaca;
    private double zauzetiProstor;

    public Artikl() {

    }

    public Artikl(String imeArtikla, String imeDobavljaca, double zauzetiProstor) {
        this.imeArtikla = imeArtikla;
        this.imeDobavljaca = imeDobavljaca;
        this.zauzetiProstor = zauzetiProstor;
    }

    public String getImeArtikla() {
        return imeArtikla;
    }

    public void setImeArtikla(String imeArtikla) {
        this.imeArtikla = imeArtikla;
    }

    public String getImeDobavljaca() {
        return imeDobavljaca;
    }

    public void setImeDobavljaca(String imeDobavljaca) {
        this.imeDobavljaca = imeDobavljaca;
    }
    public double getZauzetiProstor() {
        return  zauzetiProstor;
    }

    public void setZauzetiProstor(double zauzetiProstor) {
        this.zauzetiProstor = zauzetiProstor;
    }

    @Override
    public String toString() {
        return "Artikl{" +
                "imeArtikla='" + imeArtikla + '\'' +
                ", imeDobavljaca='" + imeDobavljaca + '\'' +
                ", zauzetiProstor=" + zauzetiProstor +
                '}';
    }
}
