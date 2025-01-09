import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Kata {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        return Integer.parseInt(binary.stream().map(String::valueOf).collect(Collectors.joining("")), 2);
    }
}

public class algorithm {
    public static void main(String[] args) {
        System.out.println(Kata.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,0,0,1))));
        System.out.println(Kata.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,1,0,1))));
    }
}