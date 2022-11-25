package Netflix;
import java.util.Scanner;

public class Show extends Film{
    private int episodeLength;
    private int episodeNum;
    private double dblUserRating;

    public Show(String filmName, String filmType, String filmGenre, String filmDate, String filmDirector, Double filmRating, int showEpisodeLength, int showEpisodeNum) {
        super(filmName, filmType, filmGenre, filmDate, filmDirector, filmRating);
        episodeLength = showEpisodeLength;
        episodeNum = showEpisodeNum;
    }

    public int getEpisodeLength(){
        return episodeLength;
    }

    public int getEpisodeNum(){
        return episodeNum;
    }

    public void setUserRating(){
        Scanner sc = new Scanner(System.in);        
        dblUserRating = (sc.nextDouble());
        sc.close();
    }

    public String toString(){
        System.out.println("---------------------------------------");
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
