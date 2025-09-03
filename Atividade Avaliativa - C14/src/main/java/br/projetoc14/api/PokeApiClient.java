package br.projetoc14.api;

import com.google.gson.Gson;
import java.net.http.*;
import java.net.URI;
import br.projetoc14.pokemons.Pokemon;

public class PokeApiClient {
    private static final String BASE_URL = "https://pokeapi.co/api/v2/pokemon/";

    public Pokemon getPokemon(String name) throws Exception {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE_URL + name.toLowerCase()))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() != 200) {
            throw new RuntimeException("Erro ao buscar Pokémon: " + response.statusCode());
        }

        Gson gson = new Gson();
        return gson.fromJson(response.body(), Pokemon.class);
    }
}
