import java.util.Arrays;

public class Weather {
    public static void main(String[] args) {
        double[] celcius = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
        double[] fahrenheit = celciusToFahrenheit(celcius);


        printTemperatures(celcius, "Celcius");
        printTemperatures(fahrenheit, "Fahrenheit");
    }

    public static double[] celciusToFahrenheit(double[] celcius){
        double[] fahrenheit = Arrays.copyOf(celcius, celcius.length);
        for(int i = 0; i < fahrenheit.length; i++){
            fahrenheit[i] = (celcius[i]/5 * 9) + 32;
        }
        return fahrenheit;
    }
    public static void printTemperatures(double[] temp, String scale){
        System.out.print(scale +": ");
        for(int i = 0; i < temp.length; i++){
            System.out.print(temp[i] + " ");
        }
        System.out.println("\n");
    }
}
