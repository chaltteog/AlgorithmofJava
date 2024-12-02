import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Kata { 
    public static String spinWords(String sentence) {
        List<String> lst = Arrays.asList(sentence.split(" "));

        return lst.stream()
                        .map(word -> (word.length() >= 5) ? new StringBuffer(word).reverse() : word)
                        .collect(Collectors.joining(" "));
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.spinWords("abracadabra"));
        System.out.println(Kata.spinWords(""));
        System.out.println(Kata.spinWords("pear treee"));
    }
}