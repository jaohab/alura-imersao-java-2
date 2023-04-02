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
            
            // Caso não encontre o o linkda na imagem no paramentro "image", tentar com o parametro "url"
            InputStream img;
            try {
                img = new URL(content.get("image")).openStream();
            } catch (Exception e) {
                img = new URL(content.get("url")).openStream();
            }

            // Caso não encontre o "rating" será atribuido o valor de "0"
            int rating;
            try {
                rating = (int) Double.parseDouble(content.get("imDbRating"));
            } catch (Exception e) {
                rating = 0;
            }

            var newImg = new ImgConstructor();
            newImg.gerar(name, img, rating);

            System.out.println("Imagem gerada do filme: " + content.get("title"));           
        }

    }
    
}
