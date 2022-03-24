/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01;
import java.util.Scanner;

public class Zad2_1f {
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
            if((i+1) % 2 != 0 && arr[i] % 2 == 0) result++;
        }
        System.out.println("Result: " + result);
    }
}
