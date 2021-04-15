package OBJEKTI;

public class Pisac {

    String ime;
    int godiste;

    public Pisac(){

    }
    public Pisac(String ime, int godiste){
        this.ime = ime;
        this.godiste = godiste;
    }
    public String getIme(){
        return ime;
    }
    public void setIme(String ime ){
        this.ime=ime;
    }
    public int getGodiste(){
        return godiste;
    }
    public void setGodiste(int godiste){
        this.godiste=godiste;
    }

}
