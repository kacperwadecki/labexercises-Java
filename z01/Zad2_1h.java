/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01;
import java.util.Scanner;
/**
 *
 * @author kacpe
 */
public class Zad2_1h {
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
            if(Math.abs(arr[i]) < i * i)result++;
        }
        System.out.println("Result: " + result);
    }
}
