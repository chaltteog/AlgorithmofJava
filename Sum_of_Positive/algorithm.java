import java.util.stream.IntStream;

class Kata {
    public static int sum(int[] arr){
        return IntStream.of(arr).filter(n -> n > 0).sum();
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.sum(new int[]{1,2,3,4,5}));
        System.out.println(Kata.sum(new int[]{-1,2,3,4,-5}));
        System.out.println(Kata.sum(new int[]{-1,-2,-3,-4,-5}));
        System.out.println(Kata.sum(new int[]{}));
    }
} 