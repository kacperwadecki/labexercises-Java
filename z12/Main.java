package lab12;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        // Zadanie 1
        LinkedList<String> pracownicy1 = new LinkedList<String>();
        pracownicy1.add("1");
        pracownicy1.add("2");
        pracownicy1.add("3");
        pracownicy1.add("4");
        pracownicy1.add("5");
        pracownicy1.add("6");
        pracownicy1.add("7");
        pracownicy1.add("8");
        pracownicy1.add("9");

        System.out.println(pracownicy1);

        List.redukuj(pracownicy1, 3);

        System.out.println(pracownicy1);

        // Zadanie 3

        List.odwroc(pracownicy1);
        System.out.println(pracownicy1);


    }
}
