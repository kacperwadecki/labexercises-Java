package lab11;

public class PairDemo {
    public static void main(String[] args){
        Pair para1 = new Pair<String>("pierwszy", "drugi");

        System.out.println(para1.getFirst());
        System.out.println(para1.getSecond());

        para1.swap();

        System.out.println(para1.getFirst());
        System.out.println(para1.getSecond());
    }
}
