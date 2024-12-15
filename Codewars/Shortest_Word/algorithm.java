import java.util.Arrays;

class Kata { 
    public static int findShort(String s) {
        return Arrays.stream(s.split(" ")).reduce((x, y) -> x.length() > y.length() ? y : x).get().length();
    }
}

/* Best Answer
 * return Stream.of(s.split(" "))
 *        .mapToInt(String::length)
 *        .min()
 *        .getAsInt(); 
 */

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.findShort("bitcoin take over the world maybe who knows perhaps"));
        System.out.println(Kata.findShort("turns out random test cases are easier than writing out basic ones"));
        System.out.println(Kata.findShort("Let's travel abroad shall we"));
    }
}