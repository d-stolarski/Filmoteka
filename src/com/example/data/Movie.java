package com.example.data;

public class Movie extends Item {

    private String director;
    private int productionYear;

    public Movie() {
    }

    public Movie(String name, String director, int productionYear, String genre, String description,
                 int rate) {
        setName(name);
        setDirector(director);
        setProductionYear(productionYear);
        setGenre(genre);
        setDescription(description);
        setRate(rate);
    }

    public void showMovieInfo() {
        System.out.printf("Tytuł: %s , reżyser: %s , rok produkcji: %d, gatunek: %s, opis: %s, ocena: %d\n", getName(),
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

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

}
