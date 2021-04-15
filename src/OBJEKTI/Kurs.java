package OBJEKTI;

public class Kurs {

    private String imeKursa;
    private String [] studenti;
    private int brojStudenata;

    Kurs( String imeKursa){
        this.imeKursa = imeKursa;
    }

    public void dodajStudenta() {

    }

    public String getImeKursa(){
        return imeKursa;
    }
    public void setImeKursa(String imeKursa){
        this.imeKursa = imeKursa;
    }

    public String [] getStudenti() {
        return studenti;
    }
    public void setStudenti(String [] studenti){
        this.studenti = studenti;
    }

    public int getBrojStudenata() {
        return brojStudenata;
    }
    public void setBrojStudenata(int studenata) {
        this.brojStudenata = brojStudenata;
    }



}
