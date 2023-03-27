import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;

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

public class TopTvShows {

    public void showTopTvShows() throws Exception {

        // Estabelecer uma conexão HTTP e com a API
        // String key = System.getenv("IMDB_API_KEY");
        // final String URL = "https://imdb-api.com/en/API/Top250TVs/".concat(key);

        // URL ALternativa
        String URL = "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopTVs.json";

        URI address = URI.create(URL);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(address).GET().build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        String body = response.body();
        // System.out.println(body);

        // Extrair os dados de interesse (Título, poster e classificação)
        JsonParser parser = new JsonParser();
        List<Map<String, String>> listaDeFilmes = parser.parse(body);
        //System.out.println(listaDeFilmes.size());

        // Exibir e manipular os dados
        System.out.println(Style.T_VERDE + Style.NEGRITO + "TOP 250 SÉRIES\n" + Style.RESETAR);

        for (Map<String, String> show : listaDeFilmes) {
            System.out.println("Título: " + Style.NEGRITO + show.get("title") + Style.RESETAR);
            System.out.println(Style.T_AZUL + Style.ITALICO + show.get("image") + Style.RESETAR);
            System.out.print(show.get("imDbRating"));
            System.out.print(" - ");

            double temp = Double.parseDouble(show.get("imDbRating"));
            int rating = (int) temp;

            for (int i = 0; i < rating; i++) {
                System.out.print(Style.ESTRELA + Style.RESETAR);
            }
            System.out.println("\n");
        }
    }

}