package CarSalesman;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Engine> engines = new HashMap<>();

        int N = Integer.parseInt(scanner.nextLine()); // Number of engines
        for (int i = 0; i < N; i++) {
            String[] engineInfo = scanner.nextLine().split("\\s+");
            Engine engine = new Engine(engineInfo[0], Integer.parseInt(engineInfo[1]));
            if (engineInfo.length > 2) {
                try {
                    engine.displacement = Integer.parseInt(engineInfo[2]);
                } catch (NumberFormatException e) {
                    engine.efficiency = engineInfo[2];
                }
            }
            if (engineInfo.length > 3) {
                engine.efficiency = engineInfo[3];
            }
            engines.put(engine.model, engine);
        }

        int M = Integer.parseInt(scanner.nextLine()); // Number of cars
        for (int i = 0; i < M; i++) {
            String[] carInfo = scanner.nextLine().split("\\s+");
            Car car = new Car(carInfo[0], engines.get(carInfo[1]));
            if (carInfo.length > 2) {
                try {
                    car.weight = Integer.parseInt(carInfo[2]);
                } catch (NumberFormatException e) {
                    car.color = carInfo[2];
                }
            }
            if (carInfo.length > 3) {
                car.color = carInfo[3];
            }
            System.out.println(car);
        }
    }
}
