import java.util.*;

class Kata {
    public static List<String> theGame(List<String> words) {
        List<String> res = new ArrayList<>();

        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).isEmpty()) {
                return res;
            }

            if (i == 0) {
                res.add(words.get(i));
                continue;
            }

            String prev = words.get(i - 1);

            if (prev.charAt(prev.length() - 1) != words.get(i).charAt(0)) {
                break;
            }

            res.add(words.get(i));
        }

        return res;
    }
}

/** Best Answer **/
/*
 * if (words.isEmpty() || words.get(0).isEmpty())
 *     return new ArrayList<String>();
 *
 * int x = IntStream.range(1, words.size())
 *                  .filter( i -> words.get(i).isEmpty() || words.get(i-1).charAt(words.get(i-1).length()-1) != words.get(i).charAt(0))
 *                  .findFirst()
 *                  .orElse(words.size());
 * 
 * return words.subList(0,x);
 */

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.theGame(Arrays.asList("dog","goose","elephant","tiger","rhino","orc","cat")).toString());
        System.out.println(Kata.theGame(Arrays.asList("dog","goose","tiger","cat", "elephant","rhino","orc")).toString());
        System.out.println(Kata.theGame(Arrays.asList("ab","bc","","cd")).toString());
        System.out.println(Kata.theGame(Arrays.asList("","bc","","cd")).toString());
    }
}