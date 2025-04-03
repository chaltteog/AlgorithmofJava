import java.util.*;

class Kata {
    public static int[] digitize(int n) {
        return String.valueOf(n).chars().boxed().mapToInt(c -> c - 48).toArray();
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Kata.digitize(123)));
        System.out.println(Arrays.toString(Kata.digitize(8675309)));
    }
} 