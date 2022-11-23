package Netflix;

import java.io.*;
import Netflix.*;

public class Main {
    static BufferedReader keyboard;
    public static void main (String[] args) throws IOException {
        keyboard = new BufferedReader(new InputStreamReader(System.in));
        // Initializing list
        NetflixList newNetflixList = new NetflixList();
        // test: newNetflixList.Interstellar.getMovieLength();
        newNetflixList.getFilms();
    }
}
