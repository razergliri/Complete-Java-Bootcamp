public class IfElse {

    public static void main(String[] args) {

        int chemistryGrade = 95;
        int biologyGrade = 75;
        System.out.println("Me: Hi Java, did I score better in biology?");
        // Add if-else statement here
        if (biologyGrade > chemistryGrade){
            System.out.println("Java: Yes you did, congrats!");
        }else {
            System.out.println("Java: No you did not :(");
        }

        double sales = 37.55;
        double costs = 5.55;
        System.out.println("Me: Hi Java, did we make money?");
        // Add if-else statement here
        if(sales>costs){
            System.out.println("Java: Congrats, you're rich!");
        }else {
            System.out.println("Java: Not this time!");
        }

        double temperature = 15.5;
        double targetTemperature = 20.0;
        System.out.println("Me: Hi Java, is the temperature colder than our target?");
        // Add if-else statement here
        if(temperature<targetTemperature){
            System.out.println("Java: Yes, it is. The temperature is colder than usual");
        }else{
            System.out.println("Java: No, it is not!");
        }

        int currentSpeed = 60;
        int speedLimit = 70;
        System.out.println("Me: Hi Java, am I driving slower than the speed limit?");
        // Add if-else statement here
        if(currentSpeed < speedLimit){
            System.out.println("Java: You are driving lower than the speed limit");
        }else{
            System.out.println("Java: Please slow down!");
        }

        int age = 45;
        int retirementAge = 65;
        System.out.println("Me: Hi Java, am I old enough to retire?");
        // Add if-else statement here
        if(age >= retirementAge){
            System.out.println("Java: Enjoy your pension!");
        }else{
            System.out.println("Java: You still have to work for " + (retirementAge - age) + " years");
        }

        char myGrade = 'A';
        char bestGrade = 'A';
        System.out.println("Me: Hi Java, did I get the best possible grade?");
        // Add if-else statement here
        if(myGrade == bestGrade){
            System.out.println("Java: Congrats, you got the highest score!");
        }else{
            System.out.println("No, but you will next time!");
        }

        String word = "hello";
        String secondWord = "hello";
        System.out.println("Me: Are the two words the same?");
        // Add if-else statement here
        if(word.equals(secondWord)){
            System.out.println("Java: They are the same");
        }else{
            System.out.println("Java: They are not");
        }

        String thirdWord = "hello";
        String fourthWord = "goodbye";
        System.out.println("Me: Are the two words different?");
        // Add if-else statement here

        if(!thirdWord.equals(fourthWord)){
            System.out.println("Java: They are indeed different");
        }else{

        }   System.out.println("Java: No, They are not");

    }
}
