package br.projetoc14.trainers;

import br.projetoc14.pokemons.Pokemon;
import br.projetoc14.api.PokeApiClient;

public class Trainer {
    private String name;
    private Pokemon pokemons; // por enquanto um Pokémon só
    private PokeApiClient apiClient;

    public Trainer(String name) {
        this.name = name;
        this.apiClient = new PokeApiClient();
    }

    /**
     * Escolhe um Pokémon inicial pelo nome (busca na API)
     */
    public void escolherPokemonInicial(String nomePokemon) {
        try {
            this.pokemons = apiClient.getPokemon(nomePokemon);
        } catch (Exception e) {
            System.out.println("Erro ao buscar Pokémon: " + e.getMessage());
            this.pokemons = null;
        }
    }

    /**
     * Escolhe o próximo Pokémon (pode ser o mesmo por enquanto)
     */
    public void escolherProximoPokemon(String nomePokemon) {
        try {
            this.pokemons = apiClient.getPokemon(nomePokemon);
        } catch (Exception e) {
            System.out.println("Erro ao buscar Pokémon: " + e.getMessage());
            this.pokemons = null;
        }
    }

    // Getters & Setters
    public String getName() {
        return name;
    }

    public Pokemon getPokemons() {
        return pokemons;
    }

    public void setName(String name) {
        this.name = name;
    }
}
