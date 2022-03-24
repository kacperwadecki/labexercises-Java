import java.math.BigInteger;

public class Zad4 {
    
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        BigInteger dwa = new BigInteger("2");
        BigInteger jeden = new BigInteger("1");
        BigInteger result = dwa.pow(n * n).subtract(jeden);
        
        System.out.println("Result: " + result);
    }
}
