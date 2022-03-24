/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01;
import java.util.Scanner;

public class Zad2_1b {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj n: ");
        int n = scanner.nextInt();
        int result = 0;
        for(int i=0; i<n; i++)
        {
            int m = scanner.nextInt();
            if(m % 3 == 0 && m % 5 != 0) result++;
        }
        System.out.println("Podzielne prez 3 i niepodzielne przez 5: " + result);
    }
}
