import java.util.stream.LongStream;

class Kata {
    public static long sumMul(int n, int m) {
        if (n <= 0 | m <= 0) {
            throw new IllegalArgumentException("");
        }

        return LongStream.range(n, m).filter(x -> x % n == 0).sum();
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.sumMul(5, 20));
        System.out.println(Kata.sumMul(2, 9));
        System.out.println(Kata.sumMul(0, 0));
    }
}