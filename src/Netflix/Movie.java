package Netflix;

public class Movie extends Film {
    private int intMovieLength;
    private boolean blnFavourite;

    public Movie(String filmName, String filmType, String filmGenre, String filmDate, String filmDirector, Double filmRating, int filmMovieLength) {
        super(filmName, filmType, filmGenre, filmDate, filmDirector, filmRating);
        intMovieLength = filmMovieLength;
    }
    
    public String getMovieLength(){
        return (intMovieLength / 60) + "h " + intMovieLength % 60 + "m";
    }

    /*
     * Prints the details of the film
     * 
     * @return release date of film
     */
    public String toString(){
        System.out.println("---------------------------------------");
        if(blnFavourite){
            System.out.println("FAVOURITE");
        }
        System.out.println("Name: " + getName());
        System.out.println("Type of Film: " + getType());
        System.out.println("Genre: " + getGenre());
        System.out.println("Release Date: " + getPublishDate());
        System.out.println("Director: " + getDirector());
        System.out.println("IMDB Rating: " + getRating());
        System.out.println("Length: " + getMovieLength());
        System.out.println("---------------------------------------");
        return "";
    }

    public void setFavourite(){
        blnFavourite = true;
    }
}
