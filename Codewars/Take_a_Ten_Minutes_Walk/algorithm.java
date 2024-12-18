import java.util.Collections;
import java.util.List;

class Kata { 
    public static boolean isValid(char[] walk) {
        if (walk.length != 10) {
            return false;
        }
        
        List<String> cmd = new String(walk).chars().mapToObj(c -> String.valueOf((char) c)).toList();
        int x = Collections.frequency(cmd, "n") + Collections.frequency(cmd, "s") * -1;
        int y = Collections.frequency(cmd, "w") + Collections.frequency(cmd, "e") * -1;

        return (x == 0) && (y == 0) ? true : false;
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.isValid(new char[] {'n','s','n','s','n','s','n','s','n','n'}));
        System.out.println(Kata.isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}));
    }
}