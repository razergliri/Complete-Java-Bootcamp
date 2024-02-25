import java.util.Scanner;

public class NintendoSwitchGameRating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Nintendo Switch Games Rating System!");

        int totalRatings = 0;
        double sumOfRatings = 0.0;

        while (true) {
            // Prompt the user to enter a rating or 'q' to quit
            System.out.print("Enter a rating (1-10) or 'q' to quit: ");
            String input = scanner.nextLine();

            // Check if the user wants to quit
            if (input.equalsIgnoreCase("q")) {
                break;
            }

            try {
                // Parse the input as a double
                double rating = Double.parseDouble(input);

                // Check if the rating is within the valid range
                if (rating >= 1 && rating <= 10) {
                    totalRatings++;
                    sumOfRatings += rating;
                } else {
                    System.out.println("Invalid rating. Please enter a rating between 1 and 10.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        // Calculate and display the average rating
        if (totalRatings > 0) {
            double averageRating = sumOfRatings / totalRatings;
            System.out.println("Average rating: " + averageRating);
        } else {
            System.out.println("No ratings entered. Exiting program.");
        }

        scanner.close();
    }
}
