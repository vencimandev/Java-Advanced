import java.util.Scanner;
import java.util.Stack;

public class BasicStackOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values
        String[] inputValues = scanner.nextLine().split(" ");
        int N = Integer.parseInt(inputValues[0]);
        int S = Integer.parseInt(inputValues[1]);
        int X = Integer.parseInt(inputValues[2]);

        // Read the elements as a line of numbers
        String[] elementsString = scanner.nextLine().split(" ");
        int[] elements = new int[N];
        for (int i = 0; i < N; i++) {
            elements[i] = Integer.parseInt(elementsString[i]);
        }

        stackOperations(N, S, X, elements);
    }

    public static void stackOperations(int N, int S, int X, int[] elements) {
        Stack<Integer> stack = new Stack<>();

        // Push N elements into the stack
        for (int i = 0; i < N; i++) {
            stack.push(elements[i]);
        }

        // Pop S elements from the stack
        for (int i = 0; i < S; i++) {
            if (!stack.isEmpty()) {
                stack.pop();
            }
        }

        // Check if X is present in the stack
        if (stack.contains(X)) {
            System.out.println("true");
        } else {
            // Print the smallest element in the stack, or 0 if the stack is empty
            if (!stack.isEmpty()) {
                int minElement = stack.stream().min(Integer::compare).get();
                System.out.println(minElement);
            } else {
                System.out.println(0);
            }
        }
    }
}
