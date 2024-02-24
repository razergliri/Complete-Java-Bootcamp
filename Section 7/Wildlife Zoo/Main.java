public class Main{
    public static void main(String[] args) {
        Mammal mammal1 = new Mammal();
        mammal1.setSpecies("Dog");
        mammal1.setAge(3);
        mammal1.setDomestic(true);

        System.out.println("Mammal 1: ");
        mammal1.displayInfo();
        System.out.println();

        Mammal mammal2 = new Mammal("Tiger", 5, false);
        System.out.println("Mammal 2: ");
        mammal2.displayInfo();
        System.out.println();

        mammal2.setAge(6);
        mammal2.setDomestic(false);

        System.out.println("Updated Mammal 2: ");
        mammal2.displayInfo();

    }
}