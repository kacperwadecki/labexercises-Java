import pl.imiajd.wadecki.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;


public class TestStudent {
    public static void main(String[] args){
        ArrayList grupa = new ArrayList<Student>();

        Student student1 = new Student("student1",  LocalDate.of(2000,3,4), 4.50);
        Student student2 = new Student("student1",  LocalDate.of(2000,3,4), 4.70);
        Student student3 = new Student("student2",  LocalDate.of(2000,3,4), 4.40);
        Student student4 = new Student("student3",  LocalDate.of(2000,3,4), 4.30);
        Student student5 = new Student("Wadecki",  LocalDate.of(2000,11,27), 4.20);

        grupa.add(student1);
        grupa.add(student2);
        grupa.add(student3);
        grupa.add(student4);
        grupa.add(student5);

        for(int i=0; i<grupa.size(); i++){
            System.out.println(grupa.get(i));
        }

        Collections.sort(grupa);
        System.out.println("-----------");

        for(int i=0; i<grupa.size(); i++){
            System.out.println(grupa.get(i));
        }

        System.out.println(student1.compareTo(student2));
    }
}
