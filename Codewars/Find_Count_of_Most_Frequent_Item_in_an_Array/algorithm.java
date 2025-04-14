import java.util.stream.IntStream;

class Kata {
    public static int mostFrequentItemCount(int[] collection) {
        return collection.length == 0 ? 0 : IntStream.of(collection).distinct().map(n -> (int) IntStream.of(collection).filter(x -> x == n).count()).max().getAsInt();
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.mostFrequentItemCount(new int[] {3, -1, -1}));
        System.out.println(Kata.mostFrequentItemCount(new int[] {}));
    }
}