package lab08.pl.imiajd.wadecki;

public class Skrzypce extends Instrument{
    
    public Skrzypce(String producent, java.time.LocalDate rokProdukcji){
        super(producent, rokProdukcji);
    }
    
    @Override
    public void dzwiek(){
        System.out.println("Skrtt");
    }
}
