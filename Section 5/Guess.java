import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        int compRandom = generateRand(); 
        int myGuess;
        Scanner scan = new Scanner(System.in);
        System.out.print("I choose a number between 1 and 5. Try to guess it: ");
        myGuess = scan.nextInt();
        while(myGuess != compRandom){
            System.out.print("Guess again: ");
            myGuess = scan.nextInt();
        }
        System.out.println("You got it!");
        scan.close();
    }   

    public static int generateRand(){
        int random = (int)(Math.random() * 5) + 1;
        return random;
    }
}
