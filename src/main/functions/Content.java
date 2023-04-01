package main.functions;

public class Content {

    private final String title;
    private final String urlImg;
    private final String rating;

    public Content(String title, String urlImg) {
        this.title = title;
        this.urlImg = urlImg;
        this.rating = null;
    }

    public Content(String title, String urlImg, String rating) {
        this.title = title;
        this.urlImg = urlImg;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public String getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "\nContent [title=" + title + ", urlImg=" + urlImg + ", rating=" + rating + "]";
    }    

}
