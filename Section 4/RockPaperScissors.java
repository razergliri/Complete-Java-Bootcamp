import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Let's play Rock Paper Scissors." 
        + "\nWhen I say 'shoot', Choose: rock, paper, scissors.");
        System.out.print("Are you ready? Write 'yes' if you are: ");

        
        String choice = scan.nextLine();
        String userChoice, computerChoice; 
        String resultOftheGame;
        
        
            if(isReady(choice)){
                System.out.println("Great!");
                System.out.print("Rock - Paper - Scissors, Shoot! " +"\nYour choice: ");
                userChoice = scan.nextLine(); userChoice = userChoice.toLowerCase();
                computerChoice = getComputerChoice();
               // System.out.println(printTheirChoices(userChoice, computerChoice));
                resultOftheGame = result(userChoice, computerChoice);
                printResult(userChoice, computerChoice, resultOftheGame);
            }else{
                System.out.println("Darn, some other time...!");
                System.exit(0);
            }
        


        scan.close();

    }


    public static String printTheirChoices(String userChoice,String computerChoice){
        return "You choose: " + userChoice +"\nComputer choose: " + computerChoice;
    }

    public static boolean isReady(String choice){
        return (choice.equals("yes"));
    }

    public static String getComputerChoice(){
        int compRoll = (int)(Math.random() * 3 + 1);
        switch (compRoll) {
            case 1: return "rock";
            case 2: return "paper";
            case 3: return "scissors";
            default: return "invalid";
                
        }
    }


    public static String result(String userChoice, String computerChoice){
        String result;
        if(userChoice.equals("rock")&&computerChoice.equals("scissors")
        || userChoice.equals("paper")&&computerChoice.equals("rock")
        || userChoice.equals("scissors")&&computerChoice.equals("paper")){
            result = "You win!"; return result; 
        }else if(computerChoice.equals("rock")&&userChoice.equals("scissors")
        || computerChoice.equals("paper")&&userChoice.equals("rock")
        || computerChoice.equals("scissors")&&userChoice.equals("paper")){
            result = "You lose!"; return result; 
        }else if(userChoice.equals(computerChoice)){
            result = "It's a tie!"; return result;
        }else {
            result = "INVALID CHOICE!"; return result;
        }
    }
    

    public static void printResult(String userChoice, String computerChoice, String resultOftheGame){
        System.out.println("You chose: " + userChoice
        + "\nThe computer chose: " + computerChoice
        + "\nResult: " + resultOftheGame);
    }

}
