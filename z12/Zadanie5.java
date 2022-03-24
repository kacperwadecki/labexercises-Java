package lab12;

import java.util.Locale;
import java.util.Stack;

public class Zadanie5 {
    public static boolean czyMaKropke(String str){
        for(int i=0; i<str.length(); i++) {
            if (str.charAt(i) == '.') {
                return true;
            }
        }
        return false;
    }

    public static boolean czyMaWielkaLitere(String str){
        for(int i=0; i<str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        Stack<String> stck1 = new Stack<>();
        Stack<String> stck2 = new Stack<>();
        String result = "";
        boolean flaga = true;

        String str1 = "Ala ma kota. Jej kot lubi myszy.";
        String[] str1Tab = str1.split(" ");

        int sizeStack = 0;

        for(String item: str1Tab){
            if(czyMaKropke(item)){
                item = item.substring(0, 1).toUpperCase() + item.substring(1);
                for(int i=0; i<item.length(); i++){
                    if (item.charAt(i) == '.') {
                        item = item.substring(0, i);
                    }
                }
                stck1.push(item);
                flaga = false;
                for(int i=0; i<=sizeStack; i++){
                    result += stck1.pop() + " ";
                }
                sizeStack = 0;
            }

            else if(czyMaWielkaLitere(item)){
                item = item.substring(0, 1).toLowerCase() + item.substring(1);
                item += ".";
            }
            if(flaga){
                stck1.push(item);
                sizeStack++;
            }
            flaga = true;
        }
        System.out.println(result);

    }
}
