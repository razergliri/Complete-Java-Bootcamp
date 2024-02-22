import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
    Person person = new Person("Uncle Sam", "Australian", "04/04/4444", 2);

    System.out.println("Name: " + person.getName() + "\n" + "Nationality: " + person.getNationality() + "\n"
    + "Date of Birth: " + person.getDateOfBirth() + "\n" + "Seat Number: " + person.getSeatNumber() + "\n"
    );
    if(person.applyPassport()){
        person.setPassport();
        System.out.println("Passport: " + Arrays.toString(person.getPassport()) + "\n");
    }else{
        System.out.println("Passport: " + Arrays.toString(person.getPassport()) + "\n");
    }
       
    
    System.out.println("break");
    Car nissan = new Car("Nissan", 10000, 2020, "Green", new String[] {"Tires", "Keys"} );
    Car dodge = new Car("dodge", 11000, 2019, "Blue", new String[] {"Tires", "Keys"} ); 
    Car nissan2 = new Car(nissan);
    
    System.out.println(nissan);
    System.out.println(dodge);
    System.out.println(nissan2);
    System.out.println(person);

    }
}