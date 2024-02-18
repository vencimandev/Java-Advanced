package GenericBoxOfInteger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            Integer value = Integer.parseInt(scanner.nextLine());
            Box<Integer> box = new Box<>(value);
            System.out.println(box.toString());
        }
    }
}

