package Netflix;

public class Movie extends Film {
    private int movieLength;

    public Movie(String filmName, String filmGenre, String filmDate, String filmDirector, Double filmRating, int filmMovieLength) {
        super(filmName, filmGenre, filmDate, filmDirector, filmRating);
        movieLength = filmMovieLength;
    }
    
    public int getMovieLength(){
        return movieLength;
    }
}
