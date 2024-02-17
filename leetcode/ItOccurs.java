import java.util.Scanner;

public class ItOccurs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String origString = "PHP Exercises and Python Exercises";
        char res = 'y'; 
        while(res == 'y' || res == 'Y'){

        System.out.println("Original String : " + origString);
        System.out.print("Specified sequence of char values: ");
        String yourString = scan.nextLine();
        
        System.out.print("Result: " );
            if(origString.contains(yourString)){
                System.out.print("True");
            }else {
                System.out.print("False");
            }
        
        System.out.println("\nDo you want to try again? Y - N");
        System.out.print("Your choice: ");
        res = scan.next().charAt(0);

        }
        
        scan.close();
    }


}
