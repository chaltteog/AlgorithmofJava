import java.util.HashMap;

class Kata {
    public static int find(int[] integers) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int odd = 0;

        for (int i:integers) {
            if (i % 2 == 0) {
                map.put(0, i);
                continue;
            }            

            map.put(1, i);
            odd++;
        }

        return (odd != 1) ? map.get(0) : map.get(1);
    }
}

/* Best Answer */
// public class FindOutlier{
//     static int find(int[] integers) {
//         int[] array = Arrays.stream(integers).filter(i -> i % 2 == 0).toArray();	
//         return array.length == 1 ? array[0] : Arrays.stream(integers).filter(i -> i % 2 != 0).findAny().getAsInt();
//     }
// }

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.find(new int[] {2, 6, 8, -10, 3}));
        System.out.println(Kata.find(new int[] {206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781}));
        System.out.println(Kata.find(new int[] {Integer.MAX_VALUE, 0, 1}));
    }
} 