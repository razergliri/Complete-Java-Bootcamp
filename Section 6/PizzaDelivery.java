import java.util.Scanner;

public class PizzaDelivery {
    static  Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
       
        System.out.print("How many pizza toppings do you want? ");
        int topNum = scan.nextInt();
        scan.nextLine();
        String[] toppings = new String[topNum];
        System.out.println("Great enter each topping!");
        for(int i=0; i<topNum; i++){
            System.out.print(i+". ");
            toppings[i] = scan.nextLine();
        }
        printTheToppings(toppings);
        scan.close();
    }

    public static void printTheToppings(String[] toppings){
        for(int i=0; i<toppings.length; i++){
            System.out.print(i + ". " + toppings[i] +"\n");
            
        }
    }
}
