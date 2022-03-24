package lab12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Zadanie8 {
    public static <T extends Iterable> void print(T obiekt){
        Iterator<T> iter = obiekt.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next() + ", ");
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("lol");
        list2.add("lol1");
        list2.add("lol2");
        list2.add("lol3");
        print(list1);
        System.out.println("");
        print(list2);
    }
}
