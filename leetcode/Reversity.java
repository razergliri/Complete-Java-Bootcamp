import java.util.Scanner;

public class Reversity {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a word: ");
        String yourInput = scan.nextLine();
        
        printReverse(yourInput);
        scan.close();
    }

    public static void printReverse(String yourInput){
        char [] arrInp = yourInput.toCharArray();
        System.out.print("Result: ");
        for(int i = yourInput.length() - 1; i>=0; i--){
            System.out.print(arrInp[i]);
        }   
    }

    /*
     * StringBuilder reversed = new StringBuilder();
     * reversed.append(arrInp[i]);
     * reversed.toString();
     */
}
