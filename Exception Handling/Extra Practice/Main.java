public class Main{
    public static void main(String[] args) {
        Magazine magazine1 = new Magazine("Magazine 1", "Publisher 1", 1, 2020);
        System.out.println(magazine1.getTitle());
    
        // Uncomment the following line to test invalid input for setTitle method
        magazine1.setTitle("The Meg");
    
        // Uncomment the following line to test invalid input for setPublisher method
        magazine1.setPublisher("New York Times");
    
        // Uncomment the following line to test invalid input for setIssueNumber method
        magazine1.setIssueNumber(2);
    
        // Uncomment the following line to test invalid input for setPublicationYear method
        magazine1.setPublicationYear(2022);
    
        // Uncomment the following line to test invalid input for the constructor
         Magazine magazine2 = new Magazine("Orlando", "Publisher 2", 2, 2020);
    }
}