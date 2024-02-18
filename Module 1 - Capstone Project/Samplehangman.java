import java.util.Scanner;

public class Samplehangman {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("");
        String hiddenword = "donkey";
        char[] hiddenWordChar = hiddenword.toCharArray();
        int guesses = 6; int misses = 0;
        char userGuess;
        int correct = 0;
        
        while (guesses != 0) {
            System.out.println("The word to guess: " + String.valueOf(hiddenWordChar).replaceAll(".", "_"));
            System.out.print("Please guess a letter: ");
            userGuess = scan.next().charAt(0);

            boolean found = false;

            for (int i = 0; i < hiddenWordChar.length; i++) {
                if (hiddenWordChar[i] == userGuess) {
                    System.out.println("Nice! " + userGuess + " is in the word.");
                    correct++;
                    found = true;
                    break;
                }
            }

            if (!found) {
                misses++;
                guesses--; // Decrement guesses only when the guess is incorrect.
            }

            if (correct == hiddenWordChar.length) {
                System.out.println("You win!");
                break;
            } else if (guesses == 0) {
                System.out.println("You lose. The word was: " + hiddenword);
            }
        }
    }
}
