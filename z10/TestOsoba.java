import pl.imiajd.wadecki.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;


public class TestOsoba {
    public static void main(String[] args){
        ArrayList grupa = new ArrayList<Osoba>();

        Osoba osoba1 = new Osoba("Kowalski", LocalDate.of(2000,3,4));
        Osoba osoba2 = new Osoba("Kowalski", LocalDate.of(1990,2,3));
        Osoba osoba3 = new Osoba("Jackowski", LocalDate.of(2000,3,4));
        Osoba osoba4 = new Osoba("Lajkowski", LocalDate.of(2000,3,4));
        Osoba osoba5 = new Osoba("Wadecki", LocalDate.of(2000,5,5));

        grupa.add(osoba1);
        grupa.add(osoba2);
        grupa.add(osoba3);
        grupa.add(osoba4);
        grupa.add(osoba5);

        for(int i=0; i<grupa.size(); i++){
            System.out.println(grupa.get(i));
        }

        Collections.sort(grupa);
        System.out.println("-----------");

        for(int i=0; i<grupa.size(); i++){
            System.out.println(grupa.get(i));
        }
    }
}
