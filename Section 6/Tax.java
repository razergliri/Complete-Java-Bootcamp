import java.util.Arrays;

public class Tax {
    public static void main(String[] args) {
        double[] prices= {1.99, 2.99, 3.99, 4.99};
        double[] afterTax = new double[4];
        for(int i = 0; i < 4; i++){
            afterTax[i] = prices[i] + (prices[i] * 0.13);

        }
       System.out.println("The original prices are: " + Arrays.toString(prices));
       System.out.println("The after taxx prices are: " + Arrays.toString(afterTax));
    }
}
