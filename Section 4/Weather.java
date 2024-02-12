public class Weather {
    public static void main(String[] args) {
        double noon = 77;
        double evening = 61;
        double midnight = 55;
        System.out.println("F: " + noon +"\nC: "+String.format("%.1f",fahrenheitToCelsius(noon)));
        System.out.println("\nF: " + noon +"\nC: "+String.format("%.1f",fahrenheitToCelsius(evening)));
        System.out.println("\nF: " + noon +"\nC: "+String.format("%.1f",fahrenheitToCelsius(midnight)));
    }
    /**
     * Function Name: fahrenheitToCelsius
     * @param  fahrenheit (double)
     * @return celsius (double)
     * 
     * Inside the function:
     *      1. return the celcius temperature. C = (F - 32) * 5/9
     */
    public static double fahrenheitToCelsius(double fahrenheit){
        double celcius = (fahrenheit - 32) * 5 / 9;
        return celcius;
    }

}
