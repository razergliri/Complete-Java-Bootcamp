

public class TDArrays {
    public static void main(String[] args) {
        int[][] grades = {
            {72, 74, 78, 76},
            {65, 64, 61, 67},
            {95, 98, 99, 100},
        };

       for(int i = 0; i < grades.length; i++){
       checkName(i);
        for(int j = 0; j < grades[i].length; j++){
            System.out.print(grades[i][j] + " ");
        }
        System.out.println("");
       }



    }

    public static void checkName(int i){
        switch (i) {
            case 0: System.out.print("Harry:    "); break;
            case 1: System.out.print("Ron:      "); break;
            case 2: System.out.print("Hermione: "); break;
            default: System.out.println("This shouldn't be called");
        }
    }

}
