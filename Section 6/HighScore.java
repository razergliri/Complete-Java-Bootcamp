public class HighScore {
    public static void main(String[] args) {
    int[] randomNums = new int[10]; int highScore =0;
    System.out.print("Here are the scores: ");
    int seat = 0;
    for(int i = 0; i < randomNums.length; i++){
        randomNums[i] = randomNumber();
        System.out.print(randomNums[i] + " ");
        if(randomNums[i] > highScore){
            highScore = randomNums[i];
            seat = i;
        }
    }
    printHighScore(highScore,seat);

    
    }

    
    public static int randomNumber(){
        int random = (int) (Math.random() * 49999) + 1;
        return random;
    }
    public static void printHighScore(int highScore, int seat){
        System.out.println("\n\n\nThe highest score is: " + highScore + ". Impressive!"
        + "\nIt's the gentleman in seat: "+ seat + ". Give that man a cookie!");
    }
}
