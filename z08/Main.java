package lab08;

import lab08.pl.imiajd.wadecki.Pracownik;
import lab08.pl.imiajd.wadecki.Osoba;
import lab08.pl.imiajd.wadecki.Student;
import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        /*Osoba*/
        String[] imiona1 = {"Adam", "Tomek"};
        Osoba osoba1 = new Osoba("Kowalski", imiona1, LocalDate.of(2000, 2, 3), true);
        
        System.out.println("OSOBA");
        System.out.println(osoba1);
        System.out.println(osoba1.getDataUrodzenia());
        System.out.println(Arrays.toString(osoba1.getImiona()));
        System.out.println(osoba1.getNazwisko());
        System.out.println(osoba1.getPlec());
        
        /*Pracownik*/
        String[] imiona2 = {"Kornelia"};
        Pracownik pracownik1 = new Pracownik("Sobieska", imiona2, LocalDate.of(1999, 5, 6), false, 4000, LocalDate.of(2020, 5, 2));
        
        System.out.println("PRACOWNIK");
        System.out.println(pracownik1);
        System.out.println(pracownik1.getPensja());
        System.out.println(pracownik1.getDataUrodzenia());
        
        /*Student*/
        String[] imiona3 = {"Jacek", "Szymon"};
        Student student1 = new Student("Obcaski", imiona3, LocalDate.of(1940, 4, 20), true, "Informatyka");
        
        student1.setSredniaOcen(4.3);
        
        System.out.println("STUDENT");
        System.out.println(student1);
        System.out.println(student1.getKierunek());
        System.out.println(student1.getSredniaOcen());
        
        
    }
}
