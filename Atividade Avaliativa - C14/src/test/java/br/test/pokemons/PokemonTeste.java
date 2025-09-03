package br.test.pokemons;

import br.projetoc14.api.PokeApiClient;
import br.projetoc14.pokemons.Pokemon;
import org.junit.Test;
import static org.junit.Assert.*;

public class PokemonTeste {

    // -----------------------------
    // Testes POSITIVOS
    // -----------------------------

    @Test
    public void HpCharmanderTest(){
        try {
            PokeApiClient client = new PokeApiClient();
            Pokemon charmander = client.getPokemon("charmander");
            assertEquals(39, charmander.getHp());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void HpPikachuTest(){
        try {
            PokeApiClient client = new PokeApiClient();

            Pokemon pikachu = client.getPokemon("pikachu");
            assertEquals(32, pikachu.getHp());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // -----------------------------
    // Testes NEGATIVOS
    // -----------------------------

    @Test
    public void tipoCharmanderTest(){
        try {
            PokeApiClient client = new PokeApiClient();
            Pokemon charmander = client.getPokemon("charmander");
            assertEquals("eletric", charmander.getFirstType());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void tipoPikachuTest(){
        try {
            PokeApiClient client = new PokeApiClient();
            Pokemon pikachu = client.getPokemon("pikachu");
            assertEquals("fire", pikachu.getFirstType());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
