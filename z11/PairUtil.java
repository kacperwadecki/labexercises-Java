package lab11;

public class PairUtil{
    public static <T> Pair<T> swap(Pair p){
        p.swap();
        Pair p1 = p;
        return p1;
    }
}
