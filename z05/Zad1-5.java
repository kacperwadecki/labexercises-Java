import java.util.ArrayList;


public class Zad1-5 {
    public static void show(ArrayList<Integer> list){
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
    
    // Zadanie 1
    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        result.addAll(a);
        result.addAll(b);
        
        return result;
    }
    
    // Zadanie 2
    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        double bigger = Double.NEGATIVE_INFINITY;
        if(a.size() > b.size()) bigger = a.size();
        else bigger = b.size();
        
        for(int i=0, a_index=0, b_index=0; i<bigger; i++){
            if(a_index < a.size()){
                result.add(a.get(a_index));
                a_index++;
            }
            if(b_index < b.size()){
                result.add(b.get(b_index));
                b_index++;
            }
        }
        
        return result;
    }
    
    // Zadanie 3
    
    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        for(int i=0, a_index=0, b_index=0; i < a.size() + b.size(); i++){
            if(a.get(a_index) > b.get(b_index)){
                result.add(b.get(b_index));
                b_index++;
                if(b_index >= b.size()){
                    for(int j=a_index; j<a.size(); j++){
                        result.add(a.get(j));
                    }
                    return result;
                }
            }
            else{
                result.add(a.get(a_index));
                a_index++;
                if(a_index >= a.size()){
                    for(int j=b_index; j<b.size(); j++){
                        result.add(b.get(j));
                    }
                    return result;
                }
            }
        }
        return result;
    }
    
    // Zadanie 4
    
    public static ArrayList<Integer> reversed(ArrayList<Integer> a){
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        for(int i=a.size() - 1; i>=0; i--){
            result.add(a.get(i));
        }
        
        return result;
    }
    
    // Zadanie 4 check 
    
    public static boolean reversed_check(ArrayList<Integer> reversed, ArrayList<Integer> notreversed){
        if(reversed.size() == notreversed.size()){
            for(int i=0, j=notreversed.size()-1; i<reversed.size(); i++, j--){
                if(reversed.get(i) != notreversed.get(j)){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    // Zadanie 5
    
    public static void reverse(ArrayList<Integer> a){
        int tmp1 = 0;
        ArrayList<Integer> coppyA = new ArrayList<Integer>();
        coppyA.addAll(a);
        
        for(int i=0, j=a.size()-1; i < a.size()/2; i++, j--){
            tmp1 = coppyA.get(i);
            a.set(i, a.get(j));
            a.set(j, tmp1);
        }
    }
    
    // Zadanie 5 check
    
    public static boolean reverse_check(ArrayList<Integer> reversed, ArrayList<Integer> notreversed){
        if(reversed.size() == notreversed.size()){
            for(int i=0, j=notreversed.size()-1; i<reversed.size(); i++, j--){
                if(reversed.get(i) != notreversed.get(j)){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public static void main(String[] args){
        // Zadanie 1
        
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        
        a.add(1);
        a.add(4);
        a.add(9);
        a.add(16);
        
        b.add(4);
        b.add(7);
        b.add(8);
        b.add(9);
        b.add(11);
        
        ArrayList<Integer> appendList = new ArrayList<Integer>();
        appendList = append(a,b);
        
        System.out.println("Zadanie 1");
        show(appendList);
        
        // Zadanie 2
        
        ArrayList<Integer> mergeList = new ArrayList<Integer>();
        mergeList = merge(a,b);
        
        System.out.println("Zadanie 2");
        show(mergeList);
        
        // Zadanie 3;
        
        ArrayList<Integer> mergeSortedList = new ArrayList<Integer>();
        mergeSortedList = mergeSorted(a, b);
        
        System.out.println("Zadanie 3");
        show(mergeSortedList);
        
        // Zadanie 4
        
        ArrayList<Integer> reversedList = new ArrayList<Integer>();
        reversedList = reversed(b);
        
        System.out.println("Zadanie 4");
        show(reversedList);
        
        // Zadanie 4 check
        
        System.out.println("Zadanie 4 check ");
        System.out.println(reversed_check(reversedList, b));
        
        // Zadanie 5 
        
        System.out.println("Zadanie 5");
        ArrayList<Integer> notreversedList = new ArrayList<Integer>();
        notreversedList.addAll(b);
        reverse(b);
        
        show(b);
        
        // Zadanie 5 check
        
        System.out.println("Zadanie 5 check");
        System.out.println(reverse_check(b, notreversedList));
    }
}
