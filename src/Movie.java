public class Movie {

    private String name;
    private String director;
    private int productionYear;
    private String genre;
    private String description;
    private double rate;

    public Movie() {
    }

    public Movie(String name, String director, int productionYear, String genre, String description,
                 double rate) {
        setName(name);
        setDirector(director);
        setProductionYear(productionYear);
        setGenre(genre);
        setDescription(description);
        setRate(rate);
    }

    public void showInfo() {
        System.out.printf("Tytuł: %s , reżyser: %s , rok produkcji: %d, gatunek: %s, opis: %s, ocena: %.1f\n", getName(),
                getDirector(), getProductionYear(), getGenre(), getDescription(), getRate());
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

}
