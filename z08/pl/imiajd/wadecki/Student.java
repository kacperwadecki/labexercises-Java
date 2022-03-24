package lab08.pl.imiajd.wadecki;

public class Student extends Osoba{
    private String kierunek;
    private static double sredniaOcen = 5;
    
    public Student(String nazwisko, String[] imiona, java.time.LocalDate dataUrodzenia, boolean plec, String kierunek){
        super(nazwisko, imiona, dataUrodzenia, plec);
        this.kierunek = kierunek;
    }
    
    public String getKierunek(){
        return this.kierunek;
    }
    
    public double getSredniaOcen(){
        return this.sredniaOcen;
    }
    
    public void setSredniaOcen(double srednia){
        this.sredniaOcen = srednia;
    }
    
    public String toString(){
        String result = super.toString();
        result += " " + kierunek + " " + String.valueOf(this.sredniaOcen);
        return result;
    }
}
