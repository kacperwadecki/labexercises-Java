/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab0_gr4_wadeckikacper;
import java.util.Scanner;

public class Zad1_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Podaj liczbe naturalna: ");
        int n = scanner.nextInt();
        double[] arr = new double[n];
        
        for(int i=0; i<n; i++)
        {
            double m = scanner.nextDouble();
            arr[i] = m;
        }
        for(int i=1; i<n; i++)
        {
            System.out.print(arr[i] + ", ");
        }
        
        System.out.print(arr[0] + ", ");
    }
}
