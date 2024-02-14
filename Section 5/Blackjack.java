import java.util.Scanner;

public class Blackjack  {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
        int userCardValue1 = drawRandomCard(); int userCardValue2 = drawRandomCard(); 
        int userNewCard, dealerNewCard;
        int dealCardValue1 = drawRandomCard(); int dealCardValue2 = drawRandomCard();
        String userOption;

        int userHandValue = Math.min(10, userCardValue1) + Math.min(10, userCardValue2);
        int dealerHandValue = Math.min(10, dealCardValue1) + Math.min(10, dealCardValue2);

        readySet();
        scan.nextLine();
        showUserCards(giveDrawing(userCardValue1), giveDrawing(userCardValue2));
        showTotalHandValue(userHandValue);
        scan.nextLine();
        showDealerCards(dealCardValue1, dealCardValue2);

        while(true){
            userOption = hitOrStay();
            if(userOption.equals("stay")){
                break;
            }
            if(userOption.equals("hit")){
                userNewCard = drawRandomCard();
                showNewCard(userNewCard);
                userHandValue = updateHandValue(userNewCard, userHandValue);
                showTotalHandValue(userHandValue);
                checkForBust(userHandValue);
            }
            

        }

        revealDealer(dealCardValue1, dealCardValue2);
        while (true) {
            dealerNewCard = drawRandomCard();
            dealerHandValue = updateHandValue(dealerNewCard, dealerHandValue);
            showNewCardDealer(dealerNewCard);
            showTotalHandValuDealer(dealerHandValue);
            
           if(dealerHandValue>21){
            System.out.println("Bust! Dealer losses!"); System.exit(0);
            break;
           }else if(dealerHandValue == 17 || dealerHandValue > 17){
            break;
           }
        }
        finalResult(userHandValue, dealerHandValue);
        scan.close();

    }
    public static void finalResult(int userHandValue, int dealerHandValue){
        if(userHandValue == dealerHandValue){
            System.out.println("Wow, It'a miraculous TIE!");
        }else if(userHandValue > dealerHandValue){
            System.out.println("Result: Congratulations, You win!");
        }else{
            System.out.println("Result: Sorry, Dealer wins!");
        }
    }
    public static void revealDealer(int dealCardValue1, int dealCardValue2){
        System.out.println("Dealer's Turn" + "\nThe dealer's cards are"
        +"\n" + giveDrawing(dealCardValue1) + "\nand a \n" + giveDrawing(dealCardValue2));
    }
   
    public static void checkForBust(int userHandValue){
        if(userHandValue>21){
            System.out.println("Bust! The Player loses! ");
                System.out.println("Exiting the game now");
                
                System.exit(0);
        }
    }
    public static int updateHandValue(int userNewCard, int userHandValue){
        int newValue =userHandValue + Math.min(10, userNewCard);
        return newValue;
    }
    public static String hitOrStay(){
        String option;
        System.out.println("Would you like to hit or stay?");
        option = scan.nextLine();
        while(!option.equals("hit")&&!option.equals("stay")){
            System.out.print("Please write 'hit' or 'stay': ");
            option = scan.nextLine();
        }
        return option;
    }

    public static void showNewCard(int userNewCard){
        System.out.println("You get a \n" + giveDrawing(userNewCard));
    }
    

    public static void showNewCardDealer(int userNewCard){
        System.out.println("Dealer gets a \n" + giveDrawing(userNewCard));
    }


    public static void showTotalHandValue(int userHandValue){
        System.out.println("Your total is: " + userHandValue);
    }
    public static void showTotalHandValuDealer(int dealerHandValue){
        System.out.println("Dealer's total is: " + dealerHandValue);
    }

    public static void showDealerCards(int dealCardValue1, int dealCardValue2){
        System.out.println("~~~Dealer's Turn~~~"+"\nThe dealer shows\n" + giveDrawing(dealCardValue1)
        + "\nand has a card facing down\n" + faceDown() 
        + "\nThe dealer's total is hidden");
    }

    
    public static String faceDown() {
        return
        "   _____\n"+
        "  |     |\n"+ 
        "  |  J  |\n"+
        "  | JJJ |\n"+
        "  |  J  |\n"+
        "  |_____|\n";
    }
    public static void showUserCards(String userCard1, String userCard2){
        System.out.println("You get a " +"\n" + userCard1 + "\nand a " +"\n" + userCard2);
    }
    public static void readySet(){
        System.out.println("Welcome to Java  Casino!"
        + "\nDo you have a knack for Black Jack?"
        + "\nWe shall see.."
        + "\n..Ready? Press anything to begin!");
    }

    public static int drawRandomCard(){
        int random = (int) (Math.random() * 13) + 1;
        return random;
    }


    public static String giveDrawing(int randomCard){
        switch (randomCard) {
            case 1: 
            return  "   _____\n"+
                    "  |A _  |\n"+ 
                    "  | ( ) |\n"+
                    "  |(_'_)|\n"+
                    "  |  |  |\n"+
                    "  |____V|\n";
            case 2:
            return  "   _____\n"+              
                    "  |2    |\n"+ 
                    "  |  o  |\n"+
                    "  |     |\n"+
                    "  |  o  |\n"+
                    "  |____Z|\n";
            case 3:
            return  "   _____\n" +
                    "  |3    |\n"+
                    "  | o o |\n"+
                    "  |     |\n"+
                    "  |  o  |\n"+
                    "  |____E|\n";
            
            case 4:
            return  "   _____\n" +
                    "  |4    |\n"+
                    "  | o o |\n"+
                    "  |     |\n"+
                    "  | o o |\n"+
                    "  |____h|\n";
            case 5:
            return  "   _____ \n" +
                    "  |5    |\n" +
                    "  | o o |\n" +
                    "  |  o  |\n" +
                    "  | o o |\n" +
                    "  |____S|\n";
            case 6:
            return  "   _____ \n" +
                    "  |6    |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  |____6|\n";
            case 7:
            return  "   _____ \n" +
                    "  |7    |\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |____7|\n";
            case 8:
            return  "   _____ \n" +
                    "  |8    |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  |____8|\n";
            case 9:
            return  "   _____ \n" +
                    "  |9    |\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |____9|\n";
            case 10:
            return  "   _____ \n" +
                    "  |10  o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |___10|\n";
            case 11:
            return  "   _____\n" +
                    "  |J  ww|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o% |\n"+ 
                    "  | | % |\n"+ 
                    "  |__%%[|\n";
            case 12:
            return  "   _____\n" +
                    "  |Q  ww|\n"+ 
                    "  | o {(|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%O|\n";
            case 13:
            return  "   _____\n" +
                    "  |K  WW|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%>|\n";
            default: 
            return "This shouldn't get called!";
        }
    }

}
