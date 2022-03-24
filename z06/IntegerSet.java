package lab06;


public class IntegerSet{
    public boolean[] tab = new boolean[100];
    
    public IntegerSet(){
        for(int i=0; i<100; i++){
            tab[i] = false;
        }
    }
    
    static IntegerSet union(boolean[] tab1, boolean[] tab2){
        IntegerSet result = new IntegerSet();
        
        for(int i=0; i<100; i++){
            if(tab1[i] || tab2[i]){
                result.tab[i] = true;
            }
        }
        return result;
    }
    
    static IntegerSet intersection(boolean[] tab1, boolean[] tab2){
        IntegerSet result = new IntegerSet();
        
        for(int i=0; i<100; i++){
            if(tab1[i] && tab2[i]){
                result.tab[i] = true;
            }
        }
        return result;
    }
    
    public void insertElement(int x){
        if(x < 1 || x > 100){
            return;
        }
        this.tab[x - 1] = true;
    }
    
    public void deleteElement(int x){
        if(x < 1 || x > 100){
            return;
        }
        this.tab[x - 1] = false;
    }
    
    public String toString(){
        String result = new String();
        for(int i=0; i<100; i++){
            if(this.tab[i]){
                result += i + 1 + " ";
            }
        }
        return result;
    }
    
    public boolean equals(IntegerSet tab1){
        for(int i=0; i<100; i++){
            if(this.tab[i] != tab1.tab[i]){
                return false;
            }
        }
        return true;
    }
}