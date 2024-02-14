package RawData;

class Car {
    String model;
    Engine engine;
    Cargo cargo;
    Tire[] tires = new Tire[4];

    public Car(String model, Engine engine, Cargo cargo, Tire[] tires) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tires = tires;
    }
}
