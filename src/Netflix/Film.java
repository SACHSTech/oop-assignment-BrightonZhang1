package Netflix;

public abstract class Film {
    private String strName;
    private String strGenre;
    private String strDirector;
    private String strDate;
    private Double dblRating;

    public Film(String filmName, String filmGenre, String filmDate, 
    String filmDirector, Double filmRating){
        strName = filmName;
        strGenre = filmGenre; 
        strDirector = filmDirector;
        strDate = filmDate;
        dblRating = filmRating;
    }

    public String getName() {
        return strName;
    }

    public String getGenre() {
        return strGenre;
    }

    public String getDirector() {
        return strDirector;
    }

    public String getPublishDate() {
        return strDate;
    }

    public Double getRating() {
        return dblRating;
    }

    //public abstract 
}
