import java.util.Scanner;

public class WeatherNetwork {
    public static void main(String[] args) {
        int temp = 25;
        String forecast;
        char res = 'y';
        Scanner scan = new Scanner(System.in);

        while(res == 'Y' || res == 'y'){
           
            System.out.println("Weather of Today!");
            forecast = forecastWeather(temp);
            System.out.println(forecast);
            System.out.println("Do you want to enter another temp? Y/N");
            System.out.print("Your choice: ");
            res = scan.next().charAt(0);
            if(res == 'Y' || res =='y'){
                System.out.print("\033[H\033[2J");
                System.out.print("Enter new temperature: ");
                temp = scan.nextInt();
                forecast =forecastWeather(temp);
            }
            
        }
        scan.close();
    }
    public static String forecastWeather(int temp){
        String forecast;
        if(temp <= -1){
        
            forecast = "Weatherman: Today forcast is FREEZING! Stay home!";
            return forecast;
        }else if(temp <= 10){
           
            forecast = "Weatherman: Today forcast is Chilly. Wear a coat!";
            return forecast;
        }else {
            forecast = "Weatherman: Today forcast is warm. Go outside!";
            return forecast;
        }
        
    }
}
