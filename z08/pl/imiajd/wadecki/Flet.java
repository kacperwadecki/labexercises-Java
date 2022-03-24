package lab08.pl.imiajd.wadecki;

public class Flet extends Instrument{
    
    public Flet(String producent, java.time.LocalDate rokProdukcji){
        super(producent, rokProdukcji);
    }
    
    @Override
    public void dzwiek(){
        System.out.println("Fiuuuu");
    }
}
