package br.projetoc14;

import br.projetoc14.api.PokeApiClient;
import br.projetoc14.pokemons.Pokemon;
import com.google.gson.Gson;

import java.util.Scanner;

import static br.projetoc14.Utils.Util.lerHPSeguro;

public class App {
    public static void main(String[] args) throws Exception {
        PokeApiClient client = new PokeApiClient();

        Pokemon pikachu = client.getPokemon("pikachu");
        System.out.println(pikachu.mostraInfo());

        Pokemon charmander = client.getPokemon("charmander");
        System.out.println(charmander.mostraInfo());
    }
}