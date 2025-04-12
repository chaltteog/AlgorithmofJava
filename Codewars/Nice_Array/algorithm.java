import java.util.*;
import java.util.stream.Stream;

class Kata {
    public static boolean isNice(Integer[] arr) {
        return arr.length > 0 && Stream.of(arr).filter(n -> Stream.of(arr).filter(x -> (x == n + 1) | (x == n - 1)).count() >= 1).count() == arr.length;
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.isNice(new Integer[]{1,2,3,4,5}));
        System.out.println(Kata.isNice(new Integer[]{5,4,3,2,1}));
        System.out.println(Kata.isNice(new Integer[]{}));
        System.out.println(Kata.isNice(new Integer[]{1}));
        System.out.println(Kata.isNice(new Integer[]{10,10,2,2,3}));
    }
} 