/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01;
import java.util.Scanner;

public class Zad2_1d {
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
        
        
        for(int i=0; i<n-1; i++)
        {
            if(i > 0 && ((arr[i-1] + arr[i+1]) / 2) > arr[i]) result++;
        }
        System.out.println("Result: " + result);
    }
}
