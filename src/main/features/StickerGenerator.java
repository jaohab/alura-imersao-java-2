package main.features;

import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.Map;

import main.functions.JsonParser;
import main.functions.ImgConstructor;
import main.functions.ClientHTTP;

public class StickerGenerator {

    public void generateStickers(String apiUrl) throws Exception {

        // Acessar e guardar conteúdo da API
        var client = new ClientHTTP();
        String json = client.findData(apiUrl);

        // Parsear contéudo
        var parser = new JsonParser();
        List<Map<String, String>> data = parser.parse(json);


        // Preparar conteúdo para gerar os stickers
        System.out.println("Gerador De Stickers\n");

        for (Map<String, String> content : data) {

            String name = content.get("title");
            InputStream img = new URL(content.get("image")).openStream();
            int rating = (int) Double.parseDouble(content.get("imDbRating"));

            var newImg = new ImgConstructor();
            newImg.gerar(name, img, rating);

            System.out.println("Imagem gerada do filme: " + content.get("title"));           
        }

    }
    
}
