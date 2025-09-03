package br.test.TrainerTest;

import br.projetoc14.pokemons.Pokemon;
import br.projetoc14.trainers.Trainer;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrainerTest {

    // -----------------------------
    // Testes NEGATIVOS
    // -----------------------------
    public void pokemonTrainerHpTest(){
        Trainer trainer = new Trainer("Pokemon Trainer");
        Trainer trainer2 = new Trainer("Pokemon Trainer");

        trainer.escolherPokemonInicial("Ghastly");
        trainer2.escolherPokemonInicial("Gardevoir");

        assertNotEquals(trainer.getPokemons().getHp(), trainer2.getPokemons().getHp());
    }



    // -----------------------------
    // Testes POSITIVOS
    // -----------------------------



    // Testa se o Pokémon é corretamente atribuído e recuperado

}
