package OBJEKTI;

public class BMI {

    private String ime;
    private int godine;
    private double visina;
    private double tezina;

    public BMI(String ime, int godine, double tezina, double visina){
        this.ime = ime;
        this.godine = godine;
        this.tezina = tezina;
        this.visina = visina;
    }

    public double getBMI() {
        double bmi = tezina / (visina * visina);
        return Math.round(bmi * 100) / 100.0;
    }

    public String getBMIStatus(){
        if (getBMI()<18.5){
            return "Pothranjen";
        }
        else if (getBMI()>=18.5 && getBMI()<25.0)
            return "Idealan";
        else if (getBMI()>= 25.0 && getBMI()<30.0)
            return "Gojazan";
        else if (getBMI()>=30)
            return "Prejterano Gojazan";
        return "";
    }

    public String getIme() {
        return ime;
    }
    public void setIme(String ime){
        this.ime = ime;
    }

    public int getGodine() {
        return godine;
    }
    public void setGodine(int godine) {
        this.godine = godine;
    }

    public double getTezina() {
        return tezina;
    }
    public void setTezina(double tezina) {
        this.tezina = tezina;
    }

    public double getVisina() {
        return visina;
    }

    public void setVisina(double visina) {
        this.visina = visina;
    }
}
