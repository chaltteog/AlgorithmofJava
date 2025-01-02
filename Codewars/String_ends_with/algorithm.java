class Kata {
    public static boolean solution(String str, String ending) {
        return str.length() < ending.length() ? false : str.substring(str.length() - ending.length(), str.length()).equals(ending);
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.solution("abc", "bc"));
        System.out.println(Kata.solution("abc", "d"));
    }
}