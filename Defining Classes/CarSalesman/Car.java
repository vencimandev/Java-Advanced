package CarSalesman;

class Car {
    String model;
    Engine engine;
    Integer weight; // Using Integer to allow null values for optional fields
    String color;

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return String.format("%s:\n%s\nWeight: %s\nColor: %s",
                model, engine, weight == null ? "n/a" : weight, color == null ? "n/a" : color);
    }
}
