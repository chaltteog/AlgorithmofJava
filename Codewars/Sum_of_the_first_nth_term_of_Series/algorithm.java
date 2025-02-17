import java.util.stream.IntStream;

class Kata {
    public static String seriesSum(int n) {
        return String.format("%.2f", IntStream.range(0, n).mapToDouble(x -> 1.0 / (1 + x * 3)).sum());
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.seriesSum(1));
        System.out.println(Kata.seriesSum(2));
        System.out.println(Kata.seriesSum(5));
        System.out.println(Kata.seriesSum(9));
        System.out.println(Kata.seriesSum(15));
    }
}