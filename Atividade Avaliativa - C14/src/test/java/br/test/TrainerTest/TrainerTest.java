package br.test.TrainerTest;

import br.projetoc14.pokemons.Pokemon;
import br.projetoc14.trainers.Trainer;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrainerTest {

    // -----------------------------
    // Testes NEGATIVOS
    // -----------------------------

    @Test
    public void escolherPokemonCertoTest(){
        Trainer ash = new Trainer("Ash");
        ash.escolherPokemonInicial("pikachu");

        assertNotEquals("Charmander", ash.getPokemons().getName());
    }

    @Test
    public void vidaPokemonTest(){
        Trainer ash = new Trainer("Ash");
        ash.escolherPokemonInicial("pikachu");

        assertFalse(ash.getPokemons().getHp() <= 0);
    }

    @Test
    public void contemNomePokemonTrainerTest() {
        Trainer ash = new Trainer("Ash");
        ash.escolherPokemonInicial("pikachu");

        String info = ash.getPokemons().mostraInfo();
        assertTrue(info.contains("charmander"));
    }

    @Test
    public void trainersPokemonsDifferentsTest(){
        Trainer ash = new Trainer("Ash");
        Trainer Brock = new Trainer("Brock");

        ash.escolherPokemonInicial("150");
        ash.escolherPokemonInicial("151");

        assertNotEquals(ash.getPokemons().getName(), Brock.getPokemons().getName());
    }

    // -----------------------------
    // Testes POSITIVOS
    // -----------------------------

    @Test
    public void criacaoTest(){
        Trainer Ash = new Trainer("Ash");
        assertNull(Ash.getPokemons());
    }

    @Test
    public void testEscolherPokemonInicial() {
        Trainer ash = new Trainer("Ash");
        ash.escolherPokemonInicial("pikachu");

        assertNotNull(ash.getPokemons());

    }

    @Test
    public void trocaConsecutivaDePokemonTest() {
        Trainer ash = new Trainer("Ash");

        String[] nomes = {"pikachu", "charmander", "bulbasaur"};
        for (String nome : nomes) {
            ash.escolherProximoPokemon(nome);
            assertEquals(nome.toLowerCase(), ash.getPokemons().getName());
        }
    }

    @Test
    public void contemHpPokemonTrainerTest() {
        Trainer ash = new Trainer("Ash");
        ash.escolherPokemonInicial("pikachu");
        String info = ash.getPokemons().mostraInfo();

        assertTrue(info.contains("HP:"));
    }

    @Test
    public void contemTipoPokemonTrainerTest() {
        Trainer ash = new Trainer("Ash");
        ash.escolherPokemonInicial("pikachu");
        String info = ash.getPokemons().mostraInfo();

        assertTrue(info.contains(ash.getPokemons().getFirstType()));
    }

}
