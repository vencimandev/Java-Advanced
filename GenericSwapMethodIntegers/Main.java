package GenericSwapMethodIntegers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the number of elements
        int n = Integer.parseInt(scanner.nextLine());

        // Reading integers and adding to the list
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(scanner.nextLine()));
        }

        // Reading indexes to swap
        String[] indexes = scanner.nextLine().split(" ");
        int index1 = Integer.parseInt(indexes[0]);
        int index2 = Integer.parseInt(indexes[1]);

        // Swapping the elements
        swapElements(list, index1, index2);

        // Printing the list after swap
        printList(list);
    }

    // Generic method to swap elements in a list
    public static <T> void swapElements(List<T> list, int index1, int index2) {
        T temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }

    // Generic method to print elements of a list
    public static <T> void printList(List<T> list) {
        for (T element : list) {
            System.out.println("java.lang." + element.getClass().getSimpleName() + ": " + element);
        }
    }
}
