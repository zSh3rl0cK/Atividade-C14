package br.projetoc14.trainers;

import br.projetoc14.pokemons.Pokemon;

public class Trainer {
    private String name;
    private Pokemon pokemons;

    /*public Trainer(String name) {
        this.name = name;
    }*/

    public Pokemon escolherPokemonInicial() {
        return pokemons;
    }

    public Pokemon escolherProximoPokemon() {
        return pokemons;
    }

    // Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pokemon getPokemons() {
        return pokemons;
    }

    public void setPokemons(Pokemon pokemons) {
        this.pokemons = pokemons;
    }
}
