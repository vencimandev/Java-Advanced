package GenericSwapMethodString;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    // Generic method to swap elements in a list
    public static <T> void swap(List<T> list, int index1, int index2) {
        T temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine()); // Number of elements to read
        List<String> list = new ArrayList<>();

        // Reading strings and adding them to the list
        for (int i = 0; i < n; i++) {
            String element = scanner.nextLine();
            list.add(element);
        }

        // Reading swap indexes
        String[] swapCommand = scanner.nextLine().split(" ");
        int index1 = Integer.parseInt(swapCommand[0]);
        int index2 = Integer.parseInt(swapCommand[1]);

        // Swapping elements
        swap(list, index1, index2);

        // Printing the list
        for (String element : list) {
            System.out.println("java.lang.String: " + element);
        }
    }
}

