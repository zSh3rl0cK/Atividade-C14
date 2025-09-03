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
    public void getPikachuTest(){
        try {
            PokeApiClient client = new PokeApiClient();
            Pokemon pikachu = client.getPokemon("pikachu");

            assertNotNull(pikachu);
            assertEquals("electric", pikachu.getFirstType());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void namePikachuTest(){
        try {
            PokeApiClient client = new PokeApiClient();
            Pokemon pikachu = client.getPokemon("pikachu");

            assertEquals("pikachu", pikachu.getName());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void hpPikachuTest(){
        try {
            PokeApiClient client = new PokeApiClient();
            Pokemon pikachu = client.getPokemon("pikachu");

            assertEquals(35, pikachu.getHp()); // valor oficial na PokéAPI
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

            assertEquals("electric", pikachu.getFirstType());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void caseInsensitiveTest(){
        try {
            PokeApiClient client = new PokeApiClient();
            Pokemon p1 = client.getPokemon("Pikachu");
            Pokemon p2 = client.getPokemon("pikachu");
            assertEquals(p1, p2);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void pokemonByIdTest(){
        try {
            PokeApiClient client = new PokeApiClient();
            Pokemon Mew = client.getPokemon("151");
            assertEquals(Mew.getName(), "Mew");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testMostraInfoTest(){
        try {
            PokeApiClient client = new PokeApiClient();
            Pokemon pokemon = client.getPokemon("Gardevoir");
            String info = pokemon.mostraInfo();

            assertTrue(info.contains("Gardevoir"));
            assertTrue(info.contains("Psychic"));
            assertTrue(info.contains("Fairy"));
            assertTrue(info.contains("68"));
        } catch (Exception e) {
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
    public void testPokemonInexistente() {
        PokeApiClient client = new PokeApiClient();
        Exception exception = assertThrows(RuntimeException.class, () -> {
            client.getPokemon("xyzpokemon");
        });

        assertTrue(exception.getMessage().contains("Erro ao buscar Pokémon"));


    }

}
