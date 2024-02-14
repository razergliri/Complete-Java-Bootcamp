public class RingAnnouncer {
    public static void main(String[] args) {
        String[] record = {"WIN", "WIN", "WIN", "LOSS", "WIN", "WIN", "LOSS"};
        int wins = 0;     int losses = 0;
        for(int i = 0; i < record.length; i++){
            if(record[i].equals("WIN")){
                wins++;
            }else{
                losses++;
            }
        }
        printResult(wins, losses);

    }
    public static void printResult(int wins, int losses){
        System.out.println("With a professional record of " + wins + " wins"
        + " and " + losses + " losses."
        + "\nHe is the pride of oracle: Java Fury!");
    }
}
