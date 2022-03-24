/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01;
import java.util.Scanner;

public class Zad2_5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj n: ");
        int n = scanner.nextInt();
        
        double[] arr = new double[n];
        
        double result = 0;
        
        for(int i=0; i<n; i++)
        {
            double m = scanner.nextDouble();
            arr[i] = m;
        }
        
        for(int i=0; i<n-1; i++)
        {
            if(arr[i] > 0 && arr[i+1] >0)result++;
        }
        
        System.out.println("Result: " + result);
    }
}
