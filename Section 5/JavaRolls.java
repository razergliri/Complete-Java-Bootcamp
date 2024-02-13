import java.util.Scanner;

public class JavaRolls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int diceRoll = 0, score=0;
        System.out.println("Let's play Rolling Java. Type anything to start"); scan.nextLine();
        System.out.println("Great, Here are the rules:" + "\n - If you roll a 6, the game stops."
        + "\n - If you roll a 4 nothing happens." +"\n - Otherwise, you get 1 point.\n" 
        + "\nYou must collect at least 3 points to win. Enter anything to roll: "); scan.nextLine();
        while(diceRoll != 6){
            diceRoll = rollDice();
            
            System.out.println(printRollDesc(diceRoll));
            scan.nextLine();
            score = score + updateScore(diceRoll);
        }
        System.out.println("Your score is: " + score);
        printResult(score);
        scan.close();   
    }

    public static int rollDice(){
        int random = (int) (Math.random()* 6) + 1;
        return random;
    }

    public static int updateScore(int diceRoll){
        int score = 0;
        boolean isInRange = (diceRoll == 1 ||diceRoll == 2|| diceRoll == 3 || diceRoll == 5);
        if(isInRange){
            score = score + 1;
        }else{
            score+=0;
        }
        return score;
    }

    public static String printRollDesc(int diceRoll){
        boolean isInRange = (diceRoll == 1 ||diceRoll == 2|| diceRoll == 3 || diceRoll == 5);
        if(isInRange){
           return ("You rolled a " + diceRoll +"." + " One point. keep rolling.");
        }else if(diceRoll == 4){
            return ("You rolled a " + diceRoll +"." + " Zero points. keep rolling.");
        }else{
            return ("You rolled a " + diceRoll +"." + " End of game.");
        }
    }

    public static void printResult(int score){
       
        if(score >= 3){
            System.out.println("Wow, that's lucky you win!");
        }else{
            System.out.println("Tough luck, you lose!");
        }
    }
}
