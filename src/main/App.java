package main;

import main.features.StickerGenerator;
import main.features.ImdbExtractor;
import main.features.NasaExtractor;
//import main.features.languagesExtractor;

public class App {

    public static void main(String[] args) throws Exception {

        String apiUrlImdb = "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies.json";
        String apiUrlNasa = "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/NASA-APOD.json";
        //String apiUrlLanguages = "http://localhost:8080/linguagem";
 
        var imdb = new ImdbExtractor();
        //System.out.println(imdb.contents(apiUrlImdb));
        imdb.showContent(apiUrlImdb);

        var sticker = new StickerGenerator();
        sticker.generateStickers(apiUrlImdb);

        var nasa = new NasaExtractor();
        //System.out.println(nasa.contents(apiUrlNasa));
        nasa.showContent(apiUrlNasa);

        sticker.generateStickers(apiUrlNasa);

        //var languages = new languagesExtractor();
        //System.out.println(languages.contents(apiUrlLanguages));

        

    }

}
