import java.util.Scanner;

public class FirstOccurence {
    public static void main(String[] args) {
        String haystack = new String();
        String needle = new String();

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the haystack: ");
        haystack = scan.nextLine();
        System.out.print("Enter the needle: ");
        needle = scan.nextLine();
        System.out.println(needle);
        checkIndex(haystack, needle);
        System.out.println(haystack.length() + " + " + needle.length());

        
        scan.close();
    }

    public static void checkIndex(String haystack, String needle){
        int ans = -1;
        int checks = 0;

        for(int i = 0; i <= haystack.length() - needle.length();i++ ){
          // System.out.println(haystack.charAt(i) + " - " + needle.charAt(i));
          for(int k = 0 ; k < needle.length(); k++){
            if(needle.charAt(k) == haystack.charAt(i+k)){
                checks++;

            }
            if (checks == needle.length()){
                ans = 0;
                break;
            }
          }
        }
        if (ans != -1){
            System.out.println("The word " + needle + " occurs at " +  haystack );
        }else {
            System.out.println("The word " +  needle + "did not occur at " +  haystack );
        }
        
    }
}