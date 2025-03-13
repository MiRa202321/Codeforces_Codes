 import java.util.*;

public class MaxLastElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = sc.nextInt(); // Number of elements
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

            for (int i = 0; i < n; i++) {
                maxHeap.add(sc.nextInt()); // Insert all elements into max heap
            }

            while (maxHeap.size() > 1) {
                int a = maxHeap.poll(); // Largest
                int b = maxHeap.poll(); // Second largest
                int x = a + b - 1; // Max valid triangle side
                maxHeap.add(x);
            }

            System.out.println(maxHeap.poll()); // Print last remaining element
        }

        sc.close();
    }
}
