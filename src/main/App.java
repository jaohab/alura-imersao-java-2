package main;

import main.movies.PopularMovies;
import main.movies.TopMovies;
import main.shows.PopularTvShows;
import main.shows.TopTvShows;

public class App {

    public static void main(String[] args) throws Exception {

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

    }
}