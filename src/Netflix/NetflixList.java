package Netflix;

import java.util.ArrayList;

public class NetflixList {
    private ArrayList<Movie> movieList = new ArrayList<Movie>();
    private ArrayList<Show> showList = new ArrayList<Show>();

    // Setting movie objects
    Movie AvengersEndgame = new Movie("Avengers: Endgame", "Movie", "Action, Adventure, Superhero", "2019", "Anthony Russo", 8.4, 182);
    Movie Smile = new Movie("Smile", "Movie", "Horror, Psychological Horror", "2022", "Parker Finn", 6.7, 115);
    Movie Interstellar = new Movie("Interstellar", "Movie", "Sci-Fi, Adventure", "2014", "Christopher Nolan", 8.6, 169);
    Movie HomeAlone = new Movie("Home Alone", "Movie", "Comedy, Family", "1990", "Chris Columbus", 7.7, 103);
    Movie Inception = new Movie("Inception", "Movie", "Sci-Fi, Action", "2010", "Christopher Nolan", 8.8, 148);

    // Setting show objects 
    Show BreakingBad = new Show("Breaking Bad", "TV Show", "Crime, Drama, Thriller", "2008", "Vince Gilligan", 9.5, 49, 62);
    Show Arcane = new Show("Arcane", "TV Show", "Action, Adventure", "2021", "Pascal Charrue", 9.0, 41, 9);
    Show Friends = new Show("Friends", "TV Show", "Comedy, Romance", "1994", "David Crane", 8.9, 22, 236);
    Show BlackMirror = new Show("Black Mirror", "TV Show", "Mystery, Drama, Sci-Fi", "2011", "Charlie Brooker", 8.8, 60, 22);
    Show StrangerThings = new Show("Stranger Things", "TV Show", "Drama, Horror, Fantasy", "2016", "Matt Duffer", 8.7, 51, 34);

    
    // Adds movies and shows to a list that can displayed
    public NetflixList(){
        movieList.add(AvengersEndgame);
        movieList.add(Smile);
        movieList.add(Interstellar);
        movieList.add(HomeAlone);
        movieList.add(Inception);

        showList.add(BreakingBad);
        showList.add(Arcane);
        showList.add(Friends);
        showList.add(BlackMirror);
        showList.add(StrangerThings);
    }

    public void getFilms(){
        System.out.println("--Movies--");
        for(int i = 0; i < movieList.size(); i++){
            System.out.println((i + 1) + ". " + movieList.get(i).getName());
        }
        System.out.println();

        System.out.println("--Shows--");
        for(int i = 0; i < showList.size(); i++){
            System.out.println((i + 6) + ". " + showList.get(i).getName());
        }
    }

    public Movie getMovie(int i){
        return movieList.get(i);
    }

    public Show getShow(int i){
        return showList.get(i);
    }
}