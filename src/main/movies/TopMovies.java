package main.movies;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;

import main.JsonParser;
import main.Style;

/*
 * Desafios da aula 1
 * 
 * Consumir o endpoint de filmes mais populares da API do IMDB. 
 * Procure também o endpoint que retorna as melhores séries e o que retorna as séries mais populares.
 * 
 * Usar sua criatividade para deixar a saída dos dados mais bonitinha.
 * usar emojis com código UTF-8, mostrar a nota do filme como estrelinhas, decorar o terminal com cores, negrito e itálico usando códigos ANSI, e mais!
 * 
 * Colocar a chave da API do IMDB em algum lugar fora do código como um arquivo de configuração (p. ex, um arquivo .properties) ou uma variável de ambiente.
 */

public class TopMovies {

    public void showTopMovies() throws Exception {

        // 1.1 - Estabelecer uma conexão HTTP e com a API
        // String key = System.getenv("IMDB_API_KEY");
        // String URL = "https://imdb-api.com/en/API/Top250Movies/".concat(key);

        // URL ALternativa
        String URL = "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies.json";

        URI address = URI.create(URL);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(address).GET().build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        String body = response.body();
        // System.out.println(body);

        // 1.2 - Extrair os dados de interesse (Título, poster e classificação)
        JsonParser parser = new JsonParser();
        List<Map<String, String>> listaDeFilmes = parser.parse(body);
        // System.out.println(listaDeFilmes.size());

        // 1.3 - Exibir e manipular os dados
        System.out.println(Style.T_VERDE + Style.NEGRITO + "TOP 250 FILMES\n" + Style.RESETAR);

        for (Map<String, String> filme : listaDeFilmes) {
            System.out.println("Título: " + Style.NEGRITO + filme.get("title") + Style.RESETAR);
            System.out.println(Style.T_AZUL + Style.ITALICO + filme.get("image") + Style.RESETAR);
            System.out.print(filme.get("imDbRating"));
            System.out.print(" - ");

            double temp = Double.parseDouble(filme.get("imDbRating"));
            int rating = (int) temp;

            for (int i = 0; i < rating; i++) {
                System.out.print(Style.ESTRELA + Style.RESETAR);
            }
            System.out.println("\n");
        }
    }

}