import java.util.stream.Collectors;
import java.util.stream.LongStream;

class Kata {
    public static String arithmeticSequenceElements(int a, int d, long n) {
        return LongStream.range(0, n).map(x -> x = a + x * d).mapToObj(String::valueOf).collect(Collectors.joining(", "));
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.arithmeticSequenceElements(1, 1, 10));
        System.out.println(Kata.arithmeticSequenceElements(1, 2, 5));
        System.out.println(Kata.arithmeticSequenceElements(1, 0, 5));
        System.out.println(Kata.arithmeticSequenceElements(1, -3, 10));
        System.out.println(Kata.arithmeticSequenceElements(100, -10, 10));
    }
}