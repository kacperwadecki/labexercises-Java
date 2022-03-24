package lab11;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        // Zadanie 3

        ArrayList<Integer> integer1 = new ArrayList<Integer>();
        integer1.add(30);
        integer1.add(40);
        integer1.add(50);

        Integer[] integerTab1 = integer1.toArray(new Integer[integer1.size()]);
        System.out.println(ArrayUtil.isSorted(integerTab1));

        ArrayList<Integer> integer2 = new ArrayList<Integer>();
        integer2.add(30);
        integer2.add(20);
        integer2.add(40);

        Integer[] integerTab2 = integer2.toArray(new Integer[integer2.size()]);
        System.out.println(ArrayUtil.isSorted(integerTab2));

        ArrayList<LocalDate> localdate1 = new ArrayList<LocalDate>();
        localdate1.add(LocalDate.of(2000,3,20));
        localdate1.add(LocalDate.of(2001,3,23));
        localdate1.add(LocalDate.of(2002,2,20));

        LocalDate[] localdateTab1 = localdate1.toArray(new LocalDate[localdate1.size()]);
        System.out.println(ArrayUtil.isSorted(localdateTab1));

        ArrayList<LocalDate> localdate2 = new ArrayList<LocalDate>();
        localdate2.add(LocalDate.of(2000,3,20));
        localdate2.add(LocalDate.of(2001,3,23));
        localdate2.add(LocalDate.of(2000,2,20));

        LocalDate[] localdateTab2 = localdate2.toArray(new LocalDate[localdate2.size()]);
        System.out.println(ArrayUtil.isSorted(localdateTab2));

        // Zadanie 4

        ArrayList<Integer> integer3 = new ArrayList<Integer>();
        integer3.add(1);
        integer3.add(2);
        integer3.add(3);
        integer3.add(4);

        Integer[] integerTab3 = integer3.toArray(new Integer[integer3.size()]);

        ArrayList<Integer> x = new ArrayList<Integer>();
        x.add(2);

        Integer[] xTab = x.toArray(new Integer[x.size()]);

        System.out.println(ArrayUtil.binSearch(integerTab3, xTab[0]));

        // Zadanie 5

        ArrayList<Integer> integer4 = new ArrayList<Integer>();
        integer4.add(4);
        integer4.add(3);
        integer4.add(1);
        integer4.add(2);
        integer4.add(2);

        Integer[] integerTab4 = integer4.toArray(new Integer[integer4.size()]);
        ArrayUtil.selectionSort(integerTab4);

        for(int i=0; i<integerTab4.length; i++){
            System.out.println(integerTab4[i]);
        }

        ArrayList<LocalDate> localdate3 = new ArrayList<LocalDate>();
        localdate3.add(LocalDate.of(2000,3,20));
        localdate3.add(LocalDate.of(2001,3,23));
        localdate3.add(LocalDate.of(2000,2,20));

        LocalDate[] localdateTab3 = localdate3.toArray(new LocalDate[localdate3.size()]);

        ArrayUtil.selectionSort(localdateTab3);

        for(int i=0; i<localdateTab3.length; i++){
            System.out.println(localdateTab3[i]);
        }

        // Zadanie 6
    }
}
