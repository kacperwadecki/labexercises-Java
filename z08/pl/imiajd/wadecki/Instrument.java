package lab08.pl.imiajd.wadecki;
public abstract class Instrument {
    private String producent;
    private java.time.LocalDate rokProdukcji;
    
    public Instrument(String producent, java.time.LocalDate rokProdukcji){
        this.producent = producent;
        this.rokProdukcji = rokProdukcji;
    }
    
    public String getProducent(){
        return this.producent;
    }
    
    public java.time.LocalDate getRokProdukcji(){
        return this.rokProdukcji;
    }
    
    public abstract void dzwiek();
    
    public boolean equals(Instrument instr){
        if(this == instr) return true;
        
        if(instr == null || instr.getClass() != this.getClass()) return false;
        
        Instrument i  = (Instrument) instr;
        
        return (i.rokProdukcji.equals(this.rokProdukcji) && i.producent.equals(this.producent));
    }
    
    public String toString(){
        return this.producent + " " + this.rokProdukcji;
    }
}
