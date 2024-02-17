import java.util.Scanner;

public class Consvowels {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int vowels = 0; int consonants = 0; int spaces = 0;
        System.out.print("Input your word: ");
        String yourWord = scan.nextLine().toLowerCase();
        for(int i = 0; i < yourWord.length(); i++){

            char currentChar = yourWord.charAt(i);
            if(Character.isLetter(currentChar)){
                if(currentChar == 'a' || currentChar == 'e' || currentChar == 'i'
                || currentChar == 'o' || currentChar == 'u'){
                    vowels++;
                }else{
                    consonants++;
                }

            }else if (currentChar == ' ') {
                 spaces++;
            }
            

        }
        System.out.println("Output:  Vowels: " + vowels +", Consonants: " + consonants + ", Spaces: " + spaces);
        
        scan.close();
    }
}
