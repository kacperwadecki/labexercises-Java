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
public class Zad2_4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Podaj n: ");
        int n = scanner.nextInt();
        double[] arr = new double[n];
        
        for(int i=0; i<n; i++)
        {
            double m = scanner.nextDouble();
            arr[i] = m;
        }
        double max = arr[0];
        double min = arr[0];
        
        for(int i=1; i<n; i++)
        {
            if(arr[i] > max)max = arr[i];
            if(arr[i] < min)min = arr[i];
        }
        System.out.println("Max: " + max + " Min: " + min);
    }
}
