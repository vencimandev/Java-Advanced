import java.util.Scanner;

public class RecursiveFibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input (nth Fibonacci number)
        int n = scanner.nextInt();

        // Calculate and print the nth Fibonacci number
        int result = getFibonacci(n);
        System.out.println(result);
    }

    private static int getFibonacci(int n) {
        if (n <= 1) {
            return 1;
        }

        int prev = 1;
        int curr = 1;

        for (int i = 2; i <= n; i++) {
            int next = prev + curr;
            prev = curr;
            curr = next;
        }

        return curr;
    }
}
