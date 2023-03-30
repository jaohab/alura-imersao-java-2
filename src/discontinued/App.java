package discontinued;

import discontinued.filmes.PopularMovies;
import discontinued.filmes.TopMovies;
import discontinued.gerador.GeradorDeStickers;
import discontinued.series.PopularTvShows;
import discontinued.series.TopTvShows;

public class App {

    public static void main(String[] args) throws Exception {

        // =========== Dados da API ===========
        
        TopMovies top = new TopMovies();
        top.showTopMovies();

        System.out.println(
                Style.NEGRITO + Style.T_VERMELHA
                + "-------------------------------------------------------------\n" + 
                Style.RESETAR);

        PopularMovies popular = new PopularMovies();
        popular.showPopularMovies();

        System.out.println(
                Style.NEGRITO + Style.T_VERMELHA
                + "-------------------------------------------------------------\n" + 
                Style.RESETAR);

        TopTvShows topShows = new TopTvShows();
        topShows.showTopTvShows();

        System.out.println(
                Style.NEGRITO + Style.T_VERMELHA
                + "-------------------------------------------------------------\n" + 
                Style.RESETAR);

        PopularTvShows popularShows = new PopularTvShows();
        popularShows.showPopularTvShows(); 

        // =========== Gerador de Stickers ===========        

        String linkAPI = "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/MostPopularMovies.json";

        var sticker = new GeradorDeStickers();
        sticker.gerarStickers(linkAPI);
    }
    
}
