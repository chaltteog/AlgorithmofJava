class Kata { 
    public static boolean getXO (String str) {
        return str.toLowerCase().chars()
                  .mapToObj(c -> String.valueOf((char) c))
                  .filter(c -> "xo".indexOf(c) != -1)
                  .mapToInt(c -> "x".equals(c) ? -1 : 1)
                  .sum() == 0;
    }
}

// \---- Best Answer ----\
// public static boolean getXO (String str) {
//     str = str.toLowerCase();
//     return str.replace("o","").length() == str.replace("x","").length();
// }

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.getXO("ooxx"));
        System.out.println(Kata.getXO("xooxx"));
        System.out.println(Kata.getXO("ooxXm"));
        System.out.println(Kata.getXO("zpzpzpp"));
        System.out.println(Kata.getXO("zzoo"));
    }
}