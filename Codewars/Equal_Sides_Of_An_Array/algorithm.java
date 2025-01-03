import java.util.Arrays;
import java.util.stream.IntStream;

class Kata {
    public static int findEvenIndex(int[] arr) {
        int[] res = IntStream.range(0, arr.length).filter(i -> Arrays.stream(Arrays.copyOf(arr, i)).sum() == Arrays.stream(Arrays.copyOfRange(arr, i + 1, arr.length)).sum()).toArray();
        return res.length > 0 ? res[0] : -1;
    }
}

/* Best Answer */
// public static int findEvenIndex(int[] arr) {
//     return IntStream.range(0, arr.length)
//             .filter(n -> IntStream.of(arr).limit(n).sum() == IntStream.of(arr).skip(n + 1).sum())
//             .findFirst().orElse(-1);
// }

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.findEvenIndex(new int[] {1,2,3,4,3,2,1}));
        System.out.println(Kata.findEvenIndex(new int[] {1,100,50,-51,1,1}));
        System.out.println(Kata.findEvenIndex(new int[] {20,10,-80,10,10,15,35}));
        System.out.println(Kata.findEvenIndex(new int[] {-8505, -5130, 1926, -9026}));
    }
}