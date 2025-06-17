import java.util.*;
public class MaxHeapSortSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements (N): ");
        int n = scanner.nextInt();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            maxHeap.add(value);
        }
        System.out.println("\nElements in sorted order (descending):");
        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll() + " ");
        }

        scanner.close();
    }
}
