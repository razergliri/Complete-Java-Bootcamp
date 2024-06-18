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
        int misses = 0; int guesses = 6; char myGuess = ' '; int correctGuess = 0;
        String userRandomWord = randomWord();
        String maskedWord = userRandomWord.replaceAll("[a-zA-Z]", "_");
        char[] randWordHold = userRandomWord.toCharArray();
        char[] wordrand = maskedWord.toCharArray();
        StringBuilder myMisses = new StringBuilder(" ");
       
       // System.out.println(randWordHold);
        scan.nextLine();
        while(guesses != 0){
            boolean found = false;
         System.out.print("\033[H\033[2J");
            System.out.print("\nGuess: "); printGuess(myGuess);
            System.out.println("\n"+ printGallows(gallows, misses));
            System.out.print("Word: \t\t"); printMask(wordrand);
            System.out.print("\n\nMisses: "); printMyMiss(myMisses);
            System.out.print("\nGuess: ");
            myGuess = scan.next().charAt(0);
            for(int i = 0; i <randWordHold.length;i++){
                if(randWordHold[i] == myGuess){
                    wordrand[i] = randWordHold[i];
                    found = true; 
                    correctGuess++;
                    
                }
            }
            if(!found){
                misses++;
                myMisses = myMisses.append(myGuess);
                guesses--;
            }

            if(correctGuess == randWordHold.length){
                System.out.print("\nGuess: "); printGuess(myGuess);
                System.out.println("\n"+ printGallows(gallows, misses));
                System.out.print("Word: \t\t"); printMask(wordrand);
                System.out.println("\nCongratulations you made it! You win!");
                System.out.println("Indeed! The correct word you guessed is " + userRandomWord);
                break;
            }else if (guesses == 0){
                
                System.out.print("\nGuess: "); printGuess(myGuess);
                System.out.print("\n\nMisses: "); printMyMiss(myMisses);
                System.out.println("\n"+ printGallows(gallows, misses));
                System.out.println("RIP! You lose. The word was: " + userRandomWord);
            }
           // System.out.print("\033[H\033[2J");
        }
        
    }
    public static boolean checkGuess(char[] randWordHold, char myGuess){
        boolean found = false;
        for(int i = 0; i < randWordHold.length; i++){
            if(randWordHold[i] == myGuess){
                found = true; break;
            }
        }
        return found;

    }
    public static void printMyMiss(StringBuilder myMisses){
        System.out.print(myMisses);
    }
    public static void printGuess(char myGuess){
        System.out.print(myGuess);
    }
    public static void printMask(char[] wordrand){
        for(int i = 0; i < wordrand.length; i++){
            System.out.print(wordrand[i] + " ");
        }
    }

    public static String randomWord(){
        int randomNum = (int) (Math.random() * 64) + 1;
        String randomedWord = words[randomNum];
        return randomedWord;
    }

    public static String printGallows(String[] gallows, int misses){
        switch (misses) {
            case 0: return gallows[0]; 
            case 1: return gallows[1]; 
            case 2: return gallows[2]; 
            case 3: return gallows[3]; 
            case 4: return gallows[4]; 
            case 5: return gallows[5]; 
            case 6: return gallows[6]; 
            default: return "This must not be called";
        }
    }
    
}