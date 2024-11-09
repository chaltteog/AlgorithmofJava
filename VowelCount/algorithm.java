// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;
// import java.util.stream.Collectors;

class Kata {
    // === Worst Answer ===
    // public static int getCount(String str) {
    //     String Vowel = "aeiou";

    //     List<String> sList = str.chars().mapToObj(i -> String.valueOf((char) i)).toList();
    //     int n = sList.size() != 0 ? Long.valueOf(sList.stream().filter(alphabet -> Vowel.indexOf(alphabet) != -1).count()).intValue() : 0;

    //     return n;
    //   }

    public static int getCount(String str) {
        return (int) str.chars().filter(c -> "aeiou".indexOf(c) >= 0).count();
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.getCount("abracadabra"));
        System.out.println(Kata.getCount(""));
        System.out.println(Kata.getCount("pear tree"));
        System.out.println(Kata.getCount("o a kak ushakov lil vo kashu kakao"));
        System.out.println(Kata.getCount(" tmkoprxavuuxgkbvbsuanfcyexzkfjfrr kiundizwcvctonuqcquyydgpxxuvzewdxewjof ojwacdwpzwoxwkiavu cqulxma"));
    }
}