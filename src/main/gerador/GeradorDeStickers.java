package main.gerador;

import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;

import main.JsonParser;

public class GeradorDeStickers extends ConstrutorDeImagem {
    
    public void gerarStickers(String linkAPI) throws Exception {

        // Estabelecer uma conexão HTTP e com a API
        String URL = linkAPI;
        URI address = URI.create(URL);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(address).GET().build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        String body = response.body();

        // Extrair os dados de interesse (Título, poster e classificação)
        JsonParser parser = new JsonParser();
        List<Map<String, String>> listaDeFilmes = parser.parse(body);

        // Exibir e manipular os dados
        System.out.println("Gerador De Stickers\n");

        for (Map<String, String> item : listaDeFilmes) {

            String nome = item.get("title");
            String imagem = item.get("image");
            InputStream is = new URL(imagem).openStream();
            double temp = Double.parseDouble(item.get("imDbRating"));
            int rating = (int) temp;

            var img = new ConstrutorDeImagem();
            img.gerar(is, nome, rating);           
        }
    }

}
