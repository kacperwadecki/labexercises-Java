/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01;
import java.util.Scanner;


public class Zad2_1e {
    
    public static int silnia(int n){
        int result = 1;
        
        for(int i=1; i<=n;i++){
            result *= i;
        }
        return result;
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Podaj n: ");
        int n = scanner.nextInt();
        int result = 0;
        int[] arr = new int[n];
        
        
        for(int i=0; i<n; i++)
        {
            int m = scanner.nextInt();
            arr[i] = m;
        }
        
        
        for(int i=0; i<n; i++)
        {
            if((Math.pow(2, i) < arr[i]) && (silnia(i) > arr[i])) result ++;
        }
        System.out.println("Result: " + result);
    }
}
