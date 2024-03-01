import java.util.Scanner;

public class ArgumentValidation {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        User user = new User();
        System.out.println("We are setting up a new account.");

        System.out.print("Your username is currently null " + user.getUsername() + ". Please update it here: ");
        String username = scanner.nextLine();
        if(username.isBlank()){
            System.out.println("Sorry, that is an invalid username");
        } else{
            user.setUsername(username);
        }
        

        System.out.print("Your age is currently " + 0 + ". Please update it here: ");
        if(scanner.hasNextInt()){
            int age = scanner.nextInt();
            if(age < 0){
                System.out.println("Sorry, that is an invalid age");
            }else {
                user.setAge(age);
            }
        } else{
            scanner.nextLine();   
            
        }
       
        
        
        scanner.close();

    }
}
