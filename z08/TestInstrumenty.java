package lab08;

import lab08.pl.imiajd.wadecki.*;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Iterator;


public class TestInstrumenty {
    public static void main(String[] args){
        ArrayList orkiestra = new ArrayList<Instrument>();
        
        Flet flet1 = new Flet("Yamaha", LocalDate.ofYearDay(1999, 300));
        Flet flet2 = new Flet("Yamaha", LocalDate.ofYearDay(1999, 300));
        Fortepian fortepian1 = new Fortepian("Suzuki", LocalDate.ofYearDay(1999, 300));
        Fortepian fortepian2 = new Fortepian("Nike", LocalDate.ofYearDay(1939, 300));
        Skrzypce skrzypce1 = new Skrzypce("Suzuki", LocalDate.ofYearDay(1999, 300));
        
        orkiestra.add(flet1);
        orkiestra.add(flet2);
        orkiestra.add(fortepian1);
        orkiestra.add(fortepian2);
        orkiestra.add(skrzypce1);
        
        for(Iterator it = orkiestra.iterator(); it.hasNext();) {
            Instrument x = (Instrument) it.next();
            x.dzwiek();
            System.out.println(x);
        }
        
        System.out.println(flet1.equals(flet2));
        System.out.println(flet2.equals(fortepian1));
        System.out.println(fortepian1.equals(skrzypce1));
        
    }
}
