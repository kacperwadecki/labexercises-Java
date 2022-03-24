import java.math.BigDecimal;
import java.math.RoundingMode;

public class Zad5 {
    public static void main(String[] args){
        BigDecimal n = new BigDecimal(args[0]);
        BigDecimal k = new BigDecimal(args[1]);
        BigDecimal p = new BigDecimal(args[2]);
        BigDecimal sto = new BigDecimal("100");
        
        p = p.divide(sto);
        
        for(int i=0; i<n.intValue(); i++){
           k = k.add(k.multiply(p));
        }
        k = k.setScale(2, RoundingMode.HALF_DOWN);
        System.out.println(k);
    }
}
