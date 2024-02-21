

public class Main{
    public static void main(String[] args) {
        Car nissan = new Car("Nissan", 10000, 2020, "Green");
        

        Car dodge = new Car("Dodge", 11000, 2019, "Blue");
        
        Car nissan2 = new Car(nissan);

        nissan2.setColor("Yellow");
        nissan.setColor("Orange");
        nissan2.setColor("Blue");
        nissan.setColor("Purple");
        nissan2.setColor("Fuchsia");
        nissan.setColor("Beige");

        System.out.println("This " + nissan.getMake() + " is worth $" + nissan.getPrice() + 
        ". It was built in " + nissan.getYear() + ". It is " + nissan.getColor() + ".\n");
        System.out.println("This " + nissan2.getMake() + " is worth $" + nissan2.getPrice() + 
        ". It was built in " + nissan2.getYear() + ". It is " + nissan2.getColor() + ".\n");
        
        Person person = new Person("Shamel", "Filipino", "06/16/2004", 7);
        
       // person.passport = new String[] {person.name, person.nationality, person.dateOfBirth};
       Shirt nike = new Shirt("Nike", 20.00, "Small");
       System.out.println("Brand: " + nike.getBrand());
       System.out.println("Price: " + nike.getPrice());
       System.out.println("Size: " + nike.getSize()); 

        System.out.println("Name: " + person.getName() + "\n" + "Nationality: " + person.getNationality()
            + "\n" + "Date of Birth: " + person.getDateOfBirth() + "\n" + "Seat Number: "
            + person.getSeatNumber() + "\n");


       
    }
}