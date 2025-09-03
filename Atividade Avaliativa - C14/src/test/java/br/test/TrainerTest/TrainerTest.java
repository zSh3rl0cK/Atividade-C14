package br.test.TrainerTest;

import br.projetoc14.api.PokeApiClient;
import br.projetoc14.pokemons.Pokemon;
import br.projetoc14.trainers.Trainer;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrainerTest {

    // -----------------------------
    // Testes NEGATIVOS
    // -----------------------------

    // Testa se retorna null quando nenhum Pokémon é setado
    @Test
    public void retornaPokeNullTest() {
        Trainer trainer = new Trainer();
        trainer.setPokemons(null);

        assertNull("O Pokémon não deveria ser null", trainer.getPokemons());
    }

    // Testa se escolherPokemonInicial retorna null quando não há Pokémon
    @Test
    public void escolherPokemonInicialNullTest() {
        Trainer trainer = new Trainer();
        assertNull("Sem Pokémon atribuído, deveria retornar null", trainer.escolherPokemonInicial());
    }

    // Testa se escolherProximoPokemon retorna null quando não há Pokémon
    @Test
    public void escolherProximoPokemonNullTest() {
        Trainer trainer = new Trainer();
        assertNull("Sem Pokémon atribuído, deveria retornar null", trainer.escolherProximoPokemon());
    }

    // -----------------------------
    // Testes POSITIVOS
    // -----------------------------

    // Testa set e get do nome do treinador
    @Test
    public void setAndGetNameTest() {
        Trainer trainer = new Trainer();
        trainer.setName("Ash Ketchum");

        assertEquals("Ash Ketchum", trainer.getName());
    }

    // Testa se o Pokémon é corretamente atribuído

    @Test
    public void getPokemonTest() {
        try {
            Trainer trainer = new Trainer();
            PokeApiClient client = new PokeApiClient();
            Pokemon pokemon = client.getPokemon("Ghastly");
            trainer.setPokemons(pokemon);

            assertEquals(Pokemon.class, trainer.getPokemons().getClass());
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
