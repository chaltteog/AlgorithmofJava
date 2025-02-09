import java.util.stream.Collectors;
import java.util.stream.Stream;

class Kata {
    public static String rgb(int r, int g, int b) {
        return Stream.of(r, g, b).map(x -> x < 0 ? 0 : x)
                                 .map(x -> x < 255 ? x : 255)
                                 .map(h -> String.format("%02X", h))
                                 .collect(Collectors.joining(""));
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.rgb(0, 0, 0));
        System.out.println(Kata.rgb(-20, 275, 125));
        System.out.println(Kata.rgb(254, 253, 252));
    }
} 