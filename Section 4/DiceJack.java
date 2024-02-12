import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {
        // the user needs to pick 3 numbers
        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter three numbers between 1 and 6: ");

        int num1 = scan.nextInt(); 
        int num2 = scan.nextInt(); 
        int num3 = scan.nextInt();
        int sumNumbers = num1 + num2 + num3;
        int sumDiceRolls = roll1 + roll2 + roll3;
       if(isLessThan1(num1, num2, num3) || isHigherThan6(num1, num2, num3)){
        System.out.println("You entered numbers outside the valid range");
        System.exit(0);
       }
       System.out.println("Your sum is: " + sumNumbers + "\nComputer Sum: " + sumDiceRolls);
       
       if(userWon(sumNumbers, sumDiceRolls)){
        System.out.println("\nCongratulations, you won!");
       }else{
        System.out.println("\nBetter luck next time!");
       }

        scan.close();
        
        // user wins  if the sum of dice rolls is smaller than the sum of number you chose
        // AND the difference between the two numbers is less than three
    }
    
    public static boolean userWon(int sumNumbers, int sumDiceRolls){
        return (sumNumbers > sumDiceRolls && (sumNumbers - sumDiceRolls) < 5);
    }

    public static boolean isLessThan1(int num1, int num2, int num3){
        return (num1 < 1 || num2 < 1 || num3 < 1);
    }

    public static boolean isHigherThan6(int num1, int num2, int num3){
        return ( num1 > 6 || num2 > 6 || num3 > 6);
    }

    public static int rollDice(){
        int randomNum = (int) (Math.random() * 6 + 1);
        return randomNum;
    }

}
