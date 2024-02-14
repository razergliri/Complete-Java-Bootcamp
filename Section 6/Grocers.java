import java.util.Scanner;

public class Grocers {
    public static void main(String[] args) {
        String[] aisles = {"apples","bananas", "candy", "chocolate", "coffee", "tea"};
        System.out.println("Wecolme to Java Grocers."
        + "\nWhat can I help you find?");
        Scanner scan = new Scanner(System.in);
        System.out.print("Your choice: ");
        String userOption = scan.nextLine();
        for(int i = 0; i < aisles.length; i++){
            if(aisles[i].equals(userOption)){
                System.out.println("We have that in aisle: " + i); System.exit(0);;
            }
        }
        System.out.println("Sorry we don't have any stock for your " + userOption);
        scan.close();
    }
}
