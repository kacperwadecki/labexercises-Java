package lab08.pl.imiajd.wadecki;

public class Pracownik extends Osoba {
    private double pensja;
    private java.time.LocalDate dataZatrudnienia;
    
    public Pracownik(String nazwisko, String[] imiona, java.time.LocalDate dataUrodzenia, boolean plec, double pensja, java.time.LocalDate dataZatrudnienia){
        super(nazwisko, imiona, dataUrodzenia, plec);
        this.pensja = pensja;
        this.dataZatrudnienia = dataZatrudnienia;
    }
    
    public double getPensja(){
        return this.pensja;
    }
    
    public java.time.LocalDate getDataZatrudnienia(){
        return this.dataZatrudnienia;
    }
    
    public String toString(){
        String result = super.toString();
        result += " " + String.valueOf(this.pensja) + " " + this.dataZatrudnienia;
        return result;
    }
}
