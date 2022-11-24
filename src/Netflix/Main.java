package Netflix;

import java.io.*;
import Netflix.*;
import java.util.Scanner;

public class Main {
    static BufferedReader keyboard;
    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);        
        String strUser;
        String strShow;
        boolean blnMenu = true;

        // Initializing list
        NetflixList newNetflixList = new NetflixList();
        // test: newNetflixList.Interstellar.getMovieLength();

        System.out.println("Welcome to netflix list! Please state your name:");
        strUser = sc.nextLine();
        System.out.println("Hi there " + strUser + "! Here are your shows for today.");

        while(blnMenu){
            newNetflixList.getFilms();
            System.out.println();

            System.out.println("What would you like to do?");
            System.out.println("1. Browse films (Film details)\n2. Customize Lists\n3. Exit");

            switch(sc.nextLine()){
                case "1":
                    System.out.println("Which show would you like to browse? (Type the name of the show)");
                    strShow = sc.nextLine();
                    System.out.println(newNetflixList);
            }
        }

        sc.close();
    }
}
