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
       
       
    }
}