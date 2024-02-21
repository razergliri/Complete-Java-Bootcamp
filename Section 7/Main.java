

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
        
        Person person = new Person("Ryan Slim", "Canadian", "01/01/1111", 5);
        Person twin = new Person(person);
        twin.setName("Jadis Slim");
        twin.setSeatNumber(3);

       // person.passport = new String[] {person.name, person.nationality, person.dateOfBirth};
       Shirt nike = new Shirt("Nike", 20.00, "Small");
       System.out.println("Brand: " + nike.getBrand());
       System.out.println("Price: " + nike.getPrice());
       System.out.println("Size: " + nike.getSize()); 
       System.out.println("\n");
       System.out.println("Name: " + person.getName() + "\n" + "Nationality: " + person.getNationality()
            + "\n" + "Date of Birth: " + person.getDateOfBirth() + "\n" + "Seat Number: "
            + person.getSeatNumber() + "\n");

        System.out.println("Name: " + twin.getName() + "\n" + "Nationality: " + twin.getNationality()
            + "\n" + "Date of Birth: " + twin.getDateOfBirth() + "\n" + "Seat Number: "
            + twin.getSeatNumber() + "\n");

        nissan2.drive();
       System.out.println("Above dont look");
       System.out.println("\n\n");
       if(person.applyPassport()){
        System.out.println("Congratulations " + person.getName() + ". Your passport was approved!");
       }else{
        System.out.println("We are sorry " + person.getName() + ". We cannot process your application.");
       }
    }
}