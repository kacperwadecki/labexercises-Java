package pl.imiajd.wadecki;

import java.time.LocalDate;

public class Student extends Osoba implements Cloneable, Comparable<Osoba>{
    private double sredniaOcen;

    public Student(String nazwisko, LocalDate dataUrodzenia, double sredniaOcen) {
        super(nazwisko, dataUrodzenia);
        this.sredniaOcen = sredniaOcen;
    }

    public double getSredniaOcen(){
        return this.sredniaOcen;
    }

    public String toString(){
        return super.toString() + " " + this.sredniaOcen;
    }

    public int compareTo(Student s){
        if(super.compareTo(s) == 0){
            return Double.compare(s.getSredniaOcen(), this.sredniaOcen);
        }
        else{
            return super.compareTo(s);
        }
    }

    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}
