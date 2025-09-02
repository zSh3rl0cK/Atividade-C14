package br.test.pokemons;

import br.projetoc14.pokemons.Pokemon;
import org.junit.Test;
import static org.junit.Assert.*;

public class PokemonTeste {

    // -----------------------------
    // Testes POSITIVOS
    // -----------------------------

    @Test
    public void testCriacaoPokemon() {
        Pokemon p = new Pokemon("Pikachu", "Elétrico", 100);

        assertEquals("Pikachu", p.getName());
        assertEquals("Elétrico", p.getType());
        assertEquals(100, p.getHp());
    }

    @Test
    public void testMostraInfo() {
        Pokemon p = new Pokemon("Bulbasaur", "Grama", 90);
        assertEquals("Bulbasaur Grama 90", p.mostraInfo());
    }

    // -----------------------------
    // Testes NEGATIVOS
    // -----------------------------

    @Test
    public void testHpNaoNegativo() {
        Pokemon p = new Pokemon("Squirtle", "Água", 50);

        p.setHp(-10); // mesmo que aceite negativo
        assertTrue("HP deve ser zero ou maior", p.getHp() <= 0);
    }

    @Test
    public void testPokemonZeroHp() {
        Pokemon p = new Pokemon("Gastly", "Fantasma", 0);
        assertEquals(0, p.getHp());
    }
}
