import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Quizz Game!");
        System.out.println("Hit any key to start the game");
        Scanner scan = new Scanner(System.in);
        int score = 0;

        System.out.println("1. In \"The Silver Chair,\" the fourth book of \"The Chronicles of Narnia\" series"
        +" by C.S. Lewis, who is the missing Prince that " + "Eustace Scrubb, Jill Pole, and Puddleglum "
        + "embark on a quest to find?"
        + "\n\t\ta.) Prince Caspian" + "\n\t\tb.) Prince Rilian" + "\n\t\tc.) Prince Corin" + "\n\t\td.) Prince Tirian");
        System.out.print("Your choice: ");
        char userAnswer =  scan.next().charAt(0);
        if(userAnswer == 'b' || userAnswer == 'B'){
            score += 5;
        }

        System.out.println("2. Which planet is the hottest?"
        + "\n\t\ta.) Venus" + "\n\t\tb.) Saturn" + "\n\t\tc.) Mercury" + "\n\t\td.) Mars");
        System.out.print("Your choice: ");
        userAnswer =  scan.next().charAt(0);
        if(userAnswer == 'a' || userAnswer == 'A'){
            score += 5;
        }

        System.out.println("3. Which part of the upper body does not require any blood supply?"
        + "\n\t\ta.) Sclera" + "\n\t\tb.) Myocardium" + "\n\t\tc.) Alveoli" + "\n\t\td.) Cornea");
        System.out.print("Your choice: ");
        userAnswer =  scan.next().charAt(0);
        if(userAnswer == 'd' || userAnswer == 'D'){
            score += 5;
        }

        System.out.println("4. What is the smallest country in the world in terms of land area?"
        + "\n\t\ta.) Monaco" + "\n\t\tb.) San Marino" + "\n\t\tc.) Vatican City" + "\n\t\td.) Nauru");
        System.out.print("Your choice: ");
        userAnswer =  scan.next().charAt(0);
        if(userAnswer == 'c' || userAnswer == 'C'){
            score += 5;
        }
        
        System.out.println("Your final score is: " + score + "/20");
        if(score == 20){
            System.out.println("Congratulations, you got a perfect score! You should be proud of yourself.");
        }else if (score == 15){
            System.out.println("Woah, you almost got a perfect score!");
        }else if(score == 10){
            System.out.println("Awesome, You got half of the questions right!");
        }else if (score == 5){
            System.out.println("That's not bad! At least you got a single question right");
        }else{
            System.out.println("I'm sorry, better luck next time!");
        }
        

        scan.close();
    }
}
