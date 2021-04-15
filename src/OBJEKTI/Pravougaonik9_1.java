package OBJEKTI;

public class Pravougaonik9_1 {

    double sirina;
    double visina;

    Pravougaonik9_1(double novaSirina, double novaVisina){
        sirina=novaSirina;
        visina=novaVisina;
    }

    public double vratiPovrsinu(){
        return sirina * visina;
    }
    public double vratiPerimeter(){
        return (2 * sirina) + (2 * visina);
    }


}
