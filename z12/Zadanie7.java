package lab12;

import java.util.LinkedList;

public class Zadanie7 {
    public static void usunDuplikaty(LinkedList<Integer> list1, LinkedList<Integer> list2){
        for(int i=0; i<list1.size(); i++){
            for(int j=0; j<list2.size(); j++){
                if(list1.get(i) == list2.get(j)){
                    list1.remove(i);
                }
            }
        }
    }

    public static void main(String[] args){
        int n = 11;
        int k = 2;
        LinkedList<Integer> pierwsze = new LinkedList<>();
        LinkedList<Integer> tmp = new LinkedList<>();
        for(int i=2; i<=n; i++){
            pierwsze.add(i);
        }
        while(k <= Math.sqrt(n)){
            for(int i=0; i<pierwsze.size(); i++){
                if(pierwsze.get(i) != k && pierwsze.get(i) % k == 0){
                    tmp.add(pierwsze.get(i));
                }
            }
            k++;
            usunDuplikaty(pierwsze, tmp);

        }
        System.out.println(pierwsze);
    }
}
