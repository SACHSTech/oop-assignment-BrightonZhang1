package Netflix;

/**
 * Abstract Film Class
 * @author: Brighton Zhang
 */

public abstract class Film {
    
    // Instance variable creation
    private String strName;
    private String strType;
    private String strGenre;
    private String strDirector;
    private String strDate;
    private Double dblRating;

    /**
     * Constructor for Films
     * @param filmName - name of film
     * @param filmType - type of film (movie or show)
     * @param filmGenre - genre of gilm
     * @param filmDate - release date of film
     * @param filmDirector - director of film
     * @param filmRating - IMDB rating of film
     */
    public Film(String filmName, String filmType, String filmGenre, String filmDate,
    String filmDirector, Double filmRating){
        strName = filmName;
        strType = filmType;
        strGenre = filmGenre; 
        strDirector = filmDirector;
        strDate = filmDate;
        dblRating = filmRating;
    }

    /*
     * Returns the name of the film
     * 
     * @return name of film
     */
    public String getName() {
        return strName;
    }

    /*
     * Returns the type of the film
     * 
     * @return type of film
     */
    public String getType() {
        return strType;
    }

    /*
     * Returns the genre of the film
     * 
     * @return genre of film
     */
    public String getGenre() {
        return strGenre;
    }

    /*
     * Returns the director of the film
     * 
     * @return director of film
     */
    public String getDirector() {
        return strDirector;
    }

    /*
     * Returns the release date of the film
     * 
     * @return release date of film
     */
    public String getPublishDate() {
        return strDate;
    }

    /*
     * Returns the rating of the film
     * 
     * @return rating of film
     */
    public Double getRating() {
        return dblRating;
    }

    /*
     * Returns the name of the film
     * 
     * @return name of film
     */
    public String toString(){
        return getName();
    }

    /*
     * Abstract setter method used to set film as favourite
     */
    public abstract void setFavourite();
}
