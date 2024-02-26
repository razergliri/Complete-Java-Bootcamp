public class Samplejosephus {
    public static int josephus(int n, int k) {
        if (n == 1) {
            return 1;
        } else {
            return (josephus(n - 1, k) + k - 1) % n + 1;
        }
    }
    public static void main(String[] args) {
        int numberOfPeople = 10;
        int k = 2; // You can adjust k as needed

        int survivorPosition = josephus(numberOfPeople, k);
        System.out.println("The survivor is at position: " + survivorPosition);
    }
}
