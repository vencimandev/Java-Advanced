import java.util.Scanner;
import java.util.Stack;

public class MaximumElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of commands
        int N = scanner.nextInt();

        // Create a stack to store elements
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            int type = scanner.nextInt();

            switch (type) {
                case 1:
                    // Push the element X into the stack
                    int X = scanner.nextInt();
                    stack.push(X);
                    break;
                case 2:
                    // Delete the element present at the top of the stack
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                    break;
                case 3:
                    // Print the maximum element in the stack
                    if (!stack.isEmpty()) {
                        int maxElement = getMaxElement(stack);
                        System.out.println(maxElement);
                    }
                    break;
                default:
                    break;
            }
        }
    }

    // Helper method to get the maximum element in the stack
    private static int getMaxElement(Stack<Integer> stack) {
        int maxElement = Integer.MIN_VALUE;

        for (int element : stack) {
            if (element > maxElement) {
                maxElement = element;
            }
        }

        return maxElement;
    }
}
