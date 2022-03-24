package pl.imiajd.wadecki;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Osoba  implements Cloneable, Comparable<Osoba>{
    private String nazwisko;
    private LocalDate dataUrodzenia;

    public Osoba(String nazwisko, LocalDate dataUrodzenia){
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }

    public String toString(){
        return this.getClass().getSimpleName() + " [ " + this.nazwisko + " " + dataUrodzenia.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    public boolean equals(Object os){
        if(this == os) return true;

        if(os == null || os.getClass() != this.getClass()) return false;

        Osoba i  = (Osoba) os;

        return (i.nazwisko.equals(this.nazwisko) && i.dataUrodzenia.equals(this.dataUrodzenia));
    }

    @Override
    public int compareTo(Osoba o) {
        int result = o.nazwisko.compareTo(this.nazwisko);
        if(result == 0) {
            result = o.dataUrodzenia.compareTo(this.dataUrodzenia);
        }
        return result;
    }

    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
