import java.util.stream.Collectors;

class Kata { 
    public static String longest (String s1, String s2) {
        String s = s1 + s2;
        return s.chars().distinct().sorted().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining(""));
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.longest("aretheyhere", "yestheyarehere"));
        System.out.println(Kata.longest("loopingisfunbutdangerous", "lessdangerousthancoding"));
        System.out.println(Kata.longest("inmanylanguages", "theresapairoffunctions"));
        System.out.println(Kata.longest("xyaabbbccccdefww", "xxxxyyyyabklmopq"));
        System.out.println(Kata.longest("abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz"));
    }
}