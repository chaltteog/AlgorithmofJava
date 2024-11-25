import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

class Kata { 
    public static int sortDesc(final int num) {
        return num == 0 ? 0 : Integer.parseInt(
            Arrays.stream(String.valueOf(num).split(""))
                  .mapToInt(Integer::valueOf).boxed()
                  .sorted(Collections.reverseOrder()).map(String::valueOf)
                  .collect(Collectors.joining())
        );
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.sortDesc(123456789));
    }
}