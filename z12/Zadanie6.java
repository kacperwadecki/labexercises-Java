package lab12;

import java.util.Stack;

public class Zadanie6 {
    public static void main(String[] args){
        int liczba = 2015;
        Stack<Integer> result = new Stack<Integer>();
        do{
            result.push(liczba % 10);
            liczba /= 10;
        }
        while(liczba != 0);

        int sizeStack = result.size();

        for(int i=0; i<sizeStack; i++){
            System.out.print(result.pop() + " ");
        }
    }
}
