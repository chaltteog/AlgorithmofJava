import java.util.stream.Collectors;

class Kata {
    public static String encode(String word){
        return word.chars().map(Character::toLowerCase).mapToObj(i -> String.valueOf((char) i))
                    .map(x -> word.chars().map(Character::toLowerCase).filter(y -> x.charAt(0) == y).count() == 1 ? "(" : ")")
                    .collect(Collectors.joining(""));
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.encode("abcde"));
        System.out.println(Kata.encode("abcdea"));
        System.out.println(Kata.encode("aA11"));
        System.out.println(Kata.encode("abcdeaBReturnsTwo"));
        System.out.println(Kata.encode("abcdeaBReturnsTwo"));  
    }
}