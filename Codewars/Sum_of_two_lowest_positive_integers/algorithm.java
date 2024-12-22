import java.util.stream.LongStream;

class Kata {
    public static long sumTwoSmallestNumbers(long[] numbers) {
        long[] arr = LongStream.of(numbers).sorted().toArray();
        return arr[0] + arr[1];
    }
}

/* Best Answer
 * return Arrays.stream(numbers)
 *     .sorted()
 *     .limit(2)
 *     .sum();
 */

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.sumTwoSmallestNumbers(new long[]{ 5,  8, 12, 19, 22}));
        System.out.println(Kata.sumTwoSmallestNumbers(new long[]{15, 28,  4,  2, 43}));
        System.out.println(Kata.sumTwoSmallestNumbers(new long[]{23, 71, 33, 82,  1}));
    }
}