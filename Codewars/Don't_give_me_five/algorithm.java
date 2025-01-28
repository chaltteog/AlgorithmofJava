import java.util.stream.IntStream;

class Kata {
    public static int dontGiveMeFive(int start, int end) {
        return Long.valueOf(IntStream.range(start, end + 1).filter(n -> String.valueOf(n).indexOf("5") == -1).count()).intValue();
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.dontGiveMeFive(1, 9));
        System.out.println(Kata.dontGiveMeFive(4, 17));
    }
}