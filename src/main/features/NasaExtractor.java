package main.features;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import main.interfaces.Extractor;
import main.functions.JsonParser;
import main.functions.ClientHTTP;
import main.functions.Content;
import main.res.Style;

public class NasaExtractor implements Extractor {

    // Extrair só os dados de interesse (Título, imagem)
    @Override
    public List<Content> contents(String apiUrl) {

        // Acessar e guardar conteúdo da API
        var client = new ClientHTTP();
        String json = client.findData(apiUrl);

        // Parsear contéudo
        var parser = new JsonParser();
        List<Map<String, String>> data = parser.parse(json);

        // Popular a lista de conteúdos
        List<Content> selectContent = new ArrayList<>();

        for (Map<String, String> selecting : data) {

            var content = new Content(
                selecting.get("title"), 
                selecting.get("url"), null);
            selectContent.add(content);

        }

        return selectContent;

    }

    // Exibir só os dados de interesse (Título, imagem)
    @Override
    public void showContent(String apiUrl) {

        // Acessar e guardar conteúdo da API
        var client = new ClientHTTP();
        String json = client.findData(apiUrl);

        // Parsear contéudo
        var parser = new JsonParser();
        List<Map<String, String>> data = parser.parse(json);

        // Exibir os dados
        System.out.println(
            Style.T_VERDE + Style.NEGRITO +
            "\nConteúdo da API\n" +
            Style.RESETAR);

        for (Map<String, String> content : data) {

            System.out.println("Título: " + 
                Style.NEGRITO +
                content.get("title") + 
                Style.RESETAR);

            System.out.println(
                Style.T_AZUL + Style.ITALICO +
                content.get("url") + 
                Style.RESETAR);

            System.out.println(Style.RESETAR);

        }

        System.out.println(
            Style.NEGRITO + Style.T_VERMELHA + Style.SEPARADOR + Style.RESETAR + "\n");

    }

}
