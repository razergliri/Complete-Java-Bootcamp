public class Receipt {
    public static void main(String[] args) {
        String [] apples = {"Gala", "Granny Smith", "Macintosh"};
        double [] prices ={1.99, 1.49, 1.29};
        for(int i = 0; i < 3; i++){
            System.out.println("\t\t"+apples[i] + ": $" + prices[i]);
        }
    }
}
