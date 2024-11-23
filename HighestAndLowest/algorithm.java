import java.util.Arrays;
import java.util.stream.IntStream;

class Kata { 
    public static String highAndLow(String numbers) {
        String[] n = numbers.split(" ");

        IntStream min = Arrays.stream(n).mapToInt(Integer::parseInt);
        IntStream max = Arrays.stream(n).mapToInt(Integer::parseInt);

        return String.format("%d %d", max.max().getAsInt(), min.min().getAsInt());
    }
}
/* Best Answer
 * class Kata {
 *     public static String highAndLow(String numbers) {
 *         List<Integer> nums = Arrays.stream(numbers.split(" ")).map(Integer::parseInt).toList();
 *         return "%s %s".formatted(Collections.max(nums), Collections.min(nums));
 *     }
 * }
*/

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
}