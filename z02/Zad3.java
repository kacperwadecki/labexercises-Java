package lab02;

import java.util.Scanner;
import java.util.Random;

public class Zad3 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random generator = new Random();
        
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[][] a = new int[m][n];
        int[][] b = new int[n][k];
        int[][] c = new int[m][k];
        
        if(m <= 10 && m >= 1 && n <= 10 && n >= 1 && k <= 10 && k >= 1)
        {
            for(int i=0; i<m; i++)
            {
                for(int j=0; j<n; j++)
                {
                    a[i][j] = generator.nextInt(10);
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("-------");

            for(int i=0; i<n; i++)
            {
                for(int j=0; j<k; j++)
                {
                    b[i][j] = generator.nextInt(10);
                    System.out.print(b[i][j] + " ");
                }
                System.out.println();
            }


            for(int i=0; i<m; i++)
            {
                for(int j=0; j<k; j++)
                {
                    int iloczyn = 0;
                    for(int z=0; z<n; z++)
                    {
                        iloczyn += a[i][z] * b[z][j];
                    }
                    c[i][j] = iloczyn;
                }
            }

            System.out.println("-------");

            for(int i=0; i<m; i++)
            {
                for(int j=0; j<k; j++)
                {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
        else System.out.println("Podano zly przedzial");
        
        
    }
}
