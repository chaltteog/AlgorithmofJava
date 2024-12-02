import java.util.stream.IntStream;

class Kata {
    public static int Solution(int number) {
        IntStream sum = IntStream.range(1, number).filter(n -> (n % 3 == 0) || (n % 5 == 0));
        return sum.sum();
    }
}

/* Best Answer */
// class Kata {
//     public static int Solution(int number) {
//         return IntStream.range(3, number).filter(n -> (n % 3 == 0) || (n % 5 == 0)).sum();
//     }
// }

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.Solution(10));
    }
}