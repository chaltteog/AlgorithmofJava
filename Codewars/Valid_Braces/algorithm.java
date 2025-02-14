import java.util.HashMap;
import java.util.Stack;

class Kata {
    public static boolean isValid(String braces) {Stack<String> stk = new Stack<>();
        HashMap<String, String> m = new HashMap<String, String>() {{ 
            put("]", "[");
            put("}", "{");
            put(")", "("); 
        }};

        for (String s : braces.split("")) {
            if (!s.matches("[\\]\\}\\)]") || (stk.empty()) ) {
                stk.push(s);
                continue;
            }

            if (!stk.peek().equals(m.get(s))) {
                break;
            };

            stk.pop();
        }
        
        return stk.empty();
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.isValid("()"));
        System.out.println(Kata.isValid("(){}[]"));
        System.out.println(Kata.isValid("([{}])"));

        System.out.println(Kata.isValid("(}"));
        System.out.println(Kata.isValid("[(])"));
        System.out.println(Kata.isValid("[({})](]"));
    }
} 