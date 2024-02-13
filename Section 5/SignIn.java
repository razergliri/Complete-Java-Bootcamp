import java.util.Scanner;

public class SignIn {
    public static void main(String[] args) {
        System.out.println("Welcome to JavaGram! Sign in below");
        String userName, userPassword;
        Scanner scan = new Scanner(System.in);
        System.out.print("- Username: "); userName = scan.nextLine();
        System.out.print("- Password: "); userPassword = scan.nextLine();
        while(!(userName.equals("Samantha")&&userPassword.equals("Java"))){
            System.out.println("Incorrect, please try again");
            System.out.print("- Username: "); userName = scan.nextLine();
            System.out.print("- Password: "); userPassword = scan.nextLine();
        }
        System.out.println("Sign in successful, welcome!");
        scan.close();
    }
}
