import java.util.Scanner;

public class CreationReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a word and i Will reverse it: ");
        System.out.print("The Word: ");
        String userInput = scanner.nextLine();
        System.out.println(userInput.toCharArray());
        char[] userInputs = userInput.toCharArray();
        for(int i = userInputs.length - 1; i >= 0; i--){
            System.out.print(userInputs[i] + " ");
        }
    }
}
