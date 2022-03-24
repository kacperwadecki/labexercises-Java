/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01;
import java.util.Scanner;

public class Zad1_1g {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Podaj ile liczb rzeczywistych potrzebujesz: ");
        int n = scanner.nextInt();
        
        double result1 = 0;
        double result2 = 1;
        
        for(int i=0; i<n; i++)
        {
            double m = scanner.nextDouble();
            result1 += m;
            result2 *= m;
        }
        
        System.out.println("Suma: " + result1 + " Iloczyn: " + result2);
    }
}
