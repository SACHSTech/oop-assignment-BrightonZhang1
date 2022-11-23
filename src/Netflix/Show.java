package Netflix;

public class Show extends Film{
    private int episodeLength;
    private int episodeNum;


    public Show(String filmName, String filmType,  String filmGenre, String filmMainCharacter, String filmDirector, Double filmRating, int showEpisodeLength, int showEpisodeNum) {
        super(filmName, filmType, filmGenre, filmMainCharacter, filmDirector, filmRating);
        episodeLength = showEpisodeLength;
        episodeNum = showEpisodeNum;
    }
}
