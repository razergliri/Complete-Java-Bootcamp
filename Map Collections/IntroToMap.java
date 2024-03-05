import java.util.HashMap;
import java.util.Map;

public class IntroToMap{
    public static void main(String[] args) {
        Map<String, Double> fruitPrices = new HashMap<>();

        fruitPrices.put("Melon", 1.99);
        fruitPrices.put("Mango", 0.99);
        fruitPrices.put("Peach", 1.99);
        fruitPrices.put("Lemon", 2.99);
        fruitPrices.put("Rainbow Orange", 9.99);

        System.out.println("~~~WELCOME TO THE FRUIT JUICYYY STAND!!~~~");
        System.out.println("The price of Melon is: " + fruitPrices.get("Melon"));
        System.out.println("The price of Mango is: " + fruitPrices.get("Mango"));
        System.out.println("The price of Peach is: " + fruitPrices.get("Peach"));
        System.out.println("The price of Lemon is: " + fruitPrices.get("Lemon"));
        System.out.println("The price of the Legendary Rainbow Orange is: " + fruitPrices.get("Rainbow Orange"));


    }
}