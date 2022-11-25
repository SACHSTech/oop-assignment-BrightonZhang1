package Netflix;

public abstract class Film {
    private String strName;
    private String strType;
    private String strGenre;
    private String strDirector;
    private String strDate;
    private Double dblRating;

    public Film(String filmName, String filmType, String filmGenre, String filmDate,
    String filmDirector, Double filmRating){
        strName = filmName;
        strType = filmType;
        strGenre = filmGenre; 
        strDirector = filmDirector;
        strDate = filmDate;
        dblRating = filmRating;
    }

    public String getName() {
        return strName;
    }

    public String getType() {
        return strType;
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

    public String toString(){
        return getName();
    }

    public abstract void setUserRating();
}
