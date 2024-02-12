public class DocComments {
    public static void main(String[] args) {
        
    }

    /**
     * Function Name: greet
     * 
     * Inside the function:
     *  1. prints: "Hi"
     */
    public static void greet(){
        System.out.println("Hi");
    }

    /**
     * Function Name: print Text
     * 
     * @param name  (String)
     * @param age   (String)
     * 
     * 
     * Inside the function:
     *  1. prints the name and age 
     * 
     *
     */
    public static void printText(String name, String age){
        System.out.println("Hi, I'm " + name +" and I'm " + age + " years old.");
    }

    /**
     * Function name: calculate Area
     * 
     * @param length (double)
     * @param width  (double)
     * @return       (double)
     * 
     * Inside the function:
     *  1. calculates the area and returns it.
     * 
     */
    public static double calculateArea(double length, double width){
        double area = length * width;
        return area;
    }


}
