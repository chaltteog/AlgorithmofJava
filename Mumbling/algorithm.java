import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

class Kata { 
    public static String accum(String s) {
        AtomicInteger idx = new AtomicInteger();
        return s.chars().mapToObj(c -> String.valueOf((char) c))
                        .map(c -> c.toUpperCase() + c.toLowerCase().repeat(idx.getAndIncrement()))
                        .collect(Collectors.joining("-"));
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.accum("abcd"));
        System.out.println(Kata.accum("NyffsGeyylB"));
        System.out.println(Kata.accum("ZpglnRxqenU"));
        System.out.println(Kata.accum("EvidjUnokmM"));
    }
}