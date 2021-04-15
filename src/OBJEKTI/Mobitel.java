package OBJEKTI;

public class Mobitel {

    private String brend;
    private String model;
    private int godinaProizvodnje;

    public Mobitel(){

    }

    public String getBrend(){
        return brend;
    }

    public void setBrand(String brend){
       this.brend = brend;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public int getGodinaProizvodnje(){
        return godinaProizvodnje;
    }

    public void setGodinaProizvodnje(int godinaProizvodnje){
        this.godinaProizvodnje = godinaProizvodnje;
    }
}
