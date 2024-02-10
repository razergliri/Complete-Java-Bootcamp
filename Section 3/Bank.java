import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n****GLICO'S ROYAL BANK****");
        System.out.println("Agent: Good day! Are you here to get a mortgage? (Y/N)");
        System.out.print("Your answer: ");
        String decision = scan.nextLine();

        if (decision.equalsIgnoreCase("yes")) {
            System.out.println("Agent: Great! In one line" + "\nHow much money do you have in your savings?"
                    + "\nAnd, how much do you owe in credit card debt?");
            System.out.print("Your answer: ");
            double moneySavings = scan.nextDouble();
            double creditDebt = scan.nextDouble();
            System.out.println("You have " + moneySavings + "$ in savings and " + creditDebt
                    + "$ in credit debt.");
            
            // Additional mortgage-related prompts and processing can go here
        } else {
            System.out.println("Agent: Okay. Have a nice day!");
        }

        // Close the scanner to avoid resource leak
        scan.close();
    }
}
