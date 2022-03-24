package lab02;

import java.util.Random;
import java.util.Scanner;

public class Zad2 {
    public static void generuj (int tab[], int n, int minWartosc, int maxWartosc)
    {
        Random generator = new Random();
        for(int i=0; i<n; i++) tab[i] = generator.nextInt(maxWartosc - minWartosc + 1) + minWartosc;
    }
    
    //Zad2 a)
    public static int ileNieparzystych(int tab[])
    {
        int nieparzyste = 0;
        for(int i=0; i<tab.length; i++) if(tab[i] % 2 != 0) nieparzyste++;
        return nieparzyste;
    }
    public static int ileParzystych(int tab[])
    {
        int parzyste = 0;
        for(int i=0; i<tab.length; i++) if(tab[i] % 2 == 0) parzyste++;
        return parzyste;
    }
    
    //Zad2 b)
    public static int ileDodatnich(int tab[])
    {
        int dodatnie = 0;
        for(int i=0; i<tab.length; i++)if(tab[i] > 0) dodatnie++;
        return dodatnie;
    }
    public static int ileUjemnych(int tab[])
    {
        int ujemne = 0;
        for(int i=0; i<tab.length; i++)if(tab[i] < 0) ujemne++;
        return ujemne;
    }
    public static int ileZerowych(int tab[])
    {
        int zerowe = 0;
        for(int i=0; i<tab.length; i++)if(tab[i] == 0) zerowe++;
        return zerowe;
    }
    
    //Zad2 c)
    public static int ileMaksymalnych(int tab[])
    {
        double max = Double.NEGATIVE_INFINITY;
        int counter = 0;
        for(int i=0; i<tab.length; i++) if(tab[i] > max) max = tab[i];
        for(int i=0; i<tab.length; i++) if(tab[i] == max) counter++;
        return (int)counter;
    }
    
    //Zad2 d)
    public static int sumaDodatnich(int tab[])
    {
        int sumaDodatnich = 0;
        for(int i=0; i<tab.length; i++) if(tab[i] > 0) sumaDodatnich+=tab[i];
        return sumaDodatnich;
    }
    public static int sumaUjemnych(int tab[])
    {
        int sumaUjemnych = 0;
        for(int i=0; i<tab.length; i++) if(tab[i] < 0) sumaUjemnych+=tab[i];
        return sumaUjemnych;
    }
    //Zad2 e)
    public static int dlugoscMaksymalnegoCiaguDodatnich(int tab[])
    {
        int dlugosc = 0;
        double maxDlugosc = Double.NEGATIVE_INFINITY;
            
        for(int i=0; i<tab.length; i++)
        {
            if(tab[i] > 0) 
            {
                dlugosc++;
                if(maxDlugosc < dlugosc) maxDlugosc = dlugosc;
            }
            if(tab[i] <= 0) dlugosc = 0;
        }    
        return (int)maxDlugosc;
    }
    //Zad2 f)
    public static void signum(int tab[])
    {
        int[] tab2 = new int[tab.length];
        System.arraycopy(tab, 0, tab2, 0, tab.length);
        
        for(int i=0; i<tab.length; i++)
        {
            if(tab2[i]>0)tab2[i] = 1;
            if(tab2[i]<0)tab2[i] = -1;
             System.out.println(tab2[i]);
        }
    }
    
    //Zad2 g)
    public static void odwrocFragment(int tab[], int lewy, int prawy)
    {
        if(lewy >= 0 && prawy >= lewy && tab.length > prawy)
        {
            for(int i=0; i<tab.length; i++) System.out.println(i + "." + tab[i]); 
            
            int[] arrtmp = new int[prawy - lewy + 1];
                
            for(int i=lewy, j=0; i<=prawy; i++, j++) arrtmp[j] = tab[i];
                
            for(int i=prawy, j=0; i>=lewy; i--, j++) tab[i] = arrtmp[j];
                
            for(int i=0; i<tab.length; i++) System.out.println(i + "." + tab[i]);
        }
        else System.out.println("Podano zly przedzial!");
    }
    
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] tab = new int[n];
        
        if(n >= 1 && n <=100)
        {
            generuj(tab, n, -999, 999);
            System.out.println("Nieparzyste: " + ileNieparzystych(tab) + " Parzyste: " + ileParzystych(tab));
            System.out.println("Dodatnie: " + ileDodatnich(tab) + " Ujemne: " + ileUjemnych(tab) + " Zerowe: " + ileZerowych(tab));
            System.out.println("Tyle maksymalnych: " + ileMaksymalnych(tab));
            System.out.println("Suma dodatnich: " + sumaDodatnich(tab) + " Suma ujemnych: " + sumaUjemnych(tab));
            System.out.println("Dlugosc maksymalnego ciagu dodatnich: " + dlugoscMaksymalnegoCiaguDodatnich(tab));
            signum(tab);
            int lewy = scanner.nextInt();
            int prawy = scanner.nextInt();
            odwrocFragment(tab, lewy, prawy);
        }
        else System.out.println("Podano zly n");
            
        
    }
    
}
