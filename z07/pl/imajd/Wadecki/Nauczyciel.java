package pl.imajd.Wadecki;

public class Nauczyciel extends Osoba{
    private double pensja;
    
    public Nauczyciel(String nazwisko, int rokUrodzenia, double pensja){
        super(nazwisko, rokUrodzenia);
        this.pensja = pensja;
    }
    
    public double getPensja(){
        return this.pensja;
    }
    
    public String toString(){
        return this.getNazwisko() + " " + String.valueOf(this.getRokUrodzenia()) + " " + String.valueOf(this.pensja);
    }
}
