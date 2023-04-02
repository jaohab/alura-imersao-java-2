package main.enums;

public enum ApiLinks {

    // IMDb links alternativos
    IMDB_TOP_MOVIES_ALT("https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies.json"),
    IMDB_MOST_POPULAR_MOVIES_ALT("https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/MostPopularMovies.json"),
    IMDB_TOP_TV_ALT("https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopTVs.json"),
    IMDB_MOST_POPULAR_TV_ALT("https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/MostPopularTVs.json"),

    // NASA links alternativos
    NASA_APOD_ALT("https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/NASA-APOD.json"),
    NASA_APOD_JAMES_WEBB_ALT("https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/NASA-APOD-JamesWebbSpaceTelescope.json");

    private String url;

    ApiLinks(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    
}
