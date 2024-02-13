public class BreakAndContinueExamples {

    public static void main(String[] args) {
        // Example 1: Print numbers from 1 to 10, but stop when the number 5 is reached (using break)
        // TODO: Write a loop that prints numbers from 1 to 10, but stops when the number 5 is reached using the 'break' statement
        System.out.print("Example 1: ");
        for (int i=1; i<=10; i++){
            
            System.out.print(i +" ");
            if(i==5){
                break;
            }

        }
        // Example 2: Print numbers from 1 to 10, but skip the number 5 (using continue)
        // TODO: Write a loop that prints numbers from 1 to 10, but skips the number 5 using the 'continue' statement
        System.out.print("\nExample 2: ");
        for (int i=1; i<=10; i++){
            if(i==5){
                continue;
            }

            System.out.print(i +" ");
           
        }
        
        // Example 3: Find the smallest number greater than 20 that is divisible by 3 (using break)
        // TODO: Write a loop that finds the smallest number greater than 20 that is divisible by 3 using the 'break' statement
        for(int i = 21; i < 30; i++){
            if(i % 8 == 0){
                System.out.print("\nThe smalelst number greater than 20 divisble by 8 is: " + i);
                break;
            }
        }

        // Example 4: Print all even numbers from 1 to 20, and skip odd numbers (using continue)
        // TODO: Write a loop that prints all even numbers from 1 to 20, skipping odd numbers using the 'continue' statement
        System.out.print("\nExample 4: ");
        for(int i = 1; i <= 20; i++){
            if(!(i % 2 ==0)){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
