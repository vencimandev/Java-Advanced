import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        // Split the input line into an array of strings
        String[] numbers = inputLine.split(" ");

        // Create a stack using ArrayDeque
        Deque<Integer> stack = new ArrayDeque<>();

        // Push each number onto the stack
        for (String num : numbers) {
            stack.push(Integer.parseInt(num));
        }

        // Pop and print the reversed numbers
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        scanner.close();
    }
}
