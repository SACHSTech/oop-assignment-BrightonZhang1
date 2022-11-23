package Netflix;

public class Anime extends Film{
    String studio;
    public Anime(String filmName, String filmType, String filmGenre, String filmMainCharacter, String filmDirector, Double filmRating, String animeStudio) {
        super(filmName, filmType, filmGenre, filmMainCharacter, filmDirector, filmRating);
        studio = animeStudio;
    }  
}
