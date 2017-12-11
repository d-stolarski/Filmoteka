import java.util.Scanner;

public class ApplicationDatabase {
    Scanner scan = new Scanner(System.in);

    public static final int MAX_MOVIES_VALUE = 10;
    public static final int MAX_TVSERIES_VALUE = 10;
    public static final int MAX_ACTORS_VALUE = 10;

    private Movie[] movies = new Movie[10];
    private TvSeries[] tvSeries = new TvSeries[10];
    private Actor[] actors = new Actor[10];

    int regMovie = 0;
    int regTvSeries = 0;
    int regActor = 0;

    public Movie[] getMovie() {
        return movies;
    }

    public TvSeries[] getTvSeries() {
        return tvSeries;
    }

    public Actor[] getActors() {
        return actors;
    }

    public void addMovie() {
        System.out.println("DODAWANIE FILMU:");
        Movie movie = new Movie();
        System.out.println("Podaj tytuł filmu:");
        movie.setName(scan.nextLine());
        System.out.println("Podaj imię i nazwisko reżysera:");
        movie.setDirector(scan.nextLine());
        System.out.println("Podaj rok produkcji filmu:");
        int prodYear = scan.nextInt();
        if (prodYear > 0) {
            movie.setProductionYear(prodYear);
        } else {
            showError();
        }
        scan.nextLine();
        System.out.println("Podaj gatunek filmu:");
        movie.setGenre(scan.nextLine());
        System.out.println("Podaj opis filmu:");
        movie.setDescription(scan.nextLine());
        System.out.println("Podaj ocenę filmu:");
        double grade = scan.nextDouble();
        scan.nextLine();
        if (grade > 0 && grade <= 10.0) {
            movie.setRate(grade);
        } else {
            showError();
        }
        if (regMovie < MAX_MOVIES_VALUE) {
            movies[regMovie] = movie;
            regMovie++;
        } else {
            showNoSpaceError();
        }
    }

    public void addTvSeries() {
        System.out.println("DODAWANIE SERIALU:");
        TvSeries tvSerie = new TvSeries();
        System.out.println("Podaj tytuł serialu:");
        tvSerie.setName(scan.nextLine());
        System.out.println("Podaj liczbę sezonów:");
        int seasons = scan.nextInt();
        if (seasons > 0) {
            tvSerie.setSeasonsAmount(seasons);
        } else {
            showError();
        }
        System.out.println("Podaj liczbę odcinków:");
        int episodes = scan.nextInt();
        scan.nextLine();
        if (episodes > 0) {
            tvSerie.setEpisodesAmount(episodes);
        } else {
            showError();
        }
        System.out.println("Podaj producenta serialu:");
        tvSerie.setProducent(scan.nextLine());
        System.out.println("Podaj gatunek:");
        tvSerie.setGenre(scan.nextLine());
        System.out.println("Podaj opis:");
        tvSerie.setDescription(scan.nextLine());
        System.out.println("Podaj ocenę:");
        tvSerie.setRate(scan.nextDouble());
        scan.nextLine();
        if (regTvSeries < MAX_TVSERIES_VALUE) {
            tvSeries[regTvSeries] = tvSerie;
            regTvSeries++;
        } else {
            showNoSpaceError();
        }
    }

    public void addActors() {
        System.out.println("DODAWANIE AKTORA:");
        Actor actor = new Actor();
        System.out.println("Podaj imię aktora:");
        actor.setFirstName(scan.nextLine());
        System.out.println("Podaj nazwisko aktora:");
        actor.setLastName(scan.nextLine());
        System.out.println("Podaj kraj pochodzenia:");
        actor.setCountry(scan.nextLine());
        if (regActor < MAX_ACTORS_VALUE) {
            actors[regActor] = actor;
            regActor++;
        } else {
            showNoSpaceError();
        }
    }

    public void showInfo() {
        if (movies[0] != null) {
            System.out.println("DOSTĘPNE W BAZIE:");
            System.out.println("\nFILMY:");
            for (Movie mov : movies) {
                if (mov == null) {
                    continue;
                } else {
                    mov.showMovieInfo();
                }
            }
        }
        if (tvSeries[0] != null) {
            System.out.println("\nSERIALE:");
            for (TvSeries tv : tvSeries) {
                if (tv == null) {
                    continue;
                } else {
                    tv.showTvSeriesInfo();
                }
            }
        }
        if (actors[0] != null) {
            System.out.println("\nAKTORZY:");
            for (Actor actor : actors) {
                if (actor == null) {
                    continue;
                } else {
                    actor.showActorInfo();
                }
            }
        } else {
            System.out.println("Brak danych!");
        }
    }

    private void showError() {
        System.out.println("Błąd! Nie udało się utworzyć obiektu!");
    }

    private void showNoSpaceError() {
        System.out.println("Brak miejsca w tablicy.");
    }
}
