package org.example;

import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        String type[] = new String[2];
        type[0] = "Grama";
        type[1] = "Psiquico";
        Pokemon pokemon1 = new Pokemon("Gardevoir", type);

        // Converter para JSON com Gson
        Gson gson = new Gson();
        String json = gson.toJson(pokemon1.mostraInfo());

        // Mostrar saída
        System.out.println("JSON gerado: " + json);
    }
}






