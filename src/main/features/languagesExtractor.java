package main.features;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import main.interfaces.Extractor;
import main.functions.JsonParser;
import main.functions.ClientHTTP;
import main.functions.Content;

public class languagesExtractor implements Extractor {

    // Extrair só os dados de interesse (Título, imagem, classificação)
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

            var content = new Content(selecting.get("name"), selecting.get("image"), selecting.get("ranking"));
            selectContent.add(content);

        }

        return selectContent;

    }

    @Override
    public void showContent(String apiUrl) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showContent'");
    }

}
