import java.util.Scanner;

public class Main {


    static Store store = new Store();
    public static void main(String[] args) {
        Movie[] movies = new Movie[]{
            new Movie("The Shawshank Redemption", "BlueRay", 9.2),
            new Movie("The Godfather", "BlueRay", 9.1),
            new Movie("The Godfather: Part II", "DVD", 9.0),
            new Movie("12 Angry Men", "DVD", 8.9),
            new Movie("The Dark Knight", "BlueRay", 9.0),
            new Movie("Schindler's List", "DVD", 8.9),
            new Movie("The Lord of the Rings: The Return of the King", "BlueRay", 8.9),
            new Movie("Pulp Fiction", "DVD", 8.8),
            new Movie("The Good, the Bad and the Ugly", "DVD", 8.8),
            new Movie("The Lord of the Rings: The Fellowship of the Ring", "DVD", 8.8)
        };
        
       for(Movie movie : movies){
        store.addMovie(movie);
       }
        printStore();
        userInput();
        printStore();
    }


    public static void printStore(){
        System.out.println("******GLICOS RATING******");
        System.out.println(store);
    }

    public static void userInput(){
        Scanner scanner = new Scanner(System.in);
        String status = "continue";
        while (status.equals("continue")) {
            System.out.print("\nPlease enter an integer between 0-9: ");
            int choice = scanner.nextInt();
            Movie movie = store.getMovie(choice);
            System.out.print("Set a new rating for " + movie.getName() +": ");
            double rating = scanner.nextDouble();
            movie.setRating(rating);
            store.setMovie(choice, movie);
            
            System.out.print("To edit another rating, type: 'continue': "); scanner.nextLine();
            status=scanner.nextLine();
        }
        scanner.close();
    } 
}
