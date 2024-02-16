import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("**********Javapedia**********");
        System.out.println("How many historical figures will you register?");
        int figures = 0;
        System.out.print("Your answer:");
        figures = scan.nextInt(); scan.nextLine();
        String[][] database = new String[figures][3];

        for(int i = 0; i < figures; i++){
            System.out.println("\t\tFigure " + (i+1));
           System.out.print("\t - Name: ");
           database[i][0] = scan.nextLine();
           System.out.print("\t - Date of Birth: ");
           database[i][1] = scan.nextLine();
           System.out.print("\t - Occupation: ");
           database[i][2] = scan.nextLine();
           System.out.println();
        }
        print2DArray(database);
        
        System.out.println("What do you want information on?");
        System.out.print("Your answer: "); String query = scan.nextLine();
        for(int i = 0; i < database.length;i++){
            if(database[i][0].equals(query)){
                System.out.println("\t - Name: " + database[i][0]);
                System.out.println("\t - Date of Birth: " + database[i][1]);
                System.out.println("\t - Occupation: " + database[i][2]);
            }
        }
        
        scan.close();
    }

    public static void print2DArray(String[][] database){
        System.out.println("These are the values you stored: ");
        for(int i = 0; i < database.length; i++){
            for(int j = 0; j < database[i].length; j++){
                System.out.print(database[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    

    
}
