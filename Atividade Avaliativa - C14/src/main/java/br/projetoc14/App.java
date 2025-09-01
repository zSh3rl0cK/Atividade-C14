package br.projetoc14;

import br.projetoc14.pokemons.Pokemon;
import com.google.gson.Gson;

import java.util.Scanner;

import static br.projetoc14.Utils.Util.lerOpcaoSegura;

public class App {
    public static void main(String[] args) {

        Pokemon pokemon1 = new Pokemon("Gardevoir", "Psychic");

        Gson gson = new Gson();
        String json = gson.toJson(pokemon1); // converte objeto direto

        System.out.println("JSON gerado: " + json);
    }
}