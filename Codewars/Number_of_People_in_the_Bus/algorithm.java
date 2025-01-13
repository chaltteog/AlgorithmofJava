import java.util.ArrayList;

class Kata { 
    public static int countPassengers(ArrayList<int[]> stops) {
        return stops.stream().mapToInt(a -> a[0] - a[1]).sum();
    }
}

public class algorithm {
    public static void main(String[] args) {
        ArrayList<int[]> list = new ArrayList<int[]>();

        list.add(new int[] {10,0});
        list.add(new int[] {3,5});
        list.add(new int[] {2,5});

        System.out.println(Kata.countPassengers(list));
    }
}