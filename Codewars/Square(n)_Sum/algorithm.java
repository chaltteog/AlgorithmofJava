import java.util.stream.IntStream;

class Kata { 
    public static int squareSum(int[] n) {
        return IntStream.of(n).reduce(0, (x, y) -> x + y * y);
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.squareSum(new int[] {1,2,2}));
        System.out.println(Kata.squareSum(new int[] {1,2}));
        System.out.println(Kata.squareSum(new int[] {5,-3,4}));
        System.out.println(Kata.squareSum(new int[] {}));
    }
}