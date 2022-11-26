package Netflix;

/**
 * Show class file / extends abstract Film class
 * @author: Brighton Zhang
 * 
 */

public class Movie extends Film {

    // Instance variables
    private int intMovieLength;
    private boolean blnFavourite;

    /**
     * Movie constructor method
     * @param filmName
     * @param filmType
     * @param filmGenre
     * @param filmDate
     * @param filmDirector
     * @param filmRating
     * @param filmMovieLength
     */
    public Movie(String filmName, String filmType, String filmGenre, String filmDate, String filmDirector, Double filmRating, int filmMovieLength) {
        super(filmName, filmType, filmGenre, filmDate, filmDirector, filmRating);
        intMovieLength = filmMovieLength;
    }
    
    /**
     * Returns the movie length in terms of hours and minutes
     * 
     * @return movie length
     */
    public String getMovieLength(){
        return (intMovieLength / 60) + "h " + intMovieLength % 60 + "m";
    }

    /*
     * Prints out details of the selected movie
     * 
     * @return details of the specified movie
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

    /**
     * Setter method sets blnFavourite as true;
     */
    public void setFavourite(){
        blnFavourite = true;
    }
}
