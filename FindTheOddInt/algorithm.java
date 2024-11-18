import java.util.HashMap;
import java.util.Map;

class Kata {
    public static int findIt(int[] a) {
        HashMap<Integer, Integer> hMap = new HashMap<>();
        
        for (int i: a) {
            if (hMap.get(i) == null) {
                hMap.put(i, 1);
                continue;
            }

            hMap.put(i, 1 + hMap.get(i));
        }

        return hMap.entrySet().stream().filter(n -> n.getValue() % 2 == 1).map(Map.Entry::getKey).findFirst().get();
    }
}

/* Best
 * public static int findIt(int[] arr) { 
 *  return stream(arr).reduce(0, (x, y) -> x ^ y);
 * }
 */

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.findIt(new int[] {20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));
        System.out.println(Kata.findIt(new int[] {10}));
        System.out.println(Kata.findIt(new int[] {1,1,2,-2,5,2,4,4,-1,-2,5}));
        System.out.println(Kata.findIt(new int[] {1,1,1,1,1,1,10,1,1,1,1}));
    }
} 