package main.features;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import main.functions.JsonParser;
import main.interfaces.Extractor;
import main.functions.Content;

public class ImdbExtractor implements Extractor {

    // Extrair só os dados de interesse (Título, imagem, classificação)

    public List<Content> contents(String json) {

        // Parsear contéudo
        var parser = new JsonParser();
        List<Map<String, String>> data = parser.parse(json);

        // Popular a lista de conteúdos
        List<Content> selectContent = new ArrayList<>();

        for (Map<String, String> selecting : data) {

            var content = new Content(selecting.get("title"), selecting.get("image"), selecting.get("imDbRating"));
            selectContent.add(content);

        }

        return selectContent;

    }

}
