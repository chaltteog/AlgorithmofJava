import java.util.Arrays;
import java.util.stream.IntStream;

class Kata {
    public static int GetSum(int a, int b) {
        int[] arr = {a, b};
        Arrays.sort(arr);

        return a == b ? a : IntStream.range(arr[0], ++arr[1]).sum();
    }
}

/* Best Answer
 * return (a + b) * (Math.abs(a - b) + 1) / 2;
 */

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.GetSum(0, -1));
        System.out.println(Kata.GetSum(1, 2));
    }
}