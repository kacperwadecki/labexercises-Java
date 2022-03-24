package lab11;

public class PairUtilDemo {
    public static void main(String[] args){
        Pair p1 = new Pair<String>("jeden", "dwa");

        System.out.println(p1.getFirst());
        System.out.println(p1.getSecond());

        Pair p2 = PairUtil.swap(p1);

        System.out.println(p2.getFirst());
        System.out.println(p2.getSecond());

    }
}
