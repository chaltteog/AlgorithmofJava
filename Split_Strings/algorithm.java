import java.util.ArrayList;
import java.util.Arrays;

class Kata {
    public static String[] solution(String s) {
        // String[] temp = s.chars().mapToObj(i -> String.valueOf((char) i))
        //                            .toArray(String[]::new);
        ArrayList<String> lst = new ArrayList<String>();
        int max = s.length() - 1;

        for (int i = 0; i < max; i += 2) {
            lst.add(Character.toString(s.charAt(i)) + s.charAt(i + 1)); 
        }

        if (max % 2 == 0) {
           lst.add(Character.toString(s.charAt(max)) + "_"); 
        }

        return lst.toArray(new String[0]);
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Kata.solution("abcdef")));
        System.out.println(Arrays.toString(Kata.solution("LovePizza")));
    }
}