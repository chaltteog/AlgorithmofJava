import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

class Kata {
    public static List<String> number(List<String> lines) {
        return IntStream.range(1, lines.size() + 1).mapToObj(n -> n + ": " + lines.get(n - 1)).toList();
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.number(Arrays.asList("a", "b", "c")));
        System.out.println(Kata.number(Arrays.asList("", "", "", "", "")));
        System.out.println(Kata.number(Arrays.asList()));
    }
}