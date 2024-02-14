package RawData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Car> cars = new ArrayList<>();

        int N = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < N; i++) {
            String[] carInfo = scanner.nextLine().split("\\s+");
            String model = carInfo[0];
            Engine engine = new Engine(Integer.parseInt(carInfo[1]), Integer.parseInt(carInfo[2]));
            Cargo cargo = new Cargo(Integer.parseInt(carInfo[3]), carInfo[4]);
            Tire[] tires = new Tire[4];
            for (int j = 0; j < 4; j++) {
                tires[j] = new Tire(Double.parseDouble(carInfo[5 + 2 * j]), Integer.parseInt(carInfo[6 + 2 * j]));
            }

            cars.add(new Car(model, engine, cargo, tires));
        }

        String command = scanner.nextLine();
        for (Car car : cars) {
            if ("fragile".equals(command)) {
                if ("fragile".equals(car.cargo.type) && hasLowPressureTire(car.tires)) {
                    System.out.println(car.model);
                }
            } else if ("flamable".equals(command)) {
                if ("flamable".equals(car.cargo.type) && car.engine.power > 250) {
                    System.out.println(car.model);
                }
            }
        }
    }

    private static boolean hasLowPressureTire(Tire[] tires) {
        for (Tire tire : tires) {
            if (tire.pressure < 1) return true;
        }
        return false;
    }
}