import model.Car;
import model.Car.BodyType;

public class Main{
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", BodyType.SEDAN, 2020, 30000);
        System.out.println(car1.getMake());
    
        // Uncomment the following line to test invalid input for setMake method
        car1.setMake("Nissan");
    
        // Uncomment the following line to test invalid input for setModel method
        car1.setModel("Altima");
    
        // Uncomment the following line to test invalid input for setBodyType method
        car1.setBodyType(BodyType.SUV);
    
        // Uncomment the following line to test invalid input for setProductionYear method
        car1.setProductionYear(Car.MIN_YEAR + 5);
    
        // Uncomment the following line to test invalid input for setPrice method
        car1.setPrice(5000);
    
        // Uncomment the following line to test invalid input for setPrice method
        car1.setPrice(20000);
    
        // Uncomment the following line to test invalid input for the constructor
        Car car2 = new Car("Orlombus", "Camry", BodyType.SEDAN, 2020, 30000);
    }
}