import java.util.Arrays;

class Kata { 
    public static String oddOrEven (int[] array) {
        return Arrays.stream(array).sum() % 2 == 0 ? "even" : "odd"; 
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.oddOrEven(new int[] {2, 5, 34, 6}));
    }
}