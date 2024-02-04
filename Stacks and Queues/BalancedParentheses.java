import java.util.Scanner;
import java.util.Stack;

public class BalancedParentheses {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the sequence of parentheses
        String sequence = scanner.nextLine();

        // Check if the parentheses are balanced
        if (areParenthesesBalanced(sequence)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean areParenthesesBalanced(String sequence) {
        Stack<Character> stack = new Stack<>();

        // Iterate through each character in the sequence
        for (char ch : sequence.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                // Push opening parentheses onto the stack
                stack.push(ch);
            } else {
                // Check if the stack is empty (no matching opening parenthesis)
                if (stack.isEmpty()) {
                    return false;
                }

                // Pop the top element from the stack
                char top = stack.pop();

                // Check if the popped opening parenthesis matches the current closing parenthesis
                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // Check if the stack is empty (all opening parentheses have matching closing parentheses)
        return stack.isEmpty();
    }
}
