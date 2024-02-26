import java.util.Scanner;

public class Samplejosephus {
    public static int josephus(int n, int k) {
        if (n == 1) {
            return 1;
        } else {
            return (josephus(n - 1, k) + k - 1) % n + 1;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of people: ");
        int numberOfPeople = scanner.nextInt();

        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        if (numberOfPeople <= 0 || k <= 0) {
            System.out.println("Please enter valid values for the number of people and k.");
        } else {
            int survivorPosition = josephus(numberOfPeople, k);
            System.out.println("The survivor is at position: " + survivorPosition);
        }

        scanner.close();
    }
}
