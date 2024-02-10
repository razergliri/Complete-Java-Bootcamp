import java.util.Scanner;

public class JavaMart {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double wallet = 100;
        System.out.println("Can you buy me this Oliver Cabell Low 1 White? ");
        if(wallet > 219.99){
            System.out.println("Me: Sure! We have enough money here.");
        }else{
            
            System.out.println("Me: I'm sorry we're " + String.format("%.2f",(219.99 - wallet)) + "$ short. Let's buy this next time.");
        }
        scan.nextLine();


        System.out.println("Can you buy me this ice cream?");
        double icecream = 19;
        if ((wallet>icecream)) {
            System.out.println("Me: Of course! Here pick your favorite flavor.");
            wallet = wallet - icecream;
        }else{
            System.out.println("Me: I'm sorry we're " + (icecream - wallet) + "$ short. Let's buy this next time.");
        }
       
        scan.close();
    }

    }

