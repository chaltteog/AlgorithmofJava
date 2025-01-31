import java.util.stream.Collectors;
import java.util.stream.Stream;

class Kata {
    public static String pigIt(String str) {
        return Stream.of(str.split(" "))
                     .map(word -> word.matches("(?![A-Za-z]).") ? word : word.substring(1).concat(word.substring(0, 1)).concat("ay"))
                     .collect(Collectors.joining(" "));
    }

    /* Best Answer
     * return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
     */
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.pigIt("Pig latin is cool"));
        System.out.println(Kata.pigIt("Hello world !"));
    }
} 