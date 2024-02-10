import java.util.Scanner;

public class Championship {
    public static void main(String[] args) {
        int gryffindor = 450;
        int ravenclaw = 500;
        char res = 'y';
        Scanner scan = new Scanner(System.in);

        while(res == 'y' || res == 'Y'){
            if((gryffindor - ravenclaw) >= 300){
                System.out.println("Dumbledore: Gryffindor takes the house cup!");
            }else if((gryffindor - ravenclaw) >= 0){
                System.out.println("Dumbledore: In second place, Gryffindor!");
            }else if((ravenclaw - gryffindor) <= 100){
                System.out.println("Dumbledore: In third place, Gryffindor!");
            }else{
                System.out.println("Dumbledore: In fourth place, Gryffindor!");
            }
            System.out.println("\n Do you want to try again? Y/N");
            System.out.print("Your choice:");
            res = scan.next().charAt(0);
            if(res == 'y' || res == 'Y'){
                System.out.print("\033[H\033[2J");
                System.out.print("Enter the score of gryffindor: ");
                gryffindor = scan.nextInt();
                System.out.print("Enter the score of ravenclaw: ");
                ravenclaw  = scan.nextInt();
                scan.nextLine(); 
                System.out.println("Hit enter to proceed to result: "); 
                scan.nextLine();
            }
           
        }
        scan.close();
    }
}
