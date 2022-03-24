package lab06;

public class RachunekBankowy{
    static double rocznaStopaProcentowa;
    private double saldo;
    
    public RachunekBankowy(double s){
        saldo = s;
    }
   
    public double getSaldo(){
        return this.saldo;
    }
    
    public double obliczMiesieczneOdsetki(){
        double result = this.saldo * rocznaStopaProcentowa / 12;
        result = (double)Math.round(result*100)/100;
        this.saldo += result;
        return result;
    }
    
    public static void setRocznaStopaProcentowa(double newRocznaStopaProcentowa){
        rocznaStopaProcentowa = newRocznaStopaProcentowa;
    }
}