class Kata {
    public static String solution(String str) {
        return new StringBuffer(str).reverse().toString();
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.solution("dlrow"));
    }
} 