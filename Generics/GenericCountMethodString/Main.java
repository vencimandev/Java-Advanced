package GenericCountMethodString;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the number of elements
        int n = Integer.parseInt(scanner.nextLine());
        List<String> list = new ArrayList<>();

        // Reading elements
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextLine());
        }

        // Reading the element to compare
        String comparisonBase = scanner.nextLine();

        // Counting and printing the result
        System.out.println(countGreaterElements(list, comparisonBase));
    }

    // Generic method to count elements greater than the given element
    public static <T extends Comparable<T>> int countGreaterElements(List<T> list, T element) {
        int count = 0;
        for (T listItem : list) {
            if (listItem.compareTo(element) > 0) {
                count++;
            }
        }
        return count;
    }
}
