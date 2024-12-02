import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Kata {
    public static String createPhoneNumber(int[] numbers) {
        String s = IntStream.of(numbers)
                            .mapToObj(String::valueOf)
                            .collect(Collectors.joining());

        return s.replaceAll("(\\d{2,3})(\\d{3,4})(\\d{4})", "($1) $2-$3");
    }
}

/* Best Answer
 * public static String createPhoneNumber(int[] numbers) {
 *     return String.format("(%d%d%d) %d%d%d-%d%d%d%d", java.util.stream.IntStream.of(numbers).boxed().toArray());
 * }
*/

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
}