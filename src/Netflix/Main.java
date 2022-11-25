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


        // Initializing list
        NetflixList newNetflixList = new NetflixList();
        // test: newNetflixList.Interstellar.getMovieLength();
        // newNetflixList.Interstellar.setRating(); changes user rating

        System.out.println("Welcome to netflix list! Please state your name:");
        strUser = sc.nextLine();
        System.out.println("Hi there " + strUser + "! Here are your shows for today.");
        System.out.println();

        while(blnMenu){
            newNetflixList.getFilms();
            System.out.println();
            System.out.println("What would you like to do?");
            System.out.println("1. Browse films (Film details)\n2. Customize Lists\n3. Ratings\n4. Exit");
            System.out.println();
            
            strChoice = sc.nextLine();
            switch(strChoice){
                case "1":
                    System.out.println("Which show would you like to browse? (Type the number of the film): ");
                    intFilm = sc.nextInt();
                    System.out.println();
                    if(intFilm < 6){
                        System.out.println(newNetflixList.getMovie(intFilm - 1));
                    }
                    else if(intFilm > 5){
                        System.out.println(newNetflixList.getShow(intFilm - 6));
                    }
                    sc.nextLine();
                    System.out.println("Type something to continue");
                    sc.nextLine();
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

                    if(sc.nextLine().equalsIgnoreCase("yes") && filmList.size() <= 10){
                        System.out.println("What show would you like to add? (Type the number of the film)");
                        System.out.println("Type '11' to stop adding films");
                        blnList = true;
                    }
                    else if(sc.nextLine().equalsIgnoreCase("yes") && filmList.size() > 10){
                        System.out.println("Your list is full! Which slot would you like to replace: ");
                        intSlot = sc.nextInt();
                        sc.nextLine();
                        if(intSlot <= 10 && intSlot > 0){
                            System.out.println("What show would you like to replace with? (Type the number of the film)");
                            
                        }
                        else{

                        }
                    }

                    while(blnList){     
                        intFilm = sc.nextInt();
                        sc.nextLine();   
                        if(intFilm < 6){
                            filmList.add(newNetflixList.getMovie(intFilm - 1).getName());  
                        }
                        else if(intFilm > 5 && intFilm < 11){
                            filmList.add(newNetflixList.getShow(intFilm - 6).getName());  
                        }      
                        else if(intFilm == 11){
                            break;
                        }
                        else{
                            System.out.println("Type a real option!");
                        }
                    }
                    break;
            }
        }
        sc.close();
    }
}
