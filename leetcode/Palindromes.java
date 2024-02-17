import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String originalString = new String();
        char [] reversedString;

        System.out.print("Enter your string: ");
        originalString = scan.nextLine().toLowerCase();
        reversedString = new char[originalString.length()];


        for(int i = originalString.length() - 1, k = 0; i >=0; i--, k++){
            reversedString[k] = originalString.charAt(i);
           
        }

        if(originalString.equals(String.valueOf(reversedString))){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }


        scan.close();
    }
}
