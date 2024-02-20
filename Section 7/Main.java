import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        Car nissan = new Car("Nissan", 10000, 2020, "Green");
        

        Car dodge = new Car("Dodge", 11000, 2019, "Blue");
        

        System.out.println("This " + nissan.make + " is worth $" + nissan.price + 
        ". It was built in " + nissan.year + ". It is " + nissan.color + ".\n");
        System.out.println("This " + dodge.make + " is worth $" + dodge.price + 
        ". It was built in " + dodge.year + ". It is " + dodge.color + ".\n");
        
        Person person = new Person();
        person.name = "Shamel Glico";
        person.nationality = "Filipino";
        person.dateOfBirth = "06/16/2004";
        person.passport = new String[] {person.name, person.nationality, person.dateOfBirth};
        person.seatNumber = 7;
        System.out.println(person.name);
        System.out.println(person.nationality);
        System.out.println(person.dateOfBirth);
        System.out.println(Arrays.toString(person.passport));
        System.out.println(person.seatNumber);
    }
}