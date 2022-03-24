package pl.imajd.Wadecki;

public class Adres {
    private String ulica;
    private String numer_domu;
    private String numer_mieszkania;
    private String miasto;
    private String kod_pocztowy;
    
    public Adres(String ulica, String numer_domu, String miasto, String kod_pocztowy){
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }
    public Adres(String ulica, String numer_domu, String numer_mieszkania, String miasto, String kod_pocztowy){
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.numer_mieszkania = numer_mieszkania;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }
    
    public void pokaz(){
        System.out.println(this.kod_pocztowy + " " + this.miasto);
        if(numer_mieszkania == null){
            System.out.println(this.ulica + " " + this.numer_domu);
        }
        else{
            System.out.println(this.ulica + " " + this.numer_domu + " " + this.numer_mieszkania);
        }
    }
    
    public boolean przed(Adres adres){
        String thiskod = this.kod_pocztowy.substring(0,2) + this.kod_pocztowy.substring(3, 6);
        String kod = adres.kod_pocztowy.substring(0,2) + adres.kod_pocztowy.substring(3, 6);
        
        Integer thiskodint = Integer.valueOf(thiskod);
        Integer kodint = Integer.valueOf(kod);
        
        if(kodint < thiskodint) return true;
        else return false;
    }
}
