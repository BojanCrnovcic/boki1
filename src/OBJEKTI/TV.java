package OBJEKTI;

public class TV {

    public int kanal;
    public int jacinaZvuka;
    public boolean upaljen;

    public TV() {

    }

    public void upaliti() {
        upaljen = true;
    }

    public void ugasiti() {
        upaljen = false;
    }

    public void postavitiKanal(int noviKanal) {
        if (upaljen){
        kanal = noviKanal;
        }
    }

    public void postavitiJacinuZvuka(int novaJacinaZvuka) {
        jacinaZvuka = novaJacinaZvuka;
    }

    public void kanalGore() {
        kanal++;
    }

    public void kanalDole() {
        kanal--;
    }

    public void jacinaZvukaGore() {
        jacinaZvuka++;
    }

    public void jacinaZvukaDole() {
        jacinaZvuka--;
    }


}
