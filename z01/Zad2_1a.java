/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01;
import java.util.Scanner;

public class Zad2_1a {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj n: ");
        int n = scanner.nextInt();
        int resultNieparzyste = 0;
        
        for(int i=0; i<n; i++)
        {
            int m = scanner.nextInt();
            if(m % 2 != 0) resultNieparzyste++;
        }
        System.out.println("Nieparzyste: " + resultNieparzyste);
    }
}
