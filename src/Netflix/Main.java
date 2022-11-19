package Netflix;

import java.io.*;
import Netflix.*;


public class Main {
    static BufferedReader keyboard;
    public static void main (String[] args) throws IOException {
        keyboard = new BufferedReader(new InputStreamReader(System.in));
        //initalizing objects

        Movie AvengersEndgame = new Movie("Avengers: Endgame", "Action, Adventure, Superhero", "2019", "Anthony Russo", 8.4, 182);
        Movie Smile = new Movie("Smile", "Horror, Psychological Horror", "2022", "Parker Finn", 6.7, 115);
        Movie Interstellar = new Movie("Interstellar", "Sci-Fi, Adventure", "2014", "Christopher Nolan", 8.6, 169);

    }
}
