import java.util.HashMap;
import java.util.Map;

public class Inventory {
    public static void main(String[] args) {
        Map<String, Double> inventory = new HashMap<>();
        inventory.put("Mocha", 9.9);
        inventory.put("Papaya", 2.99);
        inventory.put("Bananas", 5.99);
        inventory.put("Kale", 4.99);
        inventory.put("Apples", 1.99);
        inventory.put("Carrot", 1.99);

        inventory.put("Lime", 0.49);
        inventory.put("Toothpaste", 6.99);
        inventory.put("Pocky", 7.99);
        System.out.println("\nWelcome to Java Grocers. What can we help you find?: \n");
        System.out.println("\nWhat is the price of Lime? ");
        System.out.println(inventory.get("Lime"));
        System.out.println("\nWhat is the price of Mocha? ");
        System.out.println(inventory.get("Mocha"));
        System.out.println("\nWhat is the price of Kale? ");
        System.out.println(inventory.get("Kale"));
        System.out.println("\nDo you guys sell Oreo?");
        boolean result = inventory.containsKey("Oreo");
        String response = result ? "Yes!" : "No, sorry!";
        System.out.println(response);
    }
}
