import java.util.Arrays;
import java.util.stream.Collectors;

class Kata { 
    public static String toJadenCase(String phrase) {
        if (phrase == null || phrase.isBlank()) {
            return null;
        }

        return Arrays.stream(phrase.split(" "))
                     .map(word -> Character.toUpperCase(word.charAt(0)) + word.substring(1, word.length()))
                     .collect(Collectors.joining(" "));
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.toJadenCase(null));
    }
}