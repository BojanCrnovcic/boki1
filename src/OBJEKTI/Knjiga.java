package OBJEKTI;

public class Knjiga {

    private String naziv;
    private String pisac;
    private String zanr;

   public Knjiga(String naziv, String zanr ,String pisac){
       this.naziv = naziv;
       this.zanr = zanr;
       this.pisac = pisac;
   }
   public String getNaziv(){
       return naziv;
   }
   public void setNaziv(String naziv){
       this.naziv = naziv;
   }

   public String getZanr(){
       return zanr;
   }
   public void setZanr(String zanr){
       this.zanr = zanr;
   }

   public String getPisac(){
       return pisac;
   }
   public void setPisac(String pisac){
       this.pisac = pisac;
   }

}
