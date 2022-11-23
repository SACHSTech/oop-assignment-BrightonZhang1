package Netflix;

import java.io.*;
import Netflix.*;
import java.util.Scanner;

public class Main {
    static BufferedReader keyboard;
    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);        
        String strUser;
        boolean blnBrowsing = true;

        // Initializing list
        NetflixList newNetflixList = new NetflixList();
        // test: newNetflixList.Interstellar.getMovieLength();

        System.out.println("Welcome to netflix list! Please state your name:");
        strUser = sc.nextLine();
        System.out.println("Hi there " + strUser + "! Here are your shows for today.");

        while(blnBrowsing){
            newNetflixList.getFilms();

            System.out.println("What would you like to do?");
        }

        sc.close();
    }
}
