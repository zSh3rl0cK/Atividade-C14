package org.example;

import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Pokemon pokemon1 = new Pokemon("Gardevoir", "Psychic");

        // Converter para JSON com Gson
        Gson gson = new Gson();
        String json = gson.toJson(pokemon1.mostraInfo());

        // Mostrar saída
        System.out.println("JSON gerado: " + json);
    }
}






