

public class Main{
    public static void main(String[] args) {
        Car nissan = new Car("Nissan", 10000, 2020, "Green");
        

        Car dodge = new Car("Dodge", 11000, 2019, "Blue");
        
        nissan.setColor("Jet Black");
        dodge.setColor("Jet Black");

        nissan.setPrice(nissan.getPrice()/2);
        dodge.setPrice(nissan.getPrice()/2);

        System.out.println("This " + nissan.getMake() + " is worth $" + nissan.getPrice() + 
        ". It was built in " + nissan.getYear() + ". It is " + nissan.getColor() + ".\n");
        System.out.println("This " + dodge.getMake() + " is worth $" + dodge.getPrice() + 
        ". It was built in " + dodge.getYear() + ". It is " + dodge.getColor() + ".\n");
        
        Person person = new Person("Shamel", "Filipino", "06/16/2004", 7);
        
        person.passport = new String[] {person.name, person.nationality, person.dateOfBirth};
        
        System.out.println("Name: " + person.name + "\n" + "Nationality: " + person.nationality
            + "\n" + "Date of Birth: " + person.dateOfBirth + "\n" + "Seat Number: "
            + person.seatNumber + "\n");


        Shirt nike = new Shirt("Nike", 20.00, "Small");
        System.out.println("Brand: " + nike.getBrand());
        System.out.println("Price: " + nike.getPrice());
        System.out.println("Size: " + nike.getSize());
    }
}