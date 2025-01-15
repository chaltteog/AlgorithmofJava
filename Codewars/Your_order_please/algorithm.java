import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.Arrays;

class Kata {
    public static String order(String words) {
        String[] arr = words.split(" ");
        return IntStream.range(0, arr.length)
                        .mapToObj(n -> Arrays.stream(arr)
                                             .filter(w -> w.indexOf((n + 1) + "") != -1)
                                             .collect(Collectors.joining("")))
                        .collect(Collectors.joining(" "));
      }
}

/* Best Answer
 *  public static String order(String words) {
 *      return Arrays.stream(words.split(" "))
 *                   .sorted(Comparator.comparing(s -> Integer.valueOf(s.replaceAll("\\D", ""))))
 *                   .reduce((a, b) -> a + " " + b).get();
 *  }
 */

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.order("Thi1s is2 3a T4est"));
        System.out.println(Kata.order("4of Fo1r pe6ople g3ood th5e the2"));
    }
}