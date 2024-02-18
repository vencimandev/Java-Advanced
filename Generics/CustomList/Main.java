package CustomList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main<T extends Comparable<T>> {
    private ArrayList<T> elements;

    public Main() {
        this.elements = new ArrayList<>();
    }

    public void add(T element) {
        elements.add(element);
    }

    public T remove(int index) {
        return elements.remove(index);
    }

    public boolean contains(T element) {
        return elements.contains(element);
    }

    public void swap(int index1, int index2) {
        T temp = elements.get(index1);
        elements.set(index1, elements.get(index2));
        elements.set(index2, temp);
    }

    public int countGreaterThan(T element) {
        return (int) elements.stream().filter(e -> e.compareTo(element) > 0).count();
    }

    public T getMax() {
        return elements.stream().max(Comparable::compareTo).orElse(null);
    }

    public T getMin() {
        return elements.stream().min(Comparable::compareTo).orElse(null);
    }

    public void print() {
        elements.forEach(System.out::println);
    }

    public static void main(String[] args) {
        Main<String> list = new Main<String>();
        Scanner scanner = new Scanner(System.in);
        String command;

        while (!(command = scanner.nextLine()).equals("END")) {
            String[] commandParts = command.split("\\s+");
            switch (commandParts[0]) {
                case "Add":
                    list.add(commandParts[1]);
                    break;
                case "Remove":
                    list.remove(Integer.parseInt(commandParts[1]));
                    break;
                case "Contains":
                    System.out.println(list.contains(commandParts[1]));
                    break;
                case "Swap":
                    list.swap(Integer.parseInt(commandParts[1]), Integer.parseInt(commandParts[2]));
                    break;
                case "Greater":
                    System.out.println(list.countGreaterThan(commandParts[1]));
                    break;
                case "Max":
                    System.out.println(list.getMax());
                    break;
                case "Min":
                    System.out.println(list.getMin());
                    break;
                case "Print":
                    list.print();
                    break;
                default:
                    break;
            }
        }
    }
}
