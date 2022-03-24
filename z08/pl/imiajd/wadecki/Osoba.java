package lab08.pl.imiajd.wadecki;

public class Osoba {
    private String nazwisko;
    private int rokUrodzenia;
    private String[] imiona;
    private java.time.LocalDate dataUrodzenia;
    private boolean plec;
    
    public Osoba(String nazwisko, String[] imiona, java.time.LocalDate dataUrodzenia, boolean plec){
        this.nazwisko = nazwisko;
        this.imiona = imiona;
        this.dataUrodzenia = dataUrodzenia;
        this.plec = plec;
    }
    
    public String getNazwisko(){
        return this.nazwisko;
    }
    
    public String[] getImiona(){
        return this.imiona;
    }
    
    public java.time.LocalDate getDataUrodzenia(){
        return this.dataUrodzenia;
    }
    
    public boolean getPlec(){
        return this.plec;
    }
    
    public String toString(){
        String result = "";
        
        for(int i=0; i<this.imiona.length; i++){
            result += this.imiona[i] + " ";
        }
        result += this.nazwisko + " " + this.dataUrodzenia;
        
        if(!this.plec) result+= " Kobieta";
        else result += " Mężczyzna";
        
        return result;
    }
    
}
