import java.util.Scanner;

public class CounterTool {
    public static void main(String[] args) {
        System.out.println("I hear you like to count by threes"
        + "\nJimmy: It depends." + "\nOh, ok...");
        Scanner scan = new Scanner(System.in);

        System.out.print(" 1. Pick a number to count by: ");
        int numberToCountBy = scan.nextInt();
        System.out.print(" 2. Pick a number to start counting from: ");
        int numberToStart = scan.nextInt();
        System.out.print(" 3. Pick a number to count to: ");
        int numberToCountTo = scan.nextInt();

        for(int i = numberToStart; i <= numberToCountTo; i += numberToCountBy){
            System.out.print(i +" ");
        }

        scan.close();
    }
}
