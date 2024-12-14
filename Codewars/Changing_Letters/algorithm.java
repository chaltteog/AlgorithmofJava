import java.util.stream.Collectors;

class Kata {
    public static String swap(String str) {
        return str.chars()
                  .mapToObj(i -> String.valueOf((char) i))
                  .map(c -> "aeiou".indexOf(c) != -1 ? c.toUpperCase() : c)
                  .collect(Collectors.joining(""));
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.swap("HelloWorld!"));
        System.out.println(Kata.swap("SUndAy"));
    }
}