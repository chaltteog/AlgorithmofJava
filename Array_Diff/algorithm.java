import java.util.Arrays;

class Kata {
    public static int[] arrayDiff(int[] a, int[] b) {
        for (int n : b) {
            a = Arrays.stream(a).filter(i -> i != n).toArray();
        }

        return a;
    }

    /*
     * public static int[] arrayDiff(int[] a, int[] b) {
     *  return IntStream.of(a).filter(x -> IntStream.of(b).noneMatch(y -> y == x)).toArray();
     * }
     */
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Kata.arrayDiff(new int [] {1,2}, new int[] {1})));
    }
} 