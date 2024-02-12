public class ForLoopExamples {

    public static void main(String[] args) {
        // Example 1: Print numbers from 1 to 10
        // TODO: Write a for loop that prints numbers from 1 to 10
        for(int i = 1; i < 11; i ++){
            System.out.print(i +" ");
        }
        System.out.println();
        // Example 2: Print "Hello, world!" 5 times
        // TODO: Write a for loop that prints "Hello, world!" 5 times
        for(int i = 0; i < 5; i ++){
            System.out.println("Hello, world! " + (i + 1));
        }
        // Example 3: Print the multiplication table of 5 up to 10
        // TODO: Write a for loop that prints the multiplication table of 5 up to 10 (5 x 1, 5 x 2, ..., 5 x 10)
        for(int i=1; i<=10; i++){
            System.out.println("5 x " + i + " = " + (5 * i));
        }
        // Example 4: Print the numbers from 10 to 1 in reverse order
        // TODO: Write a for loop that prints numbers from 10 to 1 in reverse order
        for(int i=10; i >= 1; i--){
            System.out.print( i + " ");
        }
        System.out.println();
        // Example 5: Print the first 10 even numbers
        // TODO: Write a for loop that prints the first 10 even numbers
        for(int i = 0; i <= 19; i+=2){
           
                System.out.print(i + " ");
            
        }
    }

}
