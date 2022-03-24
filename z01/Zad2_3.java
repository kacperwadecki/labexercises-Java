/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01;
import java.util.Scanner;

public class Zad2_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Podaj n: ");
        int n = scanner.nextInt();
        int resultzer = 0;
        int resultdodatnie = 0;
        int resultujemne = 0;
        
        for(int i=0; i<n; i++)
        {
            double m = scanner.nextDouble();
            if(m == 0)resultzer++;
            else if(m>0)resultdodatnie++;
            else resultujemne++;
        }
        System.out.println("Zer: " + resultzer + " Dodatnie: " + resultdodatnie
        + " Ujemne: " + resultujemne);
    }
}
