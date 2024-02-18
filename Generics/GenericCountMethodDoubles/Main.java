import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of elements
        int n = Integer.parseInt(scanner.nextLine());
        List<Double> list = new ArrayList<>();

        // Read double values
        for (int i = 0; i < n; i++) {
            double value = Double.parseDouble(scanner.nextLine());
            list.add(value);
        }

        // Read the comparison value
        double comparisonValue = Double.parseDouble(scanner.nextLine());

        // Call the method to count elements greater than the comparison value
        int count = countGreaterThan(list, comparisonValue);
        System.out.println(count);
    }

    public static <T extends Comparable<T>> int countGreaterThan(List<T> list, T element) {
        int count = 0;
        for (T item : list) {
            if (item.compareTo(element) > 0) {
                count++;
            }
        }
        return count;
    }
}
