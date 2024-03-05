import java.util.Map;
import java.util.TreeMap;

public class IntroToTreeMap {
    public static void main(String[] args) {
        Map<String, Double> treeMap = new TreeMap<>();

        treeMap.put("Melon", 1.99);
        treeMap.put("Mango", 3.99);
        treeMap.put("Peach", 1.99);
        treeMap.put("Lemon", 2.99);
        System.out.println("The price of Melon is: " + treeMap.get("Melon"));
        System.out.println("The price of Mango is: " + treeMap.get("Mango"));
        System.out.println("The price of Peach is: " + treeMap.get("Peach"));
        System.out.println("The price of Lemon is: " + treeMap.get("Lemon"));


    }
}
