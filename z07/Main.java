import pl.imajd.Wadecki.Adres;
import pl.imajd.Wadecki.Osoba;
import pl.imajd.Wadecki.Nauczyciel;
import pl.imajd.Wadecki.Student;
import pl.imajd.Wadecki.BetterRectangle;

public class Main {
    public static void main(String[] str){
        Adres adres1 = new Adres("Sienkiewicza", "10", "1A", "Bisztynek", "11-230");
        Adres adres2 = new Adres("Optykwieczia", "10", "Bisztynek", "10-220");
        Adres adres3 = new Adres("Snejka", "10", "1A", "Bisztynek", "11-530");
        
        adres1.pokaz();
        
        Osoba osoba1 = new Osoba("Sienkiewicz", 1999);
        System.out.println(osoba1);
        Nauczyciel nauczyciel1 = new Nauczyciel("Kowalski", 1410, 4000);
        System.out.println(nauczyciel1);
        Student student1 = new Student("Wadecki", 1500, "IS");
        System.out.println(student1);
        
        BetterRectangle rect1 = new BetterRectangle(0, 0, 10, 5);
        System.out.println(rect1.getArea());
        System.out.println(rect1.getPerimeter());
    }
}
