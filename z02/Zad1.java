package lab02;
import java.util.Scanner;
import java.util.Random;

public class Zad1 {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        Random generator = new Random();
        
        int n = scanner.nextInt();
        
        if(n >= 1 && n <=100)
        {
            int[] arr = new int[n];
            
            for(int i=0; i<n; i++)arr[i] = generator.nextInt(1999) - 999;
            
            //Zad1 a)
            int nieparzyste = 0;
            int parzyste = 0;
            
            for(int i=0; i<n; i++)
            {
                if(arr[i] % 2 == 0)parzyste++;
                if(arr[i] % 2 != 0)nieparzyste++;
            }
            System.out.println("Nieparzyste: " + nieparzyste + " Parzyste: " + parzyste);
            
            //Zad1 b)
            int ujemne = 0;
            int dodatnie = 0;
            int zerowe = 0;
            
            for(int i=0; i<n; i++)
            {
                if(arr[i] > 0)dodatnie++;
                if(arr[i] < 0)ujemne++;
                if(arr[i] == 0)zerowe++;
            }
            System.out.println("Dodatnie: " + dodatnie + " Ujemne: " + ujemne + " Zerowe: " + zerowe);
            
            //Zad1 c)
            double max = Double.NEGATIVE_INFINITY;
            int counter = 0;
            
            for(int i=0; i<n; i++) if(arr[i] > max) max = arr[i];
            for(int i=0; i<n; i++) if(arr[i] == max) counter++;
            
            System.out.println("Max: " + max + " Wystepuje: " + counter + " razy");
            
            //Zad1 d)
            int sumaUjemnych = 0;
            int sumaDodatnich = 0;
            
            for(int i=0; i<n; i++)
            {
                if(arr[i] > 0) sumaDodatnich += arr[i];
                if(arr[i] < 0) sumaUjemnych += arr[i];
            }
            
            System.out.println("Suma dodatnich: " + sumaDodatnich + " Suma ujemnych: " + sumaUjemnych);
            
            //Zad1 e)
            int dlugosc = 0;
            double maxDlugosc = Double.NEGATIVE_INFINITY;
            
            for(int i=0; i<n; i++)
            {
                if(arr[i] > 0) 
                {
                    dlugosc++;
                    if(maxDlugosc < dlugosc) maxDlugosc = dlugosc;
                }
                if(arr[i] <= 0) dlugosc = 0;
            }
            
            
            System.out.println("Najdluzszy fragment tablicy, który ma wszystkie elementy dodatnie ma dlugosc: " + maxDlugosc);
            
            //Zad1 f)
            int[] arr2 = new int[n];
            System.arraycopy(arr, 0, arr2, 0, n);
            
            for(int i=0; i<n; i++)
            {
                if(arr2[i]>0)arr2[i] = 1;
                if(arr2[i]<0)arr2[i] = -1;
                System.out.println(arr2[i]);
            }
            
            //Zad1 g)
            int lewy = scanner.nextInt();
            int prawy = scanner.nextInt();
            
            if(lewy >= 0 && prawy >= lewy && n > prawy)
            {
                for(int i=0; i<n; i++) System.out.println(i + "." + arr[i]); 
                
                int[] arrtmp = new int[prawy - lewy + 1];
                
                for(int i=lewy, j=0; i<=prawy; i++, j++) arrtmp[j] = arr[i];
                
                for(int i=prawy, j=0; i>=lewy; i--, j++) arr[i] = arrtmp[j];
                
                for(int i=0; i<n; i++) System.out.println(i + "." + arr[i]);
            }
            else System.out.println("Podano zly przedzial!");
        }
        
        else System.out.println("Podano zly n");
        
    }
}
