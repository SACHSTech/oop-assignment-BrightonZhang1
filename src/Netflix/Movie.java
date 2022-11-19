package Netflix;

public class Movie extends Film {
    private int movieLength;

    public Movie(String filmName, String filmGenre, String filmDate, String filmDirector, Double filmRating, int filmMovieLength) {
        super(filmName, filmGenre, filmDate, filmDirector, filmRating);
        movieLength = filmMovieLength;
    }
    
    public String getMovieLength(){
        return (movieLength / 60) + "h " + movieLength % 60 + "m";
    }
}
