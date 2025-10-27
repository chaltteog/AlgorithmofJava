import java.util.Arrays;
import java.util.stream.IntStream;

class Kata {
    public static int[] capitals(String s) {
        return IntStream.range(0, s.length()).filter(i -> s.charAt(i) <= 90).toArray();
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Kata.capitals("CodEWaRs")));
        System.out.println(Arrays.toString(Kata.capitals("aAbB")));
        System.out.println(Arrays.toString(Kata.capitals("AAA")));
        System.out.println(Arrays.toString(Kata.capitals("abcdefghijklmnopqrstuvwxyz")));
        System.out.println(Arrays.toString(Kata.capitals("ZYXWVUTSRQPONMLKJIHGFEDCBA")));
    }
}