package pl.imajd.Wadecki;

public class BetterRectangle extends java.awt.Rectangle{
    
    public BetterRectangle(int x, int y, int width, int height){
        super(x, y, width, height);
        super.setLocation(x, y);
        super.setSize(width, height);
    }
    
    public double getPerimeter(){
        return super.width * 2 + super.height * 2;
    }
    
    public double getArea(){
        return super.width * super.height;
    }
}
