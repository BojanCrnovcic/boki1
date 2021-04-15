package OBJEKTI;

public class Krug {

    double poluprecnik = 1.0;

    Krug(){

    }
    Krug(double noviPoluprecnik){
        poluprecnik = noviPoluprecnik;
    }

    double vratiPovrsinu() {
        return poluprecnik * poluprecnik * Math.PI;
    }

    double vratiObim() {
        return 2 * poluprecnik * Math.PI;
    }

    public void postaviPoluprecnik(double noviPoluprecnik){
        poluprecnik = noviPoluprecnik;
    }
}
