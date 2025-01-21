import java.util.Arrays;

class Kata {
    public static int stray(int[] numbers) {
        return Arrays.stream(numbers).distinct().filter(x -> Arrays.stream(numbers).filter(y -> x == y).count() == 1).toArray()[0];
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.stray(new int [] {1, 1, 2}));
        System.out.println(Kata.stray(new int [] {17, 17, 3, 17, 17, 17, 17}));
    }
} 