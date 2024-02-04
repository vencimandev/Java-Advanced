import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BasicQueueOperation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values
        int N = scanner.nextInt();
        int S = scanner.nextInt();
        int X = scanner.nextInt();

        // Create a queue to store elements
        Queue<Integer> queue = new LinkedList<>();

        // Enqueue N elements into the queue
        for (int i = 0; i < N; i++) {
            int element = scanner.nextInt();
            queue.add(element);
        }

        // Dequeue S elements from the queue
        for (int i = 0; i < S; i++) {
            if (!queue.isEmpty()) {
                queue.poll();
            }
        }

        // Check if X is present in the queue
        if (queue.contains(X)) {
            System.out.println("true");
        } else {
            // Print the smallest element in the queue, or 0 if the queue is empty
            if (!queue.isEmpty()) {
                int minElement = getMinElement(queue);
                System.out.println(minElement);
            } else {
                System.out.println(0);
            }
        }
    }

    // Helper method to get the smallest element in the queue
    private static int getMinElement(Queue<Integer> queue) {
        int minElement = Integer.MAX_VALUE;

        for (int element : queue) {
            if (element < minElement) {
                minElement = element;
            }
        }

        return minElement;
    }
}

