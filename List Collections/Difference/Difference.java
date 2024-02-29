import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Difference{
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();
        
        for(int i=0; i< 11_000_000; i++){
            linkedList.add(i);
            arrayList.add(i);
        }
        
        /* First test of Efficiency: Fetching Data */
        System.out.println("Fetching Data");
        long start = System.currentTimeMillis();
        linkedList.get(4_500_000);
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start ) + "ms");

        start = System.currentTimeMillis();
        arrayList.get(4_500_000);
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start ) + "ms");
        
        System.out.println("\nFIRST AND LAST INDEX\n");
        start = System.currentTimeMillis();
        linkedList.get(0);
        linkedList.get(linkedList.size() - 1 );
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
        arrayList.get(0);
        arrayList.get(arrayList.size() - 1 );
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start) + "ms");


          
        System.out.println("\nINSERTION FROM MIDDLE\n");
        start = System.currentTimeMillis();
        linkedList.add(5, 121);
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
        arrayList.add(5, 121);
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start) + "ms");

        System.out.println("\nINSERTION\n");
        start = System.currentTimeMillis();
        linkedList.add(121);
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
        arrayList.add(121);
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start) + "ms");

        System.out.println("\nREMOVAL\n");
        start = System.currentTimeMillis();
        linkedList.remove(400);
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
        arrayList.remove(400);
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start) + "ms");

        System.out.println("\nUPDATES\n");
        start = System.currentTimeMillis();
        linkedList.set(4_500_000, 5);
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
        arrayList.set(4_500_000, 5);
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start) + "ms");

    }
}