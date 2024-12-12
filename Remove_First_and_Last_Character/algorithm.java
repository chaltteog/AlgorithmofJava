class Kata {
    public static String remove(String str) {
        return str.replaceAll("^(.)", "").replaceAll("(.)$", "");
    }
}

// SubString으로 하는것이 아닌 정규식을 활용하고 싶어 위 처럼 풀음
/* Best Answer
 * return str.replaceAll("^.|.$", "");
*/

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.remove("abcdef"));
        System.out.println(Kata.remove("LovePizza"));
    }
}