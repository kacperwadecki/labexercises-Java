package lab12;

import java.util.LinkedList;

public class List {
    public static <T> void redukuj(LinkedList<T> pracownicy, int n){
        int tmp = 0;
        int index = 0;
        for(int i=0; i<pracownicy.size() + index; i++){
            if((tmp + 1)% n == 0){
                pracownicy.remove(i - index);
                index++;
            }
            tmp++;
        }
    }

    public static <T> void odwroc(LinkedList<T> lista){
        LinkedList<T> copyLista = new LinkedList<T>();
        copyLista = (LinkedList)lista.clone();

        for(int i=0, j=lista.size() - 1; j > 0; i++, j--){
            lista.add(i, copyLista.get(j));
            lista.removeLast();
        }
    }
}
