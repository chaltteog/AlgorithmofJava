class Kata {
    public static String capitalize(String s, int[] ind){
        char[] c = s.toCharArray();

        for (int n : ind) {
            if (n < s.length()) {
                c[n] = Character.toUpperCase(c[n]);
            }
        }

        return new String(c);
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.capitalize("abcdef", new int[]{1,2,5}));
        System.out.println(Kata.capitalize("codewars", new int[]{1,3,5,50}));
    }
} 