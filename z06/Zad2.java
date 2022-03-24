package lab06;

public class Zad2 {
    public static void main(String[] args){
        IntegerSet tab1 = new IntegerSet();
        IntegerSet tab2 = new IntegerSet();
        IntegerSet tab3 = new IntegerSet();
        
      
        tab1.insertElement(1);
        tab1.insertElement(2);
        tab1.insertElement(3);
        tab1.insertElement(4);
        
        tab2.insertElement(3);
        tab2.insertElement(4);
        tab2.insertElement(5);
        tab2.insertElement(6);
        
        tab3.insertElement(3);
        tab3.insertElement(4);
        tab3.insertElement(5);
        tab3.insertElement(6);
        
        IntegerSet tab4 = IntegerSet.union(tab1.tab, tab2.tab);
        IntegerSet tab5 = IntegerSet.intersection(tab1.tab, tab2.tab);
        
        System.out.println("Union: " + tab4);
        System.out.println("Intersection: " + tab5);
        System.out.println(tab1.equals(tab2));
        System.out.println(tab2.equals(tab3));
        
        System.out.println("przed usunieciem: " + tab1);
        tab1.deleteElement(2);
        System.out.println("po usunieciu: " + tab1);
       
    }
}
