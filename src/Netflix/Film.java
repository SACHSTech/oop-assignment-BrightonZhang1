package Netflix;

public abstract class Film {
    private String strName;
    private String strGenre;
    private String strDirector;
    private String strMainCharacter;
    private Integer intRating;

    public Film(String filmName, String filmGenre, String filmMainCharacter, 
    String filmDirector, Integer filmRating){
        filmName = strName;
        filmGenre = strGenre; 
        filmDirector = strDirector;
        filmMainCharacter = strMainCharacter;
        filmRating = intRating;
    }
}
