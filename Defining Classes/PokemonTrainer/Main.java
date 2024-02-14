package PokemonTrainer;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Trainer> trainers = new LinkedHashMap<>();

        String input;
        while (!(input = scanner.nextLine()).equals("Tournament")) {
            String[] data = input.split("\\s+");
            String trainerName = data[0];
            String pokemonName = data[1];
            String pokemonElement = data[2];
            int pokemonHealth = Integer.parseInt(data[3]);

            trainers.putIfAbsent(trainerName, new Trainer(trainerName));
            trainers.get(trainerName).addPokemon(new Pokemon(pokemonName, pokemonElement, pokemonHealth));
        }

        while (!(input = scanner.nextLine()).equals("End")) {
            String element = input;
            trainers.values().forEach(trainer -> trainer.checkElement(element));
        }

        trainers.values().stream()
                .sorted((t1, t2) -> Integer.compare(t2.badges, t1.badges))
                .forEach(System.out::println);
    }
}