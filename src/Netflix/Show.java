package Netflix;

public class Show extends Film{
    private int episodeLength;
    private int episodeNum;


    public Show(String filmName, String filmType, String filmGenre, String filmDate, String filmDirector, Double filmRating, int showEpisodeLength, int showEpisodeNum) {
        super(filmName, filmType, filmGenre, filmDate, filmDirector, filmRating);
        episodeLength = showEpisodeLength;
        episodeNum = showEpisodeNum;
    }

    public int getEpisodeLength(){
        return episodeLength;
    }

    public int getEpisodeNum(){
        return episodeNum;
    }
}
