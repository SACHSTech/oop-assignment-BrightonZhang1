package Netflix;

import java.io.*;
import java.util.ArrayList;
import Netflix.*;

public class NetflixList {
    private ArrayList<Movie> movieList = new ArrayList<Movie>();
    private ArrayList<Show> showList = new ArrayList<Show>();
    private ArrayList<Anime> animeList = new ArrayList<Anime>();

    Movie AvengersEndgame = new Movie("Avengers: Endgame", "Action, Adventure, Superhero", "2019", "Anthony Russo", 8.4, 182);
    Movie Smile = new Movie("Smile", "Horror, Psychological Horror", "2022", "Parker Finn", 6.7, 115);
    Movie Interstellar = new Movie("Interstellar", "Sci-Fi, Adventure", "2014", "Christopher Nolan", 8.6, 169);
    Movie HomeAlone = new Movie("Home Along", "Comedy, Family", "1990", "Chris Columbus", 7.7, 103);

    
    // Adds movies to a list that can displayed
    public NetflixList(){
        movieList.add(AvengersEndgame);
        movieList.add(Smile);
        movieList.add(Interstellar);
    }

    
}