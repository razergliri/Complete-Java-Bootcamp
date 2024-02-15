import java.util.Arrays;

public class TDArrays {
    public static void main(String[] args) {
        int[][] grades = {
            {72, 74, 78, 76},
            {65, 64, 61, 67},
            {95, 98, 99, 100},
        };

       for(int j = 0; j <grades[0].length; j++){
            System.out.println(grades[0][j]);
       }

       for(int j = 0; j <grades[0].length; j++){
            System.out.println(grades[1][j]);
       }

       for(int j = 0; j <grades[0].length; j++){
        System.out.println(grades[2][j]);
       }    
    }
}
