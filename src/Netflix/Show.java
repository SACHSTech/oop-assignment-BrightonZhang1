package Netflix;

/**
 * Show class file / extends abstract Film class
 * @author: Brighton Zhang
 * 
 */

public class Show extends Film{
    
    // Instance variables
    private int episodeLength;
    private int episodeNum;
    private boolean blnFavourite;

    /**
     * Show constructor method
     * 
     * @param filmName
     * @param filmType
     * @param filmGenre
     * @param filmDate
     * @param filmDirector
     * @param filmRating
     * @param showEpisodeLength
     * @param showEpisodeNum
     */
    public Show(String filmName, String filmType, String filmGenre, String filmDate, String filmDirector, Double filmRating, int showEpisodeLength, int showEpisodeNum) {
        super(filmName, filmType, filmGenre, filmDate, filmDirector, filmRating);
        episodeLength = showEpisodeLength;
        episodeNum = showEpisodeNum;
    }

    /**
     * Returns the length of the show episodes
     * @return length of episodes
     */
    public int getEpisodeLength(){
        return episodeLength;
    }

    /**
     * Returns the number of show episodes
     * @return number of episodes
     */
    public int getEpisodeNum(){
        return episodeNum;
    }

    /**
     * Setter method sets blnFavourite as true;
     */
    public void setFavourite(){
        blnFavourite = true;
    }

    /**
     * Prints out details of the selected show
     * 
     * @return details of specified food
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
        System.out.println("Number of Episodes: " + getEpisodeNum());
        System.out.println("Episode Length: " + getEpisodeLength() + "m");
        System.out.println("---------------------------------------");
        return "";
    }
}
