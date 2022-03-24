import java.util.Scanner;

public class Zad1 {
    
    public static int countChar(String str, char c){
        int result = 0;
        
        for(int i=0; i<str.length(); i++) if(str.charAt(i) == c) result++;
        
        return result;
    }
    
    public static int countSubStr(String str, String subStr){
        int result = 0;
        
        for(int i=0; i<= str.length() - subStr.length(); i++)
        {
            if(str.substring(i, i + subStr.length()).equals(subStr)) result++;
        }
        return result;
    }
    
    public static String middle(String str){
        String result = new String();
        
        if(str.length() % 2 != 0) result = str.substring((int)str.length() / 2 , (int)str.length() / 2 + 1);
        else result = str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
        return result;
    }
    
    public static String repeat(String str, int n){
        String result = new String();
        
        for(int i=0; i<n; i++) result += str;
        return result;
    }
    
    public static int[] where(String str, String subStr){
        int[] arr = new int[countSubStr(str, subStr) * subStr.length()];
        int tmp = 0;
        
        for(int i=0; i<= str.length() - subStr.length(); i++)
        {
            if(str.substring(i, i + subStr.length()).equals(subStr)){
                for(int k=0, j=tmp; k<subStr.length(); j++, k++){
                    arr[j] = i + k;
                }
                tmp+= subStr.length();
            }
        }
        return arr;
    }
    
    public static String change(String str){
       StringBuffer strBuffer = new StringBuffer();
       
       for(int i=0; i<str.length(); i++){
           if(str.substring(i, i+1).equals(str.substring(i,i+1).toUpperCase())){
               strBuffer.append(str.substring(i,i+1).toLowerCase());
           }
           else{
               strBuffer.append(str.substring(i,i+1).toUpperCase());
           }
       }
       return strBuffer.toString();
    }
    
    public static String nice(String str){
        StringBuffer strBuffer = new StringBuffer();
        StringBuffer str2Buffer = new StringBuffer();
        
        for(int i=str.length()-1; i>=0; i--){
            strBuffer.append(str.charAt(i));
        }
        
        for(int i=str.length()-1; i>=0; i--){
            str2Buffer.append(strBuffer.charAt(i));
            if(i!=0 && i % 3 == 0) str2Buffer.append("'");
        }
        return str2Buffer.toString();
    }
    
    public static String niceModify(String str, char c, int n){
        StringBuffer strBuffer = new StringBuffer();
        StringBuffer str2Buffer = new StringBuffer();
        
        for(int i=str.length()-1; i>=0; i--){
            strBuffer.append(str.charAt(i));
        }
        
        for(int i=str.length()-1; i>=0; i--){
            str2Buffer.append(strBuffer.charAt(i));
            if(i!=0 && i % n == 0) str2Buffer.append(c);
        }
        return str2Buffer.toString();
    }
     
    
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        //a)
        System.out.print("strA: ");
        String strA = scanner.nextLine();
        System.out.print("cA: ");
        char c = scanner.next().charAt(0);
        scanner.nextLine();
        
        //b)
        System.out.print("strB: ");
        String strB = scanner.nextLine();
        System.out.print("subStr: ");
        String subStrB = scanner.nextLine();
        
        System.out.println("Znakow: " + c + " wystepuje: " + countChar(strA, c));
        System.out.println("Napis: " + subStrB + ", wystepuje w napisie: " + strB + " " + countSubStr(strB, subStrB) + " razy");
        
        //c
        System.out.print("strC: ");
        String strC = scanner.nextLine();
        System.out.println("Srodkowe: " + middle(strC));
        
        //d
        System.out.print("strD: ");
        String strD = scanner.nextLine();
        System.out.print("intD: ");
        int nD = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Repeat: " + repeat(strD, nD));

        //e
        System.out.print("strE: ");
        String strE = scanner.nextLine();
        System.out.print("subStrE: ");
        String subStrE = scanner.nextLine();
        int[] arr = where(strE, subStrE);
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
        
        //f
        System.out.print("strF: ");
        String strF = scanner.nextLine();
        System.out.println("Result: " + change(strF));
    
        //g
        System.out.print("strG: ");
        String strG = scanner.nextLine();
        System.out.println(nice(strG));

        //h
        System.out.print("strH: ");
        String strH = scanner.nextLine();
        System.out.print("cH: ");
        char cH = scanner.next().charAt(0);
        System.out.print("intH: ");
        int nH = scanner.nextInt();
        if(nH>0)System.out.println("Result: " + niceModify(strH, cH, nH));
        
        
    }
}
