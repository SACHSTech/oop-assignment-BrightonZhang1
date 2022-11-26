package Netflix;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main Class File
 * @author: Brighton Zhang
 */

public class Main {
    static BufferedReader keyboard;
    public static void main (String[] args) throws IOException {
        
        // Variable and object instantiation
        String strUser;
        String strChoice;
        int intFilm;
        int intSlot;
        int intCounter;
        boolean blnSuperHero, blnCrime , blnAdventure, blnComedy, blnSciFi, blnDrama, blnHorror;
        boolean blnMenu = true;
        boolean blnList = false;
        Scanner sc = new Scanner(System.in);        
        ArrayList<String> filmList = new ArrayList<String>();
        ArrayList<String> genreList = new ArrayList<String>();
        ArrayList<Film> objFilmList = new ArrayList<Film>();

        // Initializing list
        NetflixList newNetflixList = new NetflixList();

        System.out.println("Welcome to netflix list! Please state your name:");
        strUser = sc.nextLine();
        System.out.println("Hi there " + strUser + "! Here are your shows for today.");
        System.out.println();

        // Main loop
        while(blnMenu){

            // Displays films
            newNetflixList.getFilms();
            System.out.println();
            System.out.println("What would you like to do?");
            System.out.println("1. Browse films (Film details)\n2. Customize Lists\n3. Recommendations\n4. Exit");
            System.out.println();
            
            strChoice = sc.nextLine();
            switch(strChoice){
                case "1":
                    System.out.println("Which film would you like to browse? (Type the number of the film): ");
                    intFilm = sc.nextInt();
                    sc.nextLine();
                    System.out.println();

                    // Gets movies and shows to display
                    if(intFilm < 6){
                        System.out.println(newNetflixList.getMovie(intFilm - 1));
                    }
                    else if(intFilm > 5){
                        System.out.println(newNetflixList.getShow(intFilm - 6));
                    }

                    // Uses setter method to set film as "favourite"
                    System.out.println("Type 'favourite' if you would like to favourite this film.\nType anything else to continue");
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

                    // Displays all films in the user's list
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

                    // Makes sure that second loop doesnt automatically open the list
                    blnList = false;
                    strChoice = sc.nextLine();

                    if(strChoice.equalsIgnoreCase("yes") && filmList.size() <= 10){
                        System.out.println("What film would you like to add? (Type the number of the film)");
                        System.out.println("Type '11' to stop adding films");
                        blnList = true;
                    }

                    // This occurs when the user's list is full
                    else if(strChoice.equalsIgnoreCase("yes") && filmList.size() > 10){
                        while(true){
                            System.out.println("Your list is full! Which slot would you like to replace: ");
                            intSlot = sc.nextInt();
                            sc.nextLine();

                            // Sets the user's selected slot on their list with a show the user wants
                            if(intSlot <= 10 && intSlot > 0){
                                System.out.println("What film would you like to replace with? (Type the number of the film)");
                                intFilm = sc.nextInt();
                                sc.nextLine();

                                // Sets films for both the object and string array
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

                    // Loops until user decides to exit
                    while(blnList){     
                        intFilm = sc.nextInt();
                        sc.nextLine();   

                        // Adds user selected films
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
                System.out.println();

                // Booleans used to make sure recommendations don't repeat
                blnSuperHero = false;
                blnCrime = false;
                blnAdventure = false;
                blnComedy = false;
                blnDrama = false;
                blnHorror = false;
                blnSciFi = false;

                    // Adds genres from user list to genreList
                    for(int i = 0; i < objFilmList.size(); i++){
                        genreList.add(objFilmList.get(i).getGenre());
                    }

                    // Counter variable used to count number of recommended shows
                    intCounter = 1;

                    // For loop used to check all genres of films in user list and assigns a recommendation
                    for(int i = 0; i < genreList.size(); i++){

                        // If statements check to see if the films in the user list contain a specific genre
                        if(genreList.get(i).contains("Superhero") && !blnSuperHero){
                            System.out.println(intCounter + ". Spider-Man: No Way Home");
                            blnSuperHero = true;
                            intCounter++;
                        }

                        if(genreList.get(i).contains("Crime") && !blnCrime){
                            System.out.println(intCounter + ". Prison Break");
                            blnCrime = true;
                            intCounter++;
                        }

                        if(genreList.get(i).contains("Adventure") && !blnAdventure){
                            System.out.println(intCounter + ". Game of Thrones");
                            blnAdventure = true;
                            intCounter++;
                        }

                        if(genreList.get(i).contains("Comedy") && !blnComedy){
                            System.out.println(intCounter + ". 21 Jump Street");
                            blnComedy = true;
                            intCounter++;
                        }

                        if(genreList.get(i).contains("Drama") && !blnDrama){
                            System.out.println(intCounter + ". The Shawshank Redemption");
                            blnDrama = true;
                            intCounter++;
                        }

                        if(genreList.get(i).contains("Horror") && !blnHorror){
                            System.out.println(intCounter + ". The Walking Dead");
                            blnHorror = true;
                            intCounter++;
                        }

                        if(genreList.get(i).contains("Sci-Fi") && !blnSciFi){
                            System.out.println(intCounter + ". Star Wars");
                            blnSciFi = true;
                            intCounter++;
                        }
                    }
                    System.out.println("Type any key to continue: ");
                    System.out.println();
                    sc.nextLine();
                    System.out.println();
                    break;
                case "4":
                    // Exits the program
                    blnMenu = false;
            }
        }
        sc.close();
    }
}
