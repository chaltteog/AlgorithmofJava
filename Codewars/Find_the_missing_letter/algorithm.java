import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Kata {
    public static char findMissingLetter(char[] array) {
        List<Integer> lst = new String(array).chars().boxed().collect(Collectors.toList());
        return (char) IntStream.range(lst.get(0), lst.get(lst.size() - 1) + 1).filter(x -> lst.indexOf(Integer.valueOf(x)) == -1).sum();
    }

    /* Best Answer
     *     int index = IntStream.range(0, array.length-1).filter(i -> array[i] != array[i+1]-1).findFirst().getAsInt();
     *     return (char)(array[index] + 1);
     */
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.findMissingLetter(new char[] {'a','b','c','d','f' }));
        System.out.println(Kata.findMissingLetter(new char[] { 'O','Q','R','S' }));
    }
}