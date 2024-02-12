public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println("~~~Thank you for using the area calculator~~~"
        + "\nThis calculator lets you get the area of: " 
        + "\n1 -- Square" + "\n2 -- Rectangle" + "\n3 -- Triangle" + "\n4 -- Circle");
        double square = areaSquare(2);
        double rectangle = areaRectangle(1, 2);
        double triangle = areaTriangle(1, 2);
        double circle = areaCircle(2);

        printAreas(square, rectangle, triangle, circle);

    }

    /**
     * Function Name: areaSqaure
     * 
     * @param side  (double)
     * @return      (double)
     * 
     * Inside the function:
     *  1. If side is negative
     *         - prints "Error: Impossible"
     *         - shuts the app down
     *  2. Calculates the area of the square. A = side * side
     */
    public static double areaSquare(double side){
        double area;
        if(side < 0){
            System.out.println("Error: Impossible");
            System.exit(0);
        }
        area = Math.pow(side, 2);
        return area;
    }


    /**
     * Function Name: areaRectangle
     * 
     * @param length    (double)
     * @param width     (double)
     * @return          (double)
     * 
     * Inside the function:
     *  1. If the length OR width is negative
     *      - print "Error: Impossible" and
     *      - terminate the program.
     *  2. return the area: lenght * width
     */
    public static double areaRectangle(double length, double width){
        if(length < 0 || width < 0){
            System.out.println("Error: Impossible");
            System.exit(0);
        }
        double area = length * width;
        return area;
    }

    /**
     * Function Name: areaTriangle
     * 
     * @param base      (double)
     * @param height    (double)
     * @return          (double)
     * 
     * Inside the function:
     *  1. If the base Or height is negative
     *      - print "Error: Impossible"
     *      - terminate the program 
     *  2. return the area: base * height /2
     */

    public static double areaTriangle(double base, double height){
        if(base < 0 || height < 0){
            System.out.println("Error: Impossible");
            System.exit(0);
        }
        double area = (base * height) / 2;
        return area;
    }

    /**
     * Function Name: areaCircle
     * @param radius    (double)
     * @return          (double)
     * 
     * Inside the function: 
     *  1. If the radius is negative
     *      - print: "Error: Impossible"
     *      - terminate the program
     *  2. returns the area: Math.PI * radius ^ 2
     */
    public static double areaCircle(double radius){
        if(radius < 0){
            System.out.println("Error: Impossible");
            System.exit(0);
        }
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    public static void printAreas(double square, double rectangle, double triangle, double circle){
        System.out.println("\nSquare area: " + square);
        System.out.println("Rectangle area: " + rectangle);
        System.out.println("Triangle area: " + triangle);
        System.out.println("Circle area: " + circle);
    }





}
