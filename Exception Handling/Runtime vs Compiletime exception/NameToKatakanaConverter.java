import java.util.Scanner;

public class NameToKatakanaConverter {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their name
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

        // Convert the user's name to Katakana
        String katakanaName = convertToKatakana(userName);

        // Output the Katakana counterpart
        System.out.println("Your name in Katakana: " + katakanaName);

        // Close the Scanner
        scanner.close();
    }

    // A simple method to convert a string to Katakana (using a placeholder)
    private static String convertToKatakana(String input) {
        // This is a placeholder method; you would need a proper conversion algorithm
        // or a lookup table for real-world use.
        // In this example, we just append "カタカナ" to the input.
        return input + "カタカナ";
    }
}
