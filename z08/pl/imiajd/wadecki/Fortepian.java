package lab08.pl.imiajd.wadecki;
public class Fortepian extends Instrument{
    
    public Fortepian(String producent, java.time.LocalDate rokProdukcji){
        super(producent, rokProdukcji);
    }
    
    @Override
    public void dzwiek(){
        System.out.println("Duuuu");
    }
}
