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
            for(int j = 0; j < database[i].length; j++){
                if(j==0){
                    System.out.print("- Name: "); database[i][j] = scan.nextLine();
                }else if(j==1){
                    System.out.print("- Date of Birth: "); database[i][j] = scan.nextLine();
                }else if(j==2){
                    System.out.print("- Occupation: "); database[i][j] = scan.nextLine();
                }
            }
            System.out.println();
        }
        print2DArray(database);
        
        System.out.println("What do you want information on?");
        System.out.print("Your answer: "); String query = scan.nextLine();
        
        printQuery(database, checkQueryIndex(database, query));
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
    
    public static int checkQueryIndex(String[][] database, String query){
        int queryIndex = 0;
        for(int i = 0; i < database.length; i++){
           if(query.equals(database[i][0])){
            queryIndex = i;
           }
        }
        return queryIndex;
    }

    public static void printQuery(String[][] database, int queryIndex){
        for(int i = 0; i < 3; i++){
            if(i==0){
                System.out.println("Name: " + database[queryIndex][i]);
            }else if(i==1){
                System.out.println("Date of Birth: " + database[queryIndex][i]);
            }else if(i==2){
                System.out.println("Occupation: " + database[queryIndex][i]);
            }
        }
    }
}
