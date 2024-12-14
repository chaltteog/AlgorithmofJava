import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

class Kata {
    public static String splitInParts(String s, int partLength) {
        AtomicInteger idx = new AtomicInteger();
        idx.set(1);

        return s.chars().mapToObj(i -> String.valueOf((char) i))
                 .map(c -> idx.getAndIncrement() % partLength == 0 ? c + " " : c)
                 .collect(Collectors.joining("")).trim();
    }
}

//-- Best Answer --//
// return s.replaceAll(".{" + partLength + "}", "$0 ").trim();

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.splitInParts("HelloKata", 1));
        System.out.println(Kata.splitInParts("HelloKata", 3));
        System.out.println(Kata.splitInParts("HelloKata", 9));        
    }
}