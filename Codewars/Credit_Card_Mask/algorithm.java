import java.util.stream.Collectors;

class Kata {
    public static String maskify(String str) {
        int len = str.length();
        return len < 5 ? str : str.substring(0, len - 4)
                                  .chars().mapToObj(i -> String.valueOf((char) i))
                                  .map(c -> "#")
                                  .collect(Collectors.joining("")) + str
                                  .substring(len - 4, len);
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.maskify("1This"));
        System.out.println(Kata.maskify("Skippy"));
    }
}