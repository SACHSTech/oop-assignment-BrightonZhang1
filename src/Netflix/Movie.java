package Netflix;
import java.util.Scanner;

public class Movie extends Film {
    private int intMovieLength;
    private double dblUserRating;

    public Movie(String filmName, String filmType, String filmGenre, String filmDate, String filmDirector, Double filmRating, int filmMovieLength) {
        super(filmName, filmType, filmGenre, filmDate, filmDirector, filmRating);
        intMovieLength = filmMovieLength;
    }
    
    public String getMovieLength(){
        return (intMovieLength / 60) + "h " + intMovieLength % 60 + "m";
    }

    // displays show info
    public String toString(){
        System.out.println("Name: " + getName());
        System.out.println("Type of Film: " + getType());
        return "";
    }

    public void setRating(){
        Scanner sc = new Scanner(System.in);        
        dblUserRating = (sc.nextDouble());
        sc.close();
    }

    public void displayInfo(){
        System.out.println();
    }
}
