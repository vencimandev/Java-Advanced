package PokemonTrainer;

class Pokemon {
    String name;
    String element;
    int health;

    public Pokemon(String name, String element, int health) {
        this.name = name;
        this.element = element;
        this.health = health;
    }

    public String getElement() {
        return element;
    }

    public void reduceHealth(int amount) {
        this.health -= amount;
    }

    public boolean isAlive() {
        return this.health > 0;
    }
}