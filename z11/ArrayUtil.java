package lab11;

import java.util.ArrayList;

public class ArrayUtil<T> {

    public static <T extends Comparable<T>> boolean isSorted(T[] tab){
        for(int i=0; i<tab.length - 1; i++){
            if(tab[i].compareTo(tab[i + 1]) > 0){
                return false;
            }
        }
        return true;
    }

    public static <T extends Comparable> int binSearch(T[] tab, T x){
        int l = 0;
        int r = tab.length - 1;

        while(l < r){
            int m = (l+r)/2;
            if(tab[m].compareTo(x) == 0) return m;

            if(tab[m].compareTo(x) < 0) l = m + 1;

            else r = m - 1;
        }
        return -1;
    }

    public static <T extends Comparable> void selectionSort(T[] tab){
        int index = 0;
        int at = 0;
        T tmp;

        while(!isSorted(tab)){
            for(int i=index; i<tab.length; i++){
                if(tab[at].compareTo(tab[i]) > 0){
                    tmp = tab[at];
                    tab[at] = tab[i];
                    tab[i] = tmp;
                }
            }
            index = at;
            if(index < tab.length - 1) index++;
            at = index;
        }
    }

    public static <T extends Comparable> void mergeSort(T[] tab){
        //ajajaj
    }
}
