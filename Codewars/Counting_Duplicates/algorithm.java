import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

class Kata {
    public static int duplicateCount(String text) {
        List<Integer> lst = new ArrayList<Integer>(
            text.toLowerCase().chars().boxed()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.collectingAndThen(Collectors.counting(), Long::intValue)))
            .values());

        return (int) lst.stream().filter(n -> n > 1).count();
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.duplicateCount("abcde"));
        System.out.println(Kata.duplicateCount("abcdea"));
        System.out.println(Kata.duplicateCount("aA11"));
        System.out.println(Kata.duplicateCount("abcdeaBReturnsTwo"));
        System.out.println(Kata.duplicateCount("abcdeaBReturnsTwo"));  
    }
}