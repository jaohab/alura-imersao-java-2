package main;

import main.features.ImdbExtractor;
import main.functions.ClientHTTP;

public class App {

    public static void main(String[] args) {

        String apiUrl = "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/MostPopularMovies.json";

        var client = new ClientHTTP();
        System.out.println(client.findData(apiUrl));

        apiUrl = client.findData(apiUrl);

        var imdb = new ImdbExtractor();
        System.out.println(imdb.contents(apiUrl));

    }

}
