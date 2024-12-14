import java.util.stream.Collectors;
import java.util.stream.Stream;

class Kata { 
    public static int squareDigits(int n) {
        return Integer.parseInt(
            Stream.of(String.valueOf(n).split(""))
                  .map(i -> String.valueOf((int) Math.pow(Integer.parseInt(i), 2)))
                  .collect(Collectors.joining())
        );
    }

    /* Best Answer
     * public int squareDigits(int n) {
     *     return Integer.parseInt(String.valueOf(n)
     *                                   .chars()
     *                                   .map(i -> Integer.parseInt(String.valueOf((char) i)))
     *                                   .map(i -> i * i)
     *                                   .mapToObj(String::valueOf)
     *                                   .collect(Collectors.joining("")));
     * }
     */
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.squareDigits(9119));
    }
}