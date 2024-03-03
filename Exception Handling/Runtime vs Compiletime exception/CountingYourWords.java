import java.util.Scanner;

public class CountingYourWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a word and I will determine its consonants and vowels: ");
        System.out.print("The Word: ");
        String userInput = scanner.nextLine();
        char[] userInputs = userInput.toCharArray();
        System.out.println("The Word was: " + userInput);

        StringBuilder consonantB = new StringBuilder();
        StringBuilder vowelB = new StringBuilder();

        for (int i = 0; i < userInputs.length; i++) {
            if (isVowel(userInputs[i])) {
                vowelB.append(userInputs[i]);
            } else {
                consonantB.append(userInputs[i]);
            }
        }

        System.out.println("The consonant/s: " + consonantB.toString());
        System.out.println("The vowel/s: " + vowelB.toString());
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
