public class Tip {
    public static void main(String[] args) {
        double bill = 53.50;
        tipTheWaiter(bill);
    }
    /**
     * Function name: tipTheWaiter - calculates a  tip and prints it.
     * @param bill (double)
     * 
     * Inside the function:
     *      1. Calculate a tip that's 15 percent of the bill you paid.
     *      2. Prints: Your service was wonderful! Please, accept this tip: $<tip>
     * 
     */
    public static void tipTheWaiter(double bill){
        double tip = bill * 0.15;
        System.out.println("Your service was wonderful! Please, accept this tip: $" 
        + String.format("%.3f", tip));
    }
}
