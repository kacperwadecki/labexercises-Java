package pl.imajd.Wadecki;

public class Osoba {
    private String nazwisko;
    private int rokUrodzenia;
    
    public Osoba(String nazwisko, int rokUrodzenia){
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }
    
    public String getNazwisko(){
        return this.nazwisko;
    }
    
    public int getRokUrodzenia(){
        return this.rokUrodzenia;
    }
    
    public String toString(){
        return this.nazwisko + " " + String.valueOf(this.getRokUrodzenia());
    }
    
}
