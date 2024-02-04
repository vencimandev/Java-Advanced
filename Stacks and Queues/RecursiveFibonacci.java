import java.util.HashMap;
import java.util.Scanner;

public class RecursiveFibonacci {
    // HashMap for memoization
    private static HashMap<Integer, Long> memo = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        long result = getFibonacci(n);
        System.out.println(result);

        // Close the scanner
        scanner.close();
    }

    private static long getFibonacci(int n) {
        // Base cases
        if (n <= 1) {
            return 1;
        }

        // Check if the result is already memoized
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        // Recursive calculation
        long fib = getFibonacci(n - 1) + getFibonacci(n - 2);

        // Memoize the result
        memo.put(n, fib);

        return fib;
    }
}
