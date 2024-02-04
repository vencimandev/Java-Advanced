import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        StringBuilder text = new StringBuilder();
        Stack<String> undoStack = new Stack<>();

        for (int i = 0; i < N; i++) {
            String[] operation = scanner.nextLine().split(" ");
            int command = Integer.parseInt(operation[0]);

            switch (command) {
                case 1:
                    // Append to the end of the text
                    undoStack.push(text.toString());
                    text.append(operation[1]);
                    break;
                case 2:
                    // Erase the last count elements from the text
                    undoStack.push(text.toString());
                    int count = Integer.parseInt(operation[1]);
                    int length = text.length();
                    text.delete(length - count, length);
                    break;
                case 3:
                    // Print the element at position index
                    int index = Integer.parseInt(operation[1]) - 1;
                    System.out.println(text.charAt(index));
                    break;
                case 4:
                    // Undo the last not-undone command of type 1 or 2
                    if (!undoStack.isEmpty()) {
                        text = new StringBuilder(undoStack.pop());
                    }
                    break;
            }
        }

        // Close the scanner
        scanner.close();
    }
}
