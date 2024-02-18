import java.util.Scanner;

public class Hangman{
    public static String[] words = {"ant", "baboon", "badger", "bat", "bear",
    "beaver", "camel", "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
     "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat", "goose", 
     "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose", "mouse", "mule",
      "newt", "otter", "owl", "panda", "parrot", "pigeon", "python", "rabbit",
       "ram", "rat", "raven","rhino", "salmon", "seal", "shark", "sheep", "skunk",
        "sloth", "snake", "spider", "stork", "swan", "tiger", "toad", "trout",
         "turkey","turtle", "weasel", "whale", "wolf", "wombat", "zebra"};
    public static String[] gallows = {
            "+---+\n" +
            "|   |\n" +
            "    |\n" +
            "    |\n" +   //if the user didn't miss any guesses.
            "    |\n" +
            "    |\n" +
            "=========\n",
           
            "+---+\n" +
            "|   |\n" +
            "O   |\n" +   //if the user missed one guess.
            "    |\n" +
            "    |\n" +
            "    |\n" +
            "=========\n",
             
            "+---+\n" +
            "|   |\n" +
            "O   |\n" +    //if the user missed two guesses.
            "|   |\n" +
            "    |\n" +
            "    |\n" +
            "=========\n",
            
            " +---+\n" +
            " |   |\n" +
            " O   |\n" +   //if the user missed three guesses.
            "/|   |\n" +
            "     |\n" +
            "     |\n" +
            " =========\n",
            
            " +---+\n" +
            " |   |\n" +
            " O   |\n" +
            "/|\\  |\n"+   //if the user missed four guesses.
            "     |\n" +
            "     |\n" +
            " =========\n",
            
            " +---+\n" +
            " |   |\n" +
            " O   |\n" +
            "/|\\  |\n" +  //if the user missed five guesses.
            "/    |\n" +
            "     |\n" +
            " =========\n",
            
            " +---+\n" +
            " |   |\n" +
            " O   |\n" +
            "/|\\  |\n" +   //if the user missed six guesses.
            "/ \\  |\n" +
            "     |\n" +
            " =========\n"};
        
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("~~~WELCOME TO THE HANGMAN GAME~~~");
        int misses = 0; int guesses = 6; char myGuess; int correctGuess = 0;
        System.out.println(words.length);
        String userRandomWord = randomWord();
        String maskedWord = userRandomWord.replaceAll("[a-zA-Z]", "_");
        System.out.println("Your randomWord: " + userRandomWord);
        System.out.println("Hidden Word " + maskedWord);
        char[] randWordHold = userRandomWord.toCharArray();
        System.out.println(randWordHold);
        while(guesses != 0){
            System.out.println("Guess: ");
            myGuess = scan.next().charAt(0);
            
        }
        
    }
    public static String randomWord(){
        int randomNum = (int) (Math.random() * 64) + 1;
        String randomedWord = words[randomNum];
        return randomedWord;
    }
    
}