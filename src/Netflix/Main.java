package Netflix;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static BufferedReader keyboard;
    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);        
        String strUser;
        String strChoice;
        int intFilm;
        int intSlot;
        boolean blnMenu = true;
        boolean blnList = false;
        ArrayList<String> filmList = new ArrayList<String>();
        ArrayList<String> genreList = new ArrayList<String>();
        ArrayList<Film> objFilmList = new ArrayList<Film>();

        // Initializing list
        NetflixList newNetflixList = new NetflixList();

        System.out.println("Welcome to netflix list! Please state your name:");
        strUser = sc.nextLine();
        System.out.println("Hi there " + strUser + "! Here are your shows for today.");
        System.out.println();

        while(blnMenu){
            newNetflixList.getFilms();
            System.out.println();
            System.out.println("What would you like to do?");
            System.out.println("1. Browse films (Film details)\n2. Customize Lists\n3. Recommendations\n4. Exit");
            System.out.println();
            
            strChoice = sc.nextLine();
            switch(strChoice){
                case "1":
                    System.out.println("Which show would you like to browse? (Type the number of the film): ");
                    intFilm = sc.nextInt();
                    sc.nextLine();
                    System.out.println();
                    if(intFilm < 6){
                        System.out.println(newNetflixList.getMovie(intFilm - 1));
                    }
                    else if(intFilm > 5){
                        System.out.println(newNetflixList.getShow(intFilm - 6));
                    }
                    System.out.println("Type 'favourite' if you would like to favourite or unfavourite this show.\nType anything else to continue");
                    if(sc.nextLine().equalsIgnoreCase("favourite")){
                        if(intFilm < 6 ){
                            newNetflixList.getMovie(intFilm - 1).setFavourite();
                        }
                        else if(intFilm > 5 && intFilm < 11){
                            newNetflixList.getShow(intFilm - 6).setFavourite();
                        }
                    }
                    break;
                case "2":
                    System.out.println();
                    System.out.println("Here is your list so far: ");
                    for(int i = 0; i < 10; i++){
                        if((i + 1) <= filmList.size()){
                            System.out.println("[" + filmList.get(i) + "]");
                        }
                        else{
                            System.out.println("[EMPTY]");
                        }
                    }
                    System.out.println("\nType any key to continue...");
                    sc.nextLine();
                    System.out.println("Would you like to add to your list? Yes/No");

                    // makes sure that second loop doesnt automatically open the list
                    blnList = false;
                    strChoice = sc.nextLine();

                    if(strChoice.equalsIgnoreCase("yes") && filmList.size() <= 10){
                        System.out.println("What show would you like to add? (Type the number of the film)");
                        System.out.println("Type '11' to stop adding films");
                        blnList = true;
                    }
                    else if(strChoice.equalsIgnoreCase("yes") && filmList.size() > 10){
                        while(true){
                            System.out.println("Your list is full! Which slot would you like to replace: ");
                            intSlot = sc.nextInt();
                            sc.nextLine();
                            if(intSlot <= 10 && intSlot > 0){
                                System.out.println("What show would you like to replace with? (Type the number of the film)");
                                intFilm = sc.nextInt();
                                sc.nextLine();
                                if(intFilm < 6){
                                    filmList.set(intSlot - 1, newNetflixList.getMovie(intFilm - 1).getName());
                                    objFilmList.set(intSlot - 1, newNetflixList.getMovie(intFilm - 1));
                                }
                                else if(intFilm > 5 && intFilm < 11){
                                    filmList.set(intSlot - 1, newNetflixList.getShow(intFilm - 6).getName());
                                    objFilmList.set(intSlot - 1, newNetflixList.getShow(intFilm - 6));
                                }      
                                break;
                            }
                            else{
                                System.out.println("Type a real option!");
                            }
                        }
                    }

                    while(blnList){     
                        intFilm = sc.nextInt();
                        sc.nextLine();   
                        if(intFilm < 6){
                            filmList.add(newNetflixList.getMovie(intFilm - 1).getName());  
                            objFilmList.add(newNetflixList.getMovie(intFilm - 1));  
                        }
                        else if(intFilm > 5 && intFilm < 11){
                            filmList.add(newNetflixList.getShow(intFilm - 6).getName());  
                            objFilmList.add(newNetflixList.getShow(intFilm - 6));  
                        }      
                        else if(intFilm == 11){
                            break;
                        }
                        else{
                            System.out.println("Type a real option!");
                        }
                    }
                    break;
                case "3":
                System.out.println("Based on your list, here are some recommendations: ");

                    // adds movie genres from user list to genreList
                    for(int i = 0; i < 5; i++){
                        genreList.add(newNetflixList.getMovie(i).getGenre());
                    }

                    // adds show genres from user list to genreList
                    for(int i = 0; i < 5; i++){
                        genreList.add(newNetflixList.getShow(i).getGenre());
                    }  
                    
                    // checks for genre and prints recommendation
                    for(int i = 0; i < filmList.size(); i++){
                        if(newNetflixList.getMovie(i).getName()){
                        }
                    }
                case "4":
                    blnMenu = false;
            }
        }
        sc.close();
    }
}
