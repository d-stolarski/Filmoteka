public class TvSeries {

    private String name;
    private int seasonsAmount;
    private int episodesAmount;
    private String producent;
    private String genre;
    private String description;
    private double rate;

    public TvSeries() {
    }

    public TvSeries(String name, int seasonsAmount, int episodesAmount, String producent, String genre, String description, double rate) {
        setName(name);
        setSeasonsAmount(seasonsAmount);
        setEpisodesAmount(episodesAmount);
        setProducent(producent);
        setGenre(genre);
        setDescription(description);
        setRate(rate);
    }

    public void showInfo() {
        System.out.printf("Tytuł: %s , ilość sezonów: %d , ilość odcinków: %d, producent: %s, " +
                        "gatunek: %s, opis: %s, ocena: %.1f\n", getName(),
                getSeasonsAmount(), getEpisodesAmount(), getProducent(), getGenre(), getDescription(), getRate());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeasonsAmount() {
        return seasonsAmount;
    }

    public void setSeasonsAmount(int seasonsAmount) {
        this.seasonsAmount = seasonsAmount;
    }

    public int getEpisodesAmount() {
        return episodesAmount;
    }

    public void setEpisodesAmount(int episodesAmount) {
        this.episodesAmount = episodesAmount;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
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
