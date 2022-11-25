package Netflix;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static BufferedReader keyboard;
    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);        
        String strUser;
        int strShow;
        boolean blnMenu = true;
        ArrayList<Film> filmList = new ArrayList<Film>();


        // Initializing list
        NetflixList newNetflixList = new NetflixList();
        // test: newNetflixList.Interstellar.getMovieLength();
        // newNetflixList.Interstellar.setRating(); changes user rating

        System.out.println("Welcome to netflix list! Please state your name:");
        strUser = sc.nextLine();
        System.out.println("Hi there " + strUser + "! Here are your shows for today.");

        while(blnMenu){
            newNetflixList.getFilms();
            System.out.println();
            System.out.println("What would you like to do?");
            System.out.println("1. Browse films (Film details)\n2. Customize Lists\n3. Ratings\n4. Exit");
            System.out.println();

            switch(sc.nextLine()){
                case "1":
                    System.out.println("Which show would you like to browse? (Type the number of the show): ");
                    strShow = sc.nextInt();
                    System.out.println();
                    if(strShow < 6){
                        System.out.println(newNetflixList.getMovie(strShow - 1));
                    }
                    else if(strShow > 5){
                        System.out.println(newNetflixList.getShow(strShow - 6));
                    }
                    sc.nextLine();
                    break;
                case "2":
                    System.out.println("Here is your list so far: ");
                    for(int i = 0; i < 10; i++){
                        if(i <= filmList.size()){
                            System.out.println(filmList.get(i));
                        }
                    }
            }
        }
        sc.close();
    }
}
