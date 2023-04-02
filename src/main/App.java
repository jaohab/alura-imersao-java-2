package main;

import main.features.StickerGenerator;
import main.enums.ApiLinks;
import main.features.ImdbExtractor;
import main.features.NasaExtractor;
//import main.features.languagesExtractor;

public class App {

    public static void main(String[] args) throws Exception {

        String fakeLink = "https://link-inexistente-para-teste-de-exceptions.com";

        ApiLinks apiImdb = ApiLinks.IMDB_MOST_POPULAR_MOVIES_ALT;
        String url1 = apiImdb.getUrl();
        ApiLinks apiNasa = ApiLinks.NASA_APOD_JAMES_WEBB_ALT;
        String url2 = apiNasa.getUrl();
 
        var imdb = new ImdbExtractor();
        //System.out.println(imdb.contents(apiUrlImdb));
        imdb.showContent(url1);

        //var sticker = new StickerGenerator();
        //sticker.generateStickers(apiUrlImdb);

        var nasa = new NasaExtractor();
        //System.out.println(nasa.contents(apiUrlNasa));
        nasa.showContent(url2);

        //sticker.generateStickers(apiUrlNasa);

        //var languages = new languagesExtractor();
        //System.out.println(languages.contents(apiUrlLanguages));

        

    }

}
