import java.util.stream.Stream;

class Kata {
    public static int digital_root(int n) {
        String[] arr = String.valueOf(n).split("");

        while (arr.length > 1) {
            arr = String.valueOf(Stream.of(arr).map(i -> Integer.valueOf(i)).reduce((x, y) -> x + y).get()).split("");
        }

        return Integer.valueOf(arr[0]);
    }
}

/* Best Answer
 * public static int digital_root(int n) {
 *     return (n != 0 && n%9 == 0) ? 9 : n % 9;
 * }
 */

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.digital_root(16));
        System.out.println(Kata.digital_root(456));
        System.out.println(456 % 9);
    }
}