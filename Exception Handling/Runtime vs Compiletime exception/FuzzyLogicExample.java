public class FuzzyLogicExample {

    public static void main(String[] args) {
        // Input: Water sensor reading (measured in percentage)
        double waterSensorReading = 75.0;

        // Output: Fuzzy inference to determine water level
        double waterLevel = calculateWaterLevel(waterSensorReading);

        // Display the results
        System.out.println("Water Sensor Reading: " + waterSensorReading + "%");
        System.out.println("Calculated Water Level: " + waterLevel + "%");
    }

    // Fuzzy inference function
    private static double calculateWaterLevel(double waterSensorReading) {
        // Fuzzy rules and membership functions
        double lowMembership = triangularMembership(waterSensorReading, 0, 25, 50);
        double mediumMembership = triangularMembership(waterSensorReading, 25, 50, 75);
        double highMembership = triangularMembership(waterSensorReading, 50, 75, 100);

        // Fuzzy sets for water level
        double lowWaterLevel = lowMembership * 0;
        double mediumWaterLevel = mediumMembership * 50;
        double highWaterLevel = highMembership * 100;

        // Defuzzification (Center of Gravity Method)
        double numerator = lowWaterLevel + mediumWaterLevel + highWaterLevel;
        double denominator = lowMembership + mediumMembership + highMembership;

        return numerator / denominator;
    }

    // Triangular membership function
    private static double triangularMembership(double x, double a, double b, double c) {
        if (x <= a || x >= c) {
            return 0.0;
        } else if (a < x && x <= b) {
            return (x - a) / (b - a);
        } else if (b < x && x < c) {
            return (c - x) / (c - b);
        }
        return 0.0;
    }
}
