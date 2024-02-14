package PokemonTrainer;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Trainer {
    String name;
    int badges = 0;
    List<Pokemon> pokemons = new ArrayList<>();

    public Trainer(String name) {
        this.name = name;
    }

    public void addPokemon(Pokemon pokemon) {
        this.pokemons.add(pokemon);
    }

    public void checkElement(String element) {
        boolean hasElement = pokemons.stream().anyMatch(pokemon -> pokemon.getElement().equals(element));
        if (hasElement) {
            badges++;
        } else {
            pokemons.forEach(pokemon -> pokemon.reduceHealth(10));
            pokemons = pokemons.stream().filter(Pokemon::isAlive).collect(Collectors.toList());
        }
    }

    @Override
    public String toString() {
        return String.format("%s %d %d", name, badges, pokemons.size());
    }
}