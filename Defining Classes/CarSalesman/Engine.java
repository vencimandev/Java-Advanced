package CarSalesman;

class Engine {
    String model;
    int power;
    Integer displacement; // Using Integer to allow null values for optional fields
    String efficiency;

    public Engine(String model, int power) {
        this.model = model;
        this.power = power;
    }

    @Override
    public String toString() {
        return String.format("%s:\nPower: %d\nDisplacement: %s\nEfficiency: %s",
                model, power, displacement == null ? "n/a" : displacement, efficiency == null ? "n/a" : efficiency);
    }
}
