public class SwitchStatements {
    public static void main(String[] args) {

        // Section 1: Weather conditions
        String weather = "sunny";
        // Determine what to wear based on the weather (e.g., sunny, cloudy, rainy, snowy)
        // Decide whether to use if-else or switch
        switch (weather) {
            case "sunny":
            System.out.println("Weatherman: You can wear a shirt");
            break;
            case "cloudy":
            System.out.println("Weatherman: You should wear a sweater");
            break;
            case "rainy":
            System.out.println("Weatherman: You should wear a raincoat");
            break;
            case "snowy":
            System.out.println("Weatherman: You should wear a jacket");
            break;
            default:
            System.out.println("Weatherman: You can wear whatever you want");   
        }


        // Section 2: User role
        int role = 2;
        switch (role) {
            case 1:
            System.out.println("You are an admin");
            break;
            case 2:
            System.out.println("You are an editor");
            break;
            case 3:
            System.out.println("You are a user");
            break;
            default:
            System.out.println("Please contact HR");
        }
        // Determine user access level based on the role (e.g., 1: admin, 2: editor, 3: user)
        // Decide whether to use if-else or switch

        // Section 3: Temperature and humidity
        int temperature = 75;
        int humidity = 65;
        // Determine the comfort level based on both temperature and humidity (e.g., too hot, too cold, comfortable)
        // Decide whether to use if-else or switch
        if(temperature >= 80 && humidity >= 60){
            System.out.println("Weatherman: It's too hot and humid\n");
        }else if(temperature >= 80){
            System.out.println("Weatherman: It's too hot\n");
        }else if(temperature <= 60 && humidity >= 60){
            System.out.println("Weatherman: It's too cold and humid\n");
        }else if(temperature < 60){
            System.out.println("Weatherman: It's too cold\n");
        }else{
            System.out.println("Weatherman: It's comfortable\n");
        }


        // Section 5: Age and income
        int age = 25;
        int income = 50000;
        // Determine eligibility for a specific credit card based on age and income
        // Decide whether to use if-else or switch
        if(age >= 18 && age <= 60  && income >= 30000){
            System.out.println("Agent: Congratulations! You are eligible for the credit card.\n");
        }else {
            System.out.println("Agent: Sorry, you are not eligible for the credit card.\n");
        }

        // Section 1: Traffic light colors
        String lightColor = "green";
        // Determine what action to take based on the traffic light color (e.g., green, yellow, red)
        // Decide whether to use if-else or switch
        switch (lightColor) {
            case "green":
            System.out.println("Traffic Enforcer: Go!"); break;
            case "yellow":
            System.out.println("Traffic Enforcer: Stop!"); break;
            case "red":
            System.out.println("Traffic Enforcer: Slow down!"); break;
            default:
            System.out.println("Traffic Enforcer: Power outage!"); 
        }
        // Section 2: Exam grade
        int grade = 85;
        // Determine the letter grade based on the numeric grade (e.g., A, B, C, D, F)
        // Decide whether to use if-else or switch
        if(grade >= 80){
            System.out.println("Instructor: You got an A!");
        }else if(grade >= 70){
            System.out.println("Instructor: You got a B!");
        }else if(grade >= 60){
            System.out.println("Instructor: You got a C!");
        }else if (grade >= 50){
            System.out.println("Instructor: You got a D.");
        }else {
            System.out.println("Instructor: You got a F. You Failed :(");
        }

        // Section 3: Browser type
        String browser = "Chrome";
        // Check if the browser is one of the following: Chrome, Firefox, Safari, Edge, or Opera
        // Decide whether to use if-else or switch
        switch (browser) {
            case "Chrome":
            System.out.println("Enjoy your chrome extensions!"); break;
            case "Firefox":
            System.out.println("The best nonprofit browser!"); break;
            case "Safari":   
            System.out.println("I see you're a proude Apple user!"); break;
            case "Edge":  
            System.out.println("I see that you have the appreciation for a fast, secure, and modern browsing experience"); break;
            case "Opera":
            System.out.println("Your choice of the Opera browser reveals a discerning taste for innovation and versatility"); break;
            default:
               
        }
        

    }
}
