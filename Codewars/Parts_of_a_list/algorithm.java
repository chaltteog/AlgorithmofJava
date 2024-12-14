import java.util.Arrays;

class Kata {
    public static String[][] partlist(String[] arr) {
        String[][] ret = new String[arr.length - 1][2];

        for (int n = 1; n < arr.length; n++) {
            ret[n - 1][0] = String.join(" ", Arrays.copyOfRange(arr, 0, n));
            ret[n - 1][1] = String.join(" ", Arrays.copyOfRange(arr, n, arr.length));
        } 

        return ret;
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString((Kata.partlist(new String[] {"cdIw", "tzIy", "xDu", "rThG"}))));
        System.out.println(Arrays.deepToString((Kata.partlist(new String[] {"I", "wish", "I", "hadn't", "come"}))));
    }
}