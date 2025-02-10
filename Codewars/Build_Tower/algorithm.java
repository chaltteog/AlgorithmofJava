import java.util.Arrays;
import java.util.stream.IntStream;

class Kata {
    public static String[] towerBuilder(int nFloors) {
        int x = nFloors * 2 - 1;

        return IntStream.range(1, nFloors + 1).mapToObj(n -> " ".repeat((x - (n * 2 - 1)) / 2) + "*".repeat(n * 2 - 1) + " ".repeat((x - (n * 2 - 1)) / 2)).toArray(String[]::new);
    }

    /* Best Answer
     * return range(0, f).mapToObj(i -> String.format("%1$s%2$s%1$s", " ".repeat(f - i - 1), "*".repeat(2 * i + 1))).toArray(String[]::new);
     */
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Kata.towerBuilder(1)));
        System.out.println(Arrays.toString(Kata.towerBuilder(2)));
        System.out.println(Arrays.toString(Kata.towerBuilder(3)));
    }
}