public class Main {
    public static void main(String[] args) {
        Fruit apple1 = new Fruit("Apple");  
        Fruit apple1Ref = new Fruit("Apple");;
        System.out.println(apple1.hashCode()); // Output: 1829164700
        System.out.println(apple1Ref.hashCode()); // Output: 1829164700
        System.out.println(apple1.equals(apple1Ref)); // Output: true

    }
}
