import java.util.Scanner;

public class TicTacToe {
   static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
       
        System.out.println("Let's play Tic Tac Toe");
        char[][] board = {
            {'_', '_', '_'},
            {'_', '_', '_'},
            {'_', '_', '_'},
        };
      scan.nextLine();
      printBoard(board);
      for(int i = 0; i < 9; i++){
        if(i%2==0){
            System.out.println("Turn: X");
            int[] spot = askUser(board);
            board[spot[0]][spot[1]] = 'X';
        }else {
            System.out.println("Turn: O");
            int[] spot = askUser(board);
            board[spot[0]][spot[1]] = 'O';
        }
        printBoard(board);
      }
      scan.close();
    }
    public static int checkRows(char[][] board){
        int count = 0;
        return count;
    }
    public static int checkColumns(char[][] board){
        int count = 0;
        return count;
    }
    public static int checkLeft(char[][] board){
        int count = 0;
        return count;
    }
    public static int checkRight(char[][] board){
        int count = 0;
        return count;
    }


    public static int checkWin(char[][] board){
        int count = 0;
        return count;
    }
    public static int[] askUser(char[][] board){
        System.out.print(" - pick a row and column number: ");
        int row = scan.nextInt();
        int element = scan.nextInt();
        while(board[row][element] != '_'){
            System.out.print("Spot taken, try again: ");
            row = scan.nextInt(); element = scan.nextInt();
        }
        return new int[] {row, element};
    }



    public static void printBoard(char[][] board){
        System.out.println();
        for(int i = 0; i < board.length; i++){
            System.out.print("\t\t\t");
            for(int j = 0; j < board[i].length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println("\n");
        }
    }

}
