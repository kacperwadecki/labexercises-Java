/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01;
import java.util.Scanner;

public class Zad2_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Podaj n: ");
        int n = scanner.nextInt();
        
        double result = 0;
        
        for(int i=0; i<n; i++)
        {
            double m = scanner.nextDouble();
            if(m > 0) result+= 2 * m;
        }
        
        System.out.println("Result: " + result);
    }
}
