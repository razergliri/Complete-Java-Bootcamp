import java.util.ArrayList;
import java.util.List;

public class JosephusProblem {

    public static int findSurvivorPosition(int n, int k) {
        List<Integer> people = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            people.add(i);
        }

        int index = 0;
        while (people.size() > 1) {
            index = (index + k - 1) % people.size();
            people.remove(index);
        }

        return people.get(0);
    }

    public static void main(String[] args) {
        int n = 10;
        int k = 3;
        int survivorPosition = findSurvivorPosition(n, k);
        System.out.println("The survivor is at position " + survivorPosition);
    }
}
