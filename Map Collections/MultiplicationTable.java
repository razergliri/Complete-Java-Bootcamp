import java.util.Map;
import java.util.TreeMap;

public class MultiplicationTable {
    public static void main(String[] args) {
        Map<Integer, Integer> tree = new TreeMap<>();
        int multiplier = 5;
        tree.put(1, multiplier * 1);
        tree.put(2, multiplier * 2);
        tree.put(3, multiplier * 3);
        tree.put(4, multiplier * 4);
        tree.put(5, multiplier * 5);
        tree.put(6, multiplier * 6);
        tree.put(7, multiplier * 7);
        tree.put(8, multiplier * 8);
        tree.put(9, multiplier * 9);
        tree.put(10, multiplier * 10);
    }
}
